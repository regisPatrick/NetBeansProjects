/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springbootessentials.SpringBootEssentials.handler;

import com.springbootessentials.SpringBootEssentials.error.ErrorDetails;
import com.springbootessentials.SpringBootEssentials.error.ResourceNotFoundDetails;
import com.springbootessentials.SpringBootEssentials.error.ResourceNotFoundException;
import com.springbootessentials.SpringBootEssentials.error.ValidationErrorDetails;
import static com.sun.tools.javac.util.List.collector;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.lang.Nullable;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import org.springframework.web.util.WebUtils;

/**
 *
 * @author user
 */
@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler{
    
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<?> handleResourceNotFoundException(ResourceNotFoundException rnfException){
        ResourceNotFoundDetails rnfDetails = ResourceNotFoundDetails.Builder
                .newBuilder()
                .timestamp(new Date().getTime())
                .status(HttpStatus.NOT_FOUND.value())
                .title("Resource not found")
                .detail(rnfException.getMessage())
                .developerMessage(rnfException.getClass().getName())
                .build();
                
        return new ResponseEntity<>(rnfDetails, HttpStatus.NOT_FOUND);
    }
    
//    @ExceptionHandler(MethodArgumentNotValidException.class) //Como sobreescrevemos este método removemos essa anotação, senão vamos ter uma exceção de recurso duplicado.
    @Override
    public ResponseEntity<Object> handleMethodArgumentNotValid(
			MethodArgumentNotValidException manvException,
                        HttpHeaders headers, 
                        HttpStatus status, 
                        WebRequest request) {
        List<FieldError> fieldErrors = manvException.getBindingResult().getFieldErrors();
//        System.out.println(fieldErrors);
        String fields = fieldErrors.stream().map(FieldError::getField).collect(Collectors.joining(","));
        String fieldMessages = fieldErrors.stream().map(FieldError::getDefaultMessage).collect(Collectors.joining(","));
        ValidationErrorDetails veDetails = ValidationErrorDetails.Builder
                .newBuilder()
                .timestamp(new Date().getTime())
                .status(HttpStatus.BAD_REQUEST.value())
                .title("Field Validation Error")
                .detail("Field Validation Error")
                .developerMessage(manvException.getClass().getName())
                .field(fields)
                .fieldMessage(fieldMessages)
                .build();
                
        return new ResponseEntity<>(veDetails, HttpStatus.BAD_REQUEST);
    }
    
//    @Override
//    protected ResponseEntity<Object> handleHttpMessageNotReadable(
//                                                        HttpMessageNotReadableException ex, 
//                                                        HttpHeaders headers, 
//                                                        HttpStatus status, 
//                                                        WebRequest request) {
//
//        ErrorDetails errorDetails = ErrorDetails.Builder
//                .newBuilder()
//                .timestamp(new Date().getTime())
//                .status(HttpStatus.NOT_FOUND.value())
//                .title("Resource not found")
//                .detail(ex.getMessage())
//                .developerMessage(ex.getClass().getName())
//                .build();
//		
//        return new ResponseEntity<>(errorDetails, HttpStatus.BAD_REQUEST);        
//    }
    
    @Override
    protected ResponseEntity<Object> handleExceptionInternal(
			Exception ex, 
                        @Nullable Object body, 
                        HttpHeaders headers, 
                        HttpStatus status, 
                        WebRequest request) {

		ErrorDetails errorDetails = ErrorDetails.Builder
                .newBuilder()
                .timestamp(new Date().getTime())
                .status(status.value())
                .title("Internal Exception")
                .detail(ex.getMessage())
                .developerMessage(ex.getClass().getName())
                .build();
		return new ResponseEntity<>(errorDetails, headers, status);
	}
    
}

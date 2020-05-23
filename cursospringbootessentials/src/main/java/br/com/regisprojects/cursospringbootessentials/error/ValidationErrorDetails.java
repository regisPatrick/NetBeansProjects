/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.regisprojects.cursospringbootessentials.error;

/**
 *
 * @author user
 */
public class ValidationErrorDetails extends ErrorDetail {

    private String field;
    private String fieldMessage;

    public String getField() {
        return field;
    }

    public String getFieldMessage() {
        return fieldMessage;
    }

    public static final class Builder {

        private String title;
        private int status;
        private String detail;
        private long timestamp;
        private String developerMessage;
        private String field;
        private String fieldMessage;

        private Builder() {

        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder status(int status) {
            this.status = status;
            return this;
        }

        public Builder detail(String detail) {
            this.detail = detail;
            return this;
        }

        public Builder timestamp(long timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public Builder developerMessage(String developerMessage) {
            this.developerMessage = developerMessage;
            return this;
        }
        
        public Builder field(String field) {
            this.field = field;
            return this;
        }
        
        public Builder fieldMessage(String fieldMessage) {
            this.fieldMessage = fieldMessage;
            return this;
        }

//        public ResourceNotFoundDetails build() {
//            ResourceNotFoundDetails resourceNotFoundDetails = new ResourceNotFoundDetails();
//            resourceNotFoundDetails.developerMessage = this.developerMessage;
//            resourceNotFoundDetails.title = this.title;
//            resourceNotFoundDetails.detail = this.detail;
//            resourceNotFoundDetails.timestamp = this.timestamp;
//            resourceNotFoundDetails.status = this.status;
//            return resourceNotFoundDetails;
//        }
        public ValidationErrorDetails build() {
            ValidationErrorDetails validationErrorDetails = new ValidationErrorDetails();
            validationErrorDetails.setDeveloperMessage(developerMessage);
            validationErrorDetails.setTitle(title);
            validationErrorDetails.setDetail(detail);
            validationErrorDetails.setTimestamp(timestamp);
            validationErrorDetails.setStatus(status);
            return validationErrorDetails;
        }

    }

}

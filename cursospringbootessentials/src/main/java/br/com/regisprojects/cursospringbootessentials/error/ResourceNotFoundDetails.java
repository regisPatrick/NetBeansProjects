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
public class ResourceNotFoundDetails extends ErrorDetail{
    
//    private String title;
//    private int status;
//    private String detail;
//    private long timestamp;
//    private String developerMessage;
//
//    private ResourceNotFoundDetails() {
//    
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public int getStatus() {
//        return status;
//    }
//
//    public String getDetail() {
//        return detail;
//    }
//
//    public long getTimestamp() {
//        return timestamp;
//    }
//
//    public String getDeveloperMessage() {
//        return developerMessage;
//    }
    
    public static final class Builder{
        private String title;
        private int status;
        private String detail;
        private long timestamp;
        private String developerMessage;
        
        private Builder(){
            
        }
        
        public static Builder newBuilder(){
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
        
        public Builder detail(String detail){
            this.detail = detail;
            return this;
        }
        
        public Builder timestamp(long timestamp){
            this.timestamp = timestamp;
            return this;
        }
        
        public Builder developerMessage(String developerMessage){
            this.developerMessage = developerMessage;
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
        
        public ResourceNotFoundDetails build() {
            ResourceNotFoundDetails resourceNotFoundDetails = new ResourceNotFoundDetails();
            resourceNotFoundDetails.setDeveloperMessage(developerMessage);
            resourceNotFoundDetails.setTitle(title);
            resourceNotFoundDetails.setDetail(detail);
            resourceNotFoundDetails.setTimestamp(timestamp);
            resourceNotFoundDetails.setStatus(status);
            return resourceNotFoundDetails;
        }
        
    }
    
}

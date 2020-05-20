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
public class ResourceNotFoundDetails {
    
    private String title;
    private int status;
    private String details;
    private long timestamp;
    private String developerMessage;

    private ResourceNotFoundDetails() {
    
    }

    public String getTitle() {
        return title;
    }

    public int getStatus() {
        return status;
    }

    public String getDetails() {
        return details;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public String getDeveloperMessage() {
        return developerMessage;
    }
    
    public static final class ResourceNotFoundDetailsBuilder{
        private String title;
        private int status;
        private String detail;
        private long timestamp;
        private String developerMessage;
        
        private ResourceNotFoundDetailsBuilder(){
            
        }
        
        public static ResourceNotFoundDetailsBuilder aResourceNotFoundDetails(){
            return new ResourceNotFoundDetailsBuilder();
        }
        
        public ResourceNotFoundDetailsBuilder title(String title) {
            this.title = title;
            return this;
        }
        
    }
    
}

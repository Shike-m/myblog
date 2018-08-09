package com.ms.myblog.vo;

/*
For the Restful target, to return for the state and data.

 */
public class Reponse {

    private boolean success;  //callback is successful?
    private String message;   //message from callback
    private Object body;    //returned data.

    public Reponse(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public Reponse(boolean success, String message, Object body) {
        this.success = success;
        this.message = message;
        this.body = body;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getBody() {
        return body;
    }

    public void setBody(Object body) {
        this.body = body;
    }
}

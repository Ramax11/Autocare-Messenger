package com.apinfotech.autocare.model;

/**
 * Created by InfotechB on 10/04/2017.
 */

public class Message {
    private String created_at;
    private String phone_no;
    private String message;
    private boolean sent;
    private String sent_timestamp;

    public void Message() {

    }

    public void Message(String created_at, String phone_no, String message, boolean sent, String sent_timestamp){
        this.created_at=created_at;
        this.phone_no=phone_no;
        this.message=message;
        this.sent=sent;
        this.sent_timestamp=sent_timestamp;
    }

    public String getCreated_at() {
        return created_at;
    }
    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }
    public String getPhone_no() {
        return phone_no;
    }
    public void setPhone_no(String phone_no) {
        this.phone_no = phone_no;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isSent() {
        return sent;
    }

    public void setSent(boolean sent) {
        this.sent = sent;
    }

    public String getSent_timestamp() {
        return sent_timestamp;
    }

    public void setSent_timestamp(String sent_timestamp) {
        this.sent_timestamp = sent_timestamp;
    }
}

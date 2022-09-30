package com.example.EmailService;

public class Mail{
    private String to;
    private String subject;
    private String emailBody;
    private String copy;
    private String attachment;
    
    public String getTo() {
        return to;
    }
    public void setTo(String to) {
        this.to = to;
    }
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public String getEmailBody() {
        return emailBody;
    }
    public void setEmailBody(String emailBody) {
        this.emailBody = emailBody;
    }
    public String getCopy() {
        return copy;
    }
    public void setCopy(String copy) {
        this.copy = copy;
    }
    public String getAttachment() {
        return attachment;
    }
    public void setAttachment(String attachment) {
        this.attachment = attachment;
    }
    
}
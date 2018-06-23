package email.sender.controller.vo;

import org.springframework.util.StringUtils;

public class EmailSendRequest {
    private String to;
    private String subject;
    private String body;

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

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override public String toString() {
        StringBuilder sb = new StringBuilder("EmailSendRequest: ");
        sb.append("to=").append(this.to).append("; ");
        sb.append("subject=").append(this.subject).append("; ");
        sb.append("body=").append(this.body);
        return sb.toString();
    }
}

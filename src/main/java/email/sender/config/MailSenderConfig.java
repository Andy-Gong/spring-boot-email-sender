package email.sender.config;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("mail")
public class MailSenderConfig {
    private String host;
    private int port;
    private String username;
    private String password;
    private boolean smtpAuth;
    private String socketFactoryClass;
    private boolean smtpStarttlsEnable;

    public boolean isSmtpAuth() {
        return smtpAuth;
    }

    public void setSmtpAuth(boolean smtpAuth) {
        this.smtpAuth = smtpAuth;
    }

    public boolean isSmtpStarttlsEnable() {
        return smtpStarttlsEnable;
    }

    public void setSmtpStarttlsEnable(boolean smtpStarttlsEnable) {
        this.smtpStarttlsEnable = smtpStarttlsEnable;
    }

    public String getSocketFactoryClass() {
        return socketFactoryClass;
    }

    public void setSocketFactoryClass(String socketFactoryClass) {
        this.socketFactoryClass = socketFactoryClass;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override public String toString() {
        StringBuffer sb = new StringBuffer("MailSenderConfig: ");
        sb.append("host=" + this.host).append("; ");
        sb.append("port=" + this.port).append("; ");
        sb.append("username=" + this.username).append("; ");
        sb.append("password=" + this.password).append("; ");
        sb.append("smtpAuth=" + this.smtpAuth).append("; ");
        sb.append("socketFactoryClass=" + this.socketFactoryClass).append("; ");
        sb.append("smtpStarttlsEnable=" + this.smtpStarttlsEnable);
        return sb.toString();
    }
}

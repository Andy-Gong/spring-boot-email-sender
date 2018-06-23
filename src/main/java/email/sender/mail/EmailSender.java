package email.sender.mail;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Service;
import email.sender.config.MailSenderConfig;

import javax.annotation.PostConstruct;

import java.util.Properties;

@Service
public class EmailSender {
    private static final Logger LOGGER = LoggerFactory.getLogger(EmailSender.class);
    private MailSenderConfig mailSenderConfig;

    private MailSender mailSender;

    @Autowired
    public EmailSender(MailSenderConfig mailSenderConfig) {
        this.mailSenderConfig = mailSenderConfig;
    }

    @PostConstruct
    void init() {
        mailSender = newJavaMailSender();
    }

    public MailSender getMailSender() {
        if (mailSender == null) {
            mailSender = newJavaMailSender();
        }
        return mailSender;
    }

    private MailSender newJavaMailSender() {
        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
        mailSender.setHost(mailSenderConfig.getHost());
        mailSender.setPort(mailSenderConfig.getPort());

        mailSender.setUsername(mailSenderConfig.getUsername());
        mailSender.setPassword(mailSenderConfig.getPassword());

        Properties props = mailSender.getJavaMailProperties();
        props.put("mail.transport.protocol", "smtp");
        props.put("mail.smtp.auth", mailSenderConfig.isSmtpAuth());
        props.put("mail.smtp.starttls.enable", mailSenderConfig.isSmtpStarttlsEnable());
        props.put("mail.smtp.socketFactory.class", mailSenderConfig.getSocketFactoryClass());
        props.put("mail.debug", "true");
        LOGGER.info("Init email sender, config properties: " + mailSenderConfig.toString());
        return mailSender;
    }
}

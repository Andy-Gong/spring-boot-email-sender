package email.sender.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import email.sender.controller.vo.EmailSendRequest;
import email.sender.mail.EmailService;

@RestController
public class SendEamilController {

    private static final Logger LOGGER = LoggerFactory.getLogger(SendEamilController.class);
    @Autowired
    private EmailService emailService;

    @RequestMapping(path = "/send", method = RequestMethod.POST)
    public String get(EmailSendRequest request) {
        LOGGER.info("Receive email send request: " + request.toString());
        emailService.sendEmail(request.getTo(), request.getSubject(), request.getBody());
        LOGGER.info("Send email successfully! ");
        return "success";
    }
}

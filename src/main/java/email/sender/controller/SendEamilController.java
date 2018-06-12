package email.sender.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import email.sender.controller.vo.EmailSendRequest;
import email.sender.mail.EmailService;

@RestController
public class SendEamilController {

    @Autowired
    private EmailService emailService;

    @RequestMapping(path = "/send", method = RequestMethod.POST)
    public String get(EmailSendRequest request) {
        emailService.sendEmail(request.getTo(), request.getSubject(), request.getBody());
        return "success";
    }
}

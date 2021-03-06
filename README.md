# spring-boot-email-sender
This project provides a easy way to send email via SMTP service.

### clone project
```
https://github.com/Andy-Gong/spring-boot-email-sender.git
```
### update mail.username and mail.password to your email account in application.properties
   ```
   ... ...
   mail.username=username // replace it with your google username
   mail.password=password // replace it with your google password
   ... ...
   ```
### build project
```
mvn clean install
```
### start applicaiton
```
cd target/

java -jar email-sender-0.0.1-SNAPSHOT.jar
```
## API
Endpoint: http://localhost:8080/send, 

HTTPMETHOD: POST

Body:

| Field     | Type    | Description |
| --------|---------|-------|
| to  | String   | The email address you want so send to.  |
| subject | String | The subject of email.   |
| body | String | The content of email.   |

## Quickstart
After application starts, you can call the api as below, then you will receive the email.

Example:
   ```
   curl -X POST \
  http://localhost:8080/send \
  -F to=xxxxx@gmail.com \
  -F 'subject=test send email' \
  -F 'body=Hi, Guys, this is testing to send email via SMTP service'
   ```
## Troubleshoot
Application logs are in /tmp/application.log file.

### API request log:
```
2018-06-23 17:41:31 [http-nio-8080-exec-2] INFO  e.s.controller.SendEamilController - Receive email send request: EmailSendRequest: to=xiaochuan.gong@zuora.com; subject=test send email; body=Hi, Guys, this is testing to send email via SMTP service
```
### Email send log:
```
2018-06-23 17:41:40 [http-nio-8080-exec-2] INFO  email.sender.mail.EmailService - ->>>> Send email successfully, and mail message is SimpleMailMessage: from=null; replyTo=null; to=xiaochuan.gong@zuora.com; cc=; bcc=; sentDate=null; subject=test send email; text=Hi, Guys, this is testing to send email via SMTP service
```
### Solve error javax.mail.AuthenticationFailedException:
When the exception happens, it maybe that your google email account can't turn on access, see here: https://support.google.com/accounts/answer/6010255?hl=en

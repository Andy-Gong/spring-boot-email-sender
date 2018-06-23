# spring-boot-email-sender
This project provides a easy way to send email via SMTP service.

### clone project
```
https://github.com/Andy-Gong/spring-boot-email-sender.git
```
### update mail.username and mail.password to your email account in application.properties
   ```
   ... ...
   mail.username=username // replace it with your username
   mail.password=password // replace it with your password
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

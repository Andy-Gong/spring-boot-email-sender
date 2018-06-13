# spring-boot-email-sender
This project provides function to send email via SMTP service.

## clone project
```
git clone git@github.com:Andy-Gong/spring-boot-email-sender.git
```
## build project
```
mvn clean install
```
## run applicaiton
```
cd target/

java -jar email-sender-0.0.1-SNAPSHOT.jar
```
## update mail.username and mail.password to your email account in application.properties
   ```
   mail.host=smtp.gmail.com
   mail.port=587
   mail.username=username // replace it with your username
   mail.password=password // replace it with your password
   mail.smtp-auth=true
   mail.smtp-starttls-enable=true
   mail.socketFactory-class=javax.net.ssl.SSLSocketFactory
   ```
## run application
## once app is started, you can send email via api
   ```
   curl -X POST \
  http://localhost:8080/send \
  -F to=xiaochuan.gong@zuora.com \
  -F 'subject=test send email' \
  -F 'body=Hi, Guys, this is testing to send email via SMTP service'
   ```

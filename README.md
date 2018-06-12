# spring-boot-email-sender

## git clone git@github.com:Andy-Gong/spring-boot-email-sender.git
## mvn clean install
## update mail.username and mail.password to your email account in application.properties
   ```
   mail.host=smtp.gmail.com
   mail.port=587
   mail.username=username // replace here with your username
   mail.password=password // replace here with your password
   mail.smtp-auth=true
   mail.smtp-starttls-enable=true
   mail.socketFactory-class=javax.net.ssl.SSLSocketFactory
   ```
## Start application
## Once app is started, sending email via api
   ```
   curl -X POST \
  http://localhost:8080/send \
  -F to=xiaochuan.gong@zuora.com \
  -F 'subject=test send email' \
  -F 'body=Hi, Guys, this is testing to send email via SMTP service'
   ```

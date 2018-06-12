# spring-boot-email-sender

## git clone git@github.com:Andy-Gong/spring-boot-email-sender.git
## mvn clean install
## update mail.username and mail.password to your email account in application.properties
## Start application
## Once app is started, sending email via api
   ```
   curl -X POST \
  http://localhost:9010/send \
  -F to=xiaochuan.gong@zuora.com \
  -F 'subject=test send email' \
  -F 'body=Hi, Guys, this is testing to send email via SMTP service'
   ```

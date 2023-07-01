
package Jframe;
import library_management.*;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;

public class MailSystem {
    public static void sendMail(String name, String email, String OTP) throws MessagingException {
        System.out.println("Preparing to send Mail.....");

        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");

        String myGmailAc = "rrayhankhan4@gmail.com";
        String password = "";

        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(myGmailAc, password);
            }
        });

        Message message = preparMessage(session,email, myGmailAc, name, OTP);
        if (message != null) {
            Transport.send(message);
            System.out.println("Email sent successfully!");
        } else {
            System.out.println("Failed to prepare message!");
        }
    }

    private static Message preparMessage(Session session,String email, String myGmailAc,  String name, String OTP) throws MessagingException {
        try {
            Message message =  new MimeMessage(session);
            message.setFrom(new InternetAddress(myGmailAc));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(email));
            message.setSubject("OTP");
            String inbox = "Dear "+name+", "
            +"\n\nWelcome to IntelliLibrary!"
            +"\n\nUse OTP:  "+OTP+" to proceed with within SignUp new account."+
            "\nThis OTP will be valid for 1 minute. Do not share it with anyone"+
            "\n\n\n**This is an auto generated e-mail. Please do not reply to this e-mail.";
            message.setText(inbox);
            return message;
        } catch (MessagingException ex) {
            System.out.println("Failed to prepare message: " + ex.getMessage());
            throw ex;
        }
    }
    
    public static void main(String[] args) {
    try {
        MailSystem.sendMail("Rayhan", "rayhankhan1226@gmail.com", "123456");
    } catch (MessagingException e) {
        System.out.println("Failed to send email: " + e.getMessage());
    }
}
}

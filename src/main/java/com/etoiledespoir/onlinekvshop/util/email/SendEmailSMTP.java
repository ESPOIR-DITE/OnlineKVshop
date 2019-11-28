package com.etoiledespoir.onlinekvshop.util.email;

import com.sun.mail.smtp.SMTPTransport;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import java.util.Date;
import java.util.Properties;

public class SendEmailSMTP {

    private static final String SMTP_SERVER = "smtp.sendgrid.net";
    private static final String USERNAME = "apikey";
    


    private static final String EMAIL_TO_CC = "";

    public static void sendGrid(String email, int index, String code) {
        // for example, smtp.mailgun.org
        System.out.println("sending message from "+EMAIL_FROM+"  to "+email);
        String EMAIL_SUBJECT = "Welcome on OKVS board";
        String EMAIL_TEXT = decode(index)+"  <a href="+code +">"+code+"</a>";
        String EMAIL_TO = email;

        Properties prop = System.getProperties();
        prop.put("mail.smtp.host", SMTP_SERVER); //optional, defined in SMTPTransport
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.port", "25"); // default port 25

        Session session = Session.getInstance(prop, null);
        Message msg = new MimeMessage(session);

        try {

            // from
            msg.setFrom(new InternetAddress(EMAIL_FROM));

            // to
            msg.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(EMAIL_TO, false));

            // cc
            // msg.setRecipients(Message.RecipientType.CC,
            //   InternetAddress.parse(EMAIL_TO_CC, false));

            // subject
            msg.setSubject(EMAIL_SUBJECT);

            // content
            msg.setText(EMAIL_TEXT);

            msg.setSentDate(new Date());

            // Get SMTPTransport
            SMTPTransport t = (SMTPTransport) session.getTransport("smtp");

            // connect
            t.connect(SMTP_SERVER, USERNAME, PASSWORD);

            // send
            t.sendMessage(msg, msg.getAllRecipients());

            System.out.println("Response: " + t.getLastServerResponse());

            t.close();

        } catch (MessagingException e) {
            e.printStackTrace();
        }

    }
    public static String decode(int code){
        switch (code){
            case 001:
                return "Thank you for registering on our system\nTo confirm your registration please click on the following link\n";
        }
        return null;
    }

}

package com.etoiledespoir.onlinekvshop.util.sendGrid;

import com.sendgrid.*;
import java.io.IOException;

public class Example2 {
    public static void main(String[] args) throws IOException {
        String subject = "Sending with Twilio SendGrid is Fun";
        Email to = new Email("espoirditekemena@gmail.com");
        Content content = new Content("text/plain", "and easy to do anywhere, even with Java");
        Mail mail = new Mail(from, subject, to, content);

        Request request = new Request();
        try {
            request.setMethod(Method.POST);
            request.setEndpoint("mail/send");
            request.setBody(mail.build());
            Response response = sg.api(request);
            System.out.println(response.getStatusCode());
            System.out.println(response.getBody());
            System.out.println(response.getHeaders());
        } catch (IOException ex) {
            throw ex;
        }
    }
}

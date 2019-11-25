package com.etoiledespoir.onlinekvshop.util.sendGrid;

import java.io.IOException;
import com.sendgrid.*;


public class Example {
    public static void main(String[] args) throws IOException {
        try {
            SendGrid sg = new SendGrid(System.getenv("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"));
            Request request = new Request();
            request.setMethod(Method.POST);
            request.setEndpoint("mail/send");
            request.setBody("{\"personalizations\":[{\"to\":[{\"email\":\"ismailcharlsk@gmail.com\"}],\"subject\":\"Sending with Twilio SendGrid is Fun\"}],\"from\":{\"email\":\"216093805@mycput.ac.za\"},\"content\":[{\"type\":\"text/plain\",\"value\": \"and easy to do anywhere, even with Java\"}]}");
            Response response = sg.api(request);
            System.out.println(response.getStatusCode());
            System.out.println(response.getBody());
            System.out.println(response.getHeaders());
        } catch (IOException ex) {
            throw ex;
        }
    }
}
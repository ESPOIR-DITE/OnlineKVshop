package com.etoiledespoir.onlinekvshop.util.email;

import com.etoiledespoir.onlinekvshop.util.MailHTML;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class SendEmailSMTP {

    public static JsonNode sendSimpleMessage(String EMAIL_TO, int contentIndex, String code, String name) throws UnirestException {
        String API_KEY= "key-86f535679e909ed25e3ee47cf81382d0";
        String YOUR_DOMAIN_NAME = "www.bookvers.co.za";

        HttpResponse<com.mashape.unirest.http.JsonNode> request = Unirest.post("https://api.mailgun.net/v3/" + YOUR_DOMAIN_NAME + "/messages")
                .basicAuth("api", API_KEY)
                .field("from", "postmaster@www.bookvers.co.za")
                .field("to", EMAIL_TO)
                //.field("cc", "bob@example.com")
                //.field("bcc", "joe@example.com")
                .field("subject", getSubejct(contentIndex))
                //.field("text", getMessage(contentIndex,code))
                .field("html",getMessage(contentIndex,code,name))
                //.field("html", "<html>HTML version </html>")
                //.field("attachment", new File("/temp/folder/test.txt"))
                .asJson();
        return request.getBody();
    }
    public static String getSubejct(int contentIndex){
        switch (contentIndex){
            case 001:
                return "Confirm Registration on Bookverse";
            case 002:
                return "New post";
        }
        return null;
    }
    public static String getMessage(int contentIndex,String code,String name){
        switch (contentIndex){
            case 001:
                return MailHTML.confirmEmail(code,name);
            //return "Thank you for registering on our system.\nto confirm your registration please tape on the following link\nhttp://102.130.119.251:40001/user/userAccount/"+code;
            case 002:
                //return MailHTML.confirmEmail(code,name);
                return "Your book : "+code+"\n has been posted submitted successfully.\n\nThanks for using our plate-form.";
        }
        return null;
    }
}
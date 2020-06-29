package com.etoiledespoir.onlinekvshop.util;

public class MailHTML {
    public static String confirmEmail(String passCode,String name){
        String stringHTML="<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n" +
                "<html xmlns=\"http://www.w3.org/1999/xhtml\">\n" +
                "<head>\n" +
                "<meta name=\"viewport\" content=\"width=device-width\" />\n" +
                "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\n" +
                "<title>Actionable emails e.g. reset password</title>\n" +
                "<link href=\"styles.css\" media=\"all\" rel=\"stylesheet\" type=\"text/css\" />\n" +
                "</head>\n" +
                "\n" +
                "<body itemscope itemtype=\"http://schema.org/EmailMessage\">\n" +
                "\n" +
                "<table class=\"body-wrap\">\n" +
                "\t<tr>\n" +
                "\t\t<td></td>\n" +
                "\t\t<td class=\"container\" width=\"600\">\n" +
                "\t\t\t<div class=\"content\">\n" +
                "\t\t\t\t<table class=\"main\" width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" itemprop=\"action\" itemscope itemtype=\"http://schema.org/ConfirmAction\">\n" +
                "\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t<td class=\"content-wrap\">\n" +
                "\t\t\t\t\t\t\t<meta itemprop=\"name\" content=\"Confirm Email\"/>\n" +
                "\t\t\t\t\t\t\t<table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\">\n" +
                "\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t<td class=\"content-block\">\n" +
                "\t\t\t\t\t\t\t\t\t\tGood day "+name+",\n" +
                "<br/>"+
                "\t\t\t\t\t\t\t\t\t\tPlease confirm your email address by clicking the link below.\n" +
                "\t\t\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t<td class=\"content-block\">\n" +
                "\t\t\t\t\t\t\t\t\t\tWe may need to send you critical information about our service and it is important that we have an accurate email address.\n" +
                "\t\t\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t<td class=\"content-block\" itemprop=\"handler\" itemscope itemtype=\"http://schema.org/HttpActionHandler\">\n" +
                "\t\t\t\t\t\t\t\t\t\t<a href=\"http://localhost:4001/customer/register/"+passCode+"\" class=\"btn-primary\" itemprop=\"url\">Confirm email address</a>\n" +
                "\t\t\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t\t\t<td class=\"content-block\">\n" +
                "\t\t\t\t\t\t\t\t\t\t&mdash; The Mailgunners\n" +
                "\t\t\t\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t\t\t</table>\n" +
                "\t\t\t\t\t\t</td>\n" +
                "\t\t\t\t\t</tr>\n" +
                "\t\t\t\t</table>\n" +
                "\t\t\t\t<div class=\"footer\">\n" +
                "\t\t\t\t\t<table width=\"100%\">\n" +
                "\t\t\t\t\t\t<tr>\n" +
                "\t\t\t\t\t\t\t<td class=\"aligncenter content-block\">Follow <a href=\"http://twitter.com/mail_gun\">@Mail_Gun</a> on Twitter.</td>\n" +
                "\t\t\t\t\t\t</tr>\n" +
                "\t\t\t\t\t</table>\n" +
                "\t\t\t\t</div></div>\n" +
                "\t\t</td>\n" +
                "\t\t<td></td>\n" +
                "\t</tr>\n" +
                "</table>\n" +
                "\n" +
                "</body>\n" +
                "</html>\n";
       return stringHTML;
    }
}

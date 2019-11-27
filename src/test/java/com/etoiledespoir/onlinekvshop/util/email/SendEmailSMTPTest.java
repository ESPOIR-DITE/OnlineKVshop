package com.etoiledespoir.onlinekvshop.util.email;

import org.junit.Test;

import static org.junit.Assert.*;

public class SendEmailSMTPTest {

    @Test
    public void sendGrid() {
        SendEmailSMTP.sendGrid("espoirditekemena@gmail.com",001,"8888");
    }

    @Test
    public void decode() {
    }
}
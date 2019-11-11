package com.etoiledespoir.onlinekvshop.factory.domain.gender;

import com.etoiledespoir.onlinekvshop.domain.gender.Gender;
import org.junit.Test;

import static org.junit.Assert.*;

public class GenderFactoryTest {

    @Test
    public void getGender() {
        Gender gnder=GenderFactory.getGender("male");
        System.out.println(gnder.toString());
    }
}
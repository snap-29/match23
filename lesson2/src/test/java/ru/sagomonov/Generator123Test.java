package ru.sagomonov;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class Generator123Test {

    @Test
    public void get() {
       for (int j=3; j<=1000; j++ ) {
           Generator123 generator123 = new Generator123(j);
           for (int i = 0; i < 1000; i++) {
               int r = generator123.get();
               Assertions.assertTrue(r >= 1 && r <= j, "Your generator fail");
           }
       }
    }
}
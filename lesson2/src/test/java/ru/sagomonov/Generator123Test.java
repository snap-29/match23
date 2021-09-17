package ru.sagomonov;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class Generator123Test {

    @Test
    public void get() {

        Generator123 generator123 = new Generator123(3);
        for(int i=0 ; i<1000; i++){
            int r = generator123.get();
            Assertions.assertTrue(r>=1 && r<=3, "Your generator fail");
        }
    }
}
package com.muhammet;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class J003_AssertionUsing {
    private static Islemler islemler;

    @BeforeAll
    static void initAll(){
        islemler = new Islemler();
    }

    @Test
    void toplamTest(){
        assertEquals(10,islemler.toplma(4,6));
    }


}

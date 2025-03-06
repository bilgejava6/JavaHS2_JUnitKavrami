package com.muhammet;

import org.junit.jupiter.api.RepeatedTest;

public class J005_TekrarEdenTestler {
    /**
     * Bazen kodlarımızı ve end point lerimizi sınamak ve sistemi stres altına sokmak isteyebiliriz. böyle
     * durumlarda aynı method için terar eden testler yazmak mantıklı olabilir.
     */
    @RepeatedTest(15)
    void repeatedTest(){
        System.out.println("Tekrar Eden Test");
    }

}

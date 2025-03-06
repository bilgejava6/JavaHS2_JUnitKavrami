package com.muhammet;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.time.Duration;

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

    @Test
    void standartAssertions(){
        assertEquals(40, islemler.toplma(13,27));
        assertEquals(40, islemler.toplma(13,27),"girilen bilgiler yanlış olabilir, method yanlış olabilir");
        assertTrue(islemler.toplma(1,5) == 6);
        assertTrue(islemler.toplma(1,5) == 6,"Bir şeyler yanlış gitti");
        assertTrue(islemler.toplma(1,5) == 6,()-> {
            System.out.println("Burada sorun var");
            return "HATA";
        });
       //assertFalse(); kuralım doğru olmama durumu irdelenir.
       // assertNotEquals(); iki verinin eşit olmama durumu irdelenir
        Islemler islemler1= null;
        assertNull(islemler1); // içeride parametre olarak verilen nesnenin NULL olma durumunu irdeler
        assertNotNull(islemler); // içeride parametre olarak verilen nesnenin NOTNULL olma durumunu irdeler
        // nesnelerin bir birine eşit olup olmadığı
        // assertInstanceOf()

    }

    @Test
    void groupAssertions(){
        assertAll("Tüm Durumlar için test sistemi",
                ()-> assertEquals(10, islemler.toplma(8,2)),
                ()-> assertEquals(20, islemler.toplma(8,12))
                //......
        );
    }

    @Test
    void exceptionAssertions(){
        // fırlatılacak hata sınıfı, hatayı fırlatması beklene merhod durumu
        // 1. durum: method istisna fırlatmalı yoksa fail olur
        // 2. durum: method istisna fırlatır ancak belirtilen sınıf ile aynı değildir yine fail olur
        // 3. durum: herşey yolunda olabilir ancak istisna içeriği (message) hatalı olabilir.
       RuntimeException yakalananHata =  assertThrows(RuntimeException.class,()-> islemler.bolme(12,0));
        System.out.println(yakalananHata.getMessage());
        assertEquals("s2 değeri 0 girilemez", yakalananHata.getMessage());
    }

    /**
     * insanların anlık algısı: 400ms ve altıdır
     */
    @Test
    void testTimeout(){
        // ne kadar sürecek, kontrol edilecek method
        assertTimeout(Duration.ofSeconds(2),()-> islemler.sureliMethod(1994L));

    }





}

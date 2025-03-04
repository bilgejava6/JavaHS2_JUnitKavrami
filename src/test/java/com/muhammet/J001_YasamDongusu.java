package com.muhammet;

import org.junit.jupiter.api.*;

public class J001_YasamDongusu {

    /**
     * kullanılacak ve test e tabi tutulacak olan tüm methodlar, belli bir veri düzenine ve bütünlüğüne
     * sahip olması gerekbilir. Bu nedenle her test ten önce yapılması gereken yada her testtten sonra
     * yapılması gerekenler olabilir. Bunları yönetmek için belli anotasyonlar kullanıtız.
     */

    @BeforeAll
     static void initBeforeAll(){
        System.out.println("*** İLK ÖNCE BU ÇALIŞIR ***");
     }

    @BeforeEach
    void initBefore(){
        System.out.println("Her testten önce DB yi temizle");
    }

    @Test // bir test methodu olarak işaretlemek için kullanıyoruz.
    void ilkTest(){
        // asıl amaç test gövdesinde kodun doğru çalışmasını kontrol etmek.
        System.out.println("Selam bu ilk test");
    }

    @Test
    @Disabled("bu test 04.03.2025 tarihi ile kapatılmıştır.")
    void failTest(){
        System.out.println("Bu test hata verecek");
        Assertions.fail(); // bu testin hata vermesi için yazılmıştır.
    }

    @AfterEach
    void afterTest(){
        System.out.println("Her Testten sonra çalış.");
    }

    @AfterAll
    static void afterAll(){
        System.out.println("** EN SON BEN ÇALIŞIRIM **");
    }
}

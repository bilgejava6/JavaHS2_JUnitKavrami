package com.muhammet;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class J006_ParametreliTestler {

    @ParameterizedTest
    @ValueSource(ints = {3,5,8,6,9,0})
    void islemTest(int argument){
        assertTrue(argument>5 && argument<10);
    }

    /***
     * @ValueSource -> ints, strings
     * @EnumSource -> enum değerler string olarak verilir.
     * @CsvSource -> virgül ile ayrılmış datalar
     * @CsvFileSource -> bir dosyadan içerik okuyarak virgül ile ayrılmış alanları çeker.
     */

    /**
     * TDD -> Test Driven Development
     * önce test i yaz sonra kodu yaz.
     */

    @ParameterizedTest
    @CsvSource({
            "Muhammet, 41",
            "Deniz, 34",
            "Bahar, 25"
    })
    void cokluParametre(String ad, int yas){
        System.out.println("Kullanıcı adı...: "+ ad +" - yaş....: "+ yas);
    }

    /**
     * Örneğin;
     * bir Otomasyon uygulaması yaptınız, içeriye veri eklemek istiyor ve test etmek istiyorsunuz.
     * örnek bir mock data ile csv kullanarak verileri ekleyebilir ve test edebilirsiniz.
     */
    @ParameterizedTest
    //@CsvFileSource(resources = "/users.csv")
    @CsvFileSource(files = "src/test/resources/users.csv")
    void testKayit(String userName, String password){
        System.out.println("Kayıt başarılı...: "+ userName +" - "+password);
    }
}

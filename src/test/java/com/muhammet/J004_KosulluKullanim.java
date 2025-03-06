package com.muhammet;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

public class J004_KosulluKullanim {
    /**
     * Bir yazılım ekibinde kodlama yapan tüm personelin aynı bişlen ve paketleri kullanması
     * beklenemez.
     * -> windows, linux, macOS
     *  /users/...
     *  c:\\user\\muhammet....
     * -> farkı işlemciler kullanılabilir
     * -> farkı ama yeterli java sürümleri kullanılıyor olabilir.
     *
     */

    @Test
    @EnabledOnOs(OS.MAC)
    void testMac(){
        System.out.println("Mac OS X");
    }

    @Test
    @EnabledOnOs(OS.WINDOWS)
    void testWindows(){
        System.out.println("Windows");
    }

    @Test
    @EnabledOnOs({OS.WINDOWS, OS.LINUX})
    void testWindowsAndLinux(){
        System.out.println("Windows");
    }

    @Test
    @EnabledOnOs(value= OS.MAC, architectures = "aarch64")
    void islemciTurleri(){
        System.out.println("MAC: aarch64");
        System.out.println("Intel: x86_64");
    }

    @Test
    @EnabledOnJre(JRE.JAVA_21)
    void javaVersion21(){
        System.out.println("Java 21");
    }

    @Test
    @EnabledOnJre(JRE.JAVA_11)
    void javaVersion11(){
        System.out.println("Java 11");
    }


}

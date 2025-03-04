package com.muhammet;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class J002_DisplayName {

    @Test
    @DisplayName(value = "Toplama_Pozisif_Testi")
    void test(){
        System.out.println("test");
    }

    @Test
    @DisplayName("Custom test name containing spaces")
    void testWithDisplayNameContainingSpaces() {
    }

    @Test
    @DisplayName("╯°□°）╯")
    void testWithDisplayNameContainingSpecialCharacters() {
    }

    @Test
    @DisplayName("😱")
    void testWithDisplayNameContainingEmoji() {
    }
}

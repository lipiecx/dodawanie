package com.example.dodawanie;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DodawanieApplicationTest {

    @Test
    void added() {
        DodawanieApplication dodawanieApplication = new DodawanieApplication();
        assertEquals(10, dodawanieApplication.added(5,5));
    }
}
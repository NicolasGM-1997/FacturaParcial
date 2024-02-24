package com.example.facturaparcial;

import static org.junit.Assert.*;

import org.junit.Test;

public class FacturaTest {
    @Test public void testTotal(){
        Factura fact = new Factura();
        assertEquals(8500, fact.total(2,3));
    }
}
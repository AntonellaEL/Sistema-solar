package dev.anto;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class PlanetaTest {
      @Test
    void testConstructor() {
        Planeta planeta = new Planeta("planeta1", 1, 5.9736E24, 1.0, 12000, 150000000, Planeta.tipoPlaneta.TERRESTRE, true, 365, 24);
        assertEquals("planeta1", planeta.nombre);
        assertEquals(1, planeta.cantSatelites);
        assertEquals(5.9736E24, planeta.masa);
        assertEquals(1.0, planeta.volumen);
        assertEquals(12000, planeta.diametro);
        assertEquals(150000000, planeta.distanciamediaSol);
        assertEquals(Planeta.tipoPlaneta.TERRESTRE, planeta.tipo);
        assertTrue(planeta.observable);
        assertEquals(365, planeta.periodoOrbital);
        assertEquals(24, planeta.rotacion);
    }

    @Test
    void testCalcularDensidad() {
        Planeta planeta = new Planeta("planeta1", 1, 5.9736E24, 1.0, 12000, 150000000, Planeta.tipoPlaneta.TERRESTRE, true, 365, 24);
        assertEquals(5.9736E24, planeta.calcularDensidad());
    }

    @Test
    void testEsExterior() {
        Planeta planetaInterior = new Planeta("planeta1", 1, 5.9736E24, 1.0, 12000, 150000000, Planeta.tipoPlaneta.TERRESTRE, true, 365, 24);
        Planeta planetaExterior = new Planeta("planeta2", 1, 6.0036E24, 2.0, 20000, 1495978700, Planeta.tipoPlaneta.GASEOSO, false, 400, 40);
        assertFalse(planetaInterior.esExterior());
        assertTrue(planetaExterior.esExterior());
    }

    @Test
    void testImprimir() {
        Planeta planeta = new Planeta("planeta1", 1, 5.9736E24, 1.0, 12000, 150000000, Planeta.tipoPlaneta.TERRESTRE, true, 365, 24);
        planeta.imprimir();
        
    }
}

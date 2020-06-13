package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GolondrinasTest {

    @Test
    void todaGolondrinaNaceConCuarentaYCincoJoulesDeEnergia() {
        Golondrina unaGolondrina = new Golondrina();
        assertEquals(45 /* joules */, unaGolondrina.energia());
    }

    @Test
    void cuandoUnaGolondrinaComeRecuperaEnergia() {
        Golondrina unaGolondrina = new Golondrina();
        int energiaActual = unaGolondrina.energia();
        int energiaRecuperada = unaGolondrina.energiaRecuperadaAlComer(10);
        int energiaEsperada = energiaActual + energiaRecuperada;
        int energiaFinal = energiaActual + energiaRecuperada;

        unaGolondrina.comer(10);

        assertEquals(energiaEsperada, energiaFinal);
    }

    @Test
    void cuandoUnaGolondrinaVuelaConsumeEnergia() {
        Golondrina unaGolondrina = new Golondrina();
        int energiaActual = unaGolondrina.energia();
        int energiaConsumida = unaGolondrina.energiaConsumidaAlVolar(1);
        int energiaEsperada = energiaActual - energiaConsumida;
        int energiaFinal = energiaActual - energiaConsumida;

        unaGolondrina.volar(1);

        assertEquals(energiaEsperada, energiaFinal);
    }

    @Test
    void unaGolondrinaSeSienteDebilCuandoSuEnergiaEsInferiorACincuentaJoules() {
        Golondrina unaGolondrina = new Golondrina();

        assertTrue(unaGolondrina.seSienteDebil());
    }

    @Test
    void unaGolondrinaSeSienteEuforicaCuandoSuEnergiaEsSuperiorAQuinientosJoules() {
        Golondrina unaGolondrina = new Golondrina();
        unaGolondrina.comer(500);

        assertTrue(unaGolondrina.seSienteEuforica());
    }

    @Test
    void cuandoUnaGolondrinaSeSienteEuforicaDeseaVolar() {
        Golondrina unaGolondrina = new Golondrina();
        unaGolondrina.comer(500);
        int energiaActual = unaGolondrina.energia();
        int energiaEsperada = energiaActual - unaGolondrina.energiaConsumidaAlVolar(5);

        unaGolondrina.realizarDeseo();

        assertEquals(energiaEsperada, unaGolondrina.energia());
    }

    @Test
    void cuandoUnaGolondrinaSeSienteDebilDeseaComer() {
        Golondrina unaGolondrina = new Golondrina();
        int energiaActual = unaGolondrina.energia();
        int energiaEsperada = energiaActual + unaGolondrina.energiaRecuperadaAlComer(50);

        unaGolondrina.realizarDeseo();

        assertEquals(energiaEsperada, unaGolondrina.energia());
    }

    @Test
    void cuandoUnaGolondrinaNoSeSienteNiDebilNiEuforicaDeseaHacerFiaca() {
        Golondrina unaGolondrina = new Golondrina();
        unaGolondrina.comer(10);
        int energiaInicial = unaGolondrina.energia();
        unaGolondrina.realizarDeseo();
        int energiaEsperada = unaGolondrina.energia();

        assertEquals(energiaEsperada, energiaInicial);
    }

}

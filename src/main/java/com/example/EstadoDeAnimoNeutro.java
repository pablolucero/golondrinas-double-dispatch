package com.example;

public class EstadoDeAnimoNeutro extends EstadoDeAnimo {

    @Override
    public void realizarDeseoPara(Golondrina golondrina) {
        golondrina.realizarDeseoCuandoNeutra();
    }
}

package com.example;

public class EstadoDeAnimoDebil extends EstadoDeAnimo {

    @Override
    public void realizarDeseoPara(Golondrina golondrina) {
        golondrina.realizarDeseoCuandoDebil();
    }
}

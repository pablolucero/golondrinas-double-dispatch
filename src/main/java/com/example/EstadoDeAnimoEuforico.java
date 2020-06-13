package com.example;

public class EstadoDeAnimoEuforico extends EstadoDeAnimo {

    @Override
    public void realizarDeseoPara(Golondrina golondrina) {
        golondrina.realizarDeseoCuandoEuforica();
    }
}

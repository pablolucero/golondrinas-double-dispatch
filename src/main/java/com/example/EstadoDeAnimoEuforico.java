package com.example;

public class EstadoDeAnimoEuforico extends EstadoDeAnimo {

    @Override
    public boolean canHandle(Golondrina golondrina) {
        return golondrina.seSienteEuforica();
    }

    @Override
    public void realizarDeseoPara(Golondrina golondrina) {
        golondrina.realizarDeseoCuandoEuforica();
    }
}

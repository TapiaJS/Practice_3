package components.ram.kingston;

import components.ram.RAM;

public class Fury extends RAM {
    @Override
    public String nombre() {
        return "Fury";
    }

    @Override
    public int capacidad() {
        return 16;
    }

    @Override
    public String tipoMemoria() {
        return "DDR5";
    }

    @Override
    public double precio() {
        return 30;
    }

    @Override
    public String marca() {
        return "Kingston";
    }
}

package components.ram.crucial;

import components.ram.RAM;

public class Ballistix extends RAM {
    @Override
    public String nombre() {
        return "Ballistix";
    }

    @Override
    public int capacidad() {
        return 8;
    }

    @Override
    public String tipoMemoria() {
        return "DDR4";
    }

    @Override
    public double precio() {
        return 20;
    }

    @Override
    public String marca() {
        return "Crucial";
    }
}

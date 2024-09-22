package components.ram.crucial;

import components.ram.RAM;

public class Basics extends RAM {
    @Override
    public String nombre() {
        return "Basics";
    }

    @Override
    public int capacidad() {
        return 4;
    }

    @Override
    public String tipoMemoria() {
        return "DDR3";
    }

    @Override
    public double precio() {
        return 10;
    }

    @Override
    public String marca() {
        return "Crucial";
    }
}

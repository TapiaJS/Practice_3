package components.ram.kingston;

import components.ram.RAM;

public class HyperX extends RAM {
    @Override
    public String nombre() {
        return "HyperX";
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
        return "Kingston";
    }
}

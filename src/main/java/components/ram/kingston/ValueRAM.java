package components.ram.kingston;

import components.ram.RAM;

public class ValueRAM extends RAM {
    @Override
    public String nombre() {
        return "ValueRAM";
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
        return "Kingston";
    }
}

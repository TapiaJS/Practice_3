package components.ram.adata;

import components.ram.RAM;

public class Premier extends RAM {
    @Override
    public String nombre() {
        return "Premier";
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
        return "ADATA";
    }
}

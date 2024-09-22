package components.ram.adata;

import components.ram.RAM;

public class XPG extends RAM {
    @Override
    public String nombre() {
        return "Xtreme Performance Gear";
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
        return "ADATA";
    }
}

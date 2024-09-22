package components.ram.adata;

import components.ram.RAM;

public class XPGSpectrix extends RAM {
    @Override
    public String nombre() {
        return "XPG Spectrix";
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
        return "ADATA";
    }
}

package components.ram.crucial;

import components.ram.RAM;

public class ECC extends RAM {
    @Override
    public String nombre() {
        return "ECC";
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
        return "Crucial";
    }
}

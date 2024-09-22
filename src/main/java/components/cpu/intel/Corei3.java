package components.cpu.intel;

import components.cpu.CPU;

public class Corei3 extends CPU {
    @Override
    public String nombre() {
        return "Core i3";
    }

    @Override
    public double frecuencia() {
        return 2.1;
    }

    @Override
    public double precio() {
        return 40;
    }

    @Override
    public String marca() {
        return "Intel";
    }
}

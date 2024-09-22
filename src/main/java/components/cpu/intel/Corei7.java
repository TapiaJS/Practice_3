package components.cpu.intel;

import components.cpu.CPU;

public class Corei7 extends CPU {
    @Override
    public String nombre() {
        return "Core i7";
    }

    @Override
    public double frecuencia() {
        return 3.7;
    }

    @Override
    public double precio() {
        return 80;
    }

    @Override
    public String marca() {
        return "Intel";
    }
}

package components.cpu.intel;

import components.cpu.CPU;

public class Corei5 extends CPU {
    @Override
    public String nombre() {
        return "Core i5";
    }

    @Override
    public double frecuencia() {
        return 3.2;
    }

    @Override
    public double precio() {
        return 60;
    }

    @Override
    public String marca() {
        return "Intel";
    }
}

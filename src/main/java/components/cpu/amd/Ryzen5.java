package components.cpu.amd;

import components.cpu.CPU;

public class Ryzen5 extends CPU {
    @Override
    public String nombre() {
        return "Ryzen 5";
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
        return "AMD";
    }
}

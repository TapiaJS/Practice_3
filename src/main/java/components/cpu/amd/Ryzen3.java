package components.cpu.amd;

import components.cpu.CPU;

public class Ryzen3 extends CPU {
    @Override
    public String nombre() {
        return "Ryzen 3";
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
        return "AMD";
    }
}

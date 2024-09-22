package components.cpu.amd;

import components.cpu.CPU;

public class Ryzen7 extends CPU {
    @Override
    public String nombre() {
        return "Ryzen 7";
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
        return "AMD";
    }
}

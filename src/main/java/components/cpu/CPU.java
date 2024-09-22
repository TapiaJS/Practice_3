package components.cpu;

import components.Componente;

public abstract class CPU implements Componente {
    public abstract double frecuencia();

    @Override
    public abstract double precio();

    @Override
    public String tipoComponente() {
        return "CPU";
    }
}

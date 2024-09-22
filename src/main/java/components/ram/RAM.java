package components.ram;

import components.Componente;

public abstract class RAM implements Componente {
    public abstract int capacidad();

    public abstract String tipoMemoria();

    @Override
    public abstract double precio();

    @Override
    public String tipoComponente() {
        return "RAM";
    }
}

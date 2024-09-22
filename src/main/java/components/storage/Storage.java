package components.storage;

import components.Componente;

public abstract class Storage implements Componente {
    public abstract int capacidadAlmacenamiento();
    public abstract String tipoAlmacenamiento();

    @Override
    public abstract double precio();

    @Override
    public String tipoComponente() {
        return "Storage";
    }
}

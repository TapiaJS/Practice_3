package components.gpu;

import components.Componente;

import java.util.List;

public abstract class GPU implements Componente {
    public abstract String tipoMemoria();

    public abstract List<String> puertosSalida();

    @Override
    public abstract double precio();

    @Override
    public String tipoComponente() {
        return "GPU";
    }
}

package pc;

import components.Componente;

import java.util.LinkedList;

public abstract class PC {
    protected LinkedList<Componente> componentes = new LinkedList<Componente>();

    public double obtenCosto(){
        float costo = 0;

        for (Componente componente : componentes) {
            costo += componente.precio();
        }
        return costo;
    }

    public void muestraPC(){
        for (Componente componente : componentes) {
            System.out.print("Componente : " + componente.marca() + " " + componente.nombre());
            System.out.println(", Precio : " + componente.precio());
        }
    }

    public abstract void addCPU();
    public abstract void addRAM();
    public abstract void addGPU();
    public abstract void addStorage();
    public abstract void addPowerSource();
    public abstract void addMotherboard();
    //public abstract void buildPcCase();
}

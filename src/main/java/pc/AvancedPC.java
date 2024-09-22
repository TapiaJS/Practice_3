package pc;

import components.cpu.intel.Corei7;
import components.gpu.nvidia.GeForceRTX4080;
import components.ram.kingston.Fury;

public class AvancedPC extends PC{
    @Override
    public void addCPU() {
        componentes.add(new Corei7());
    }

    @Override
    public void addRAM() {
        componentes.add(new Fury());
    }

    @Override
    public void addGPU() {
        componentes.add(new GeForceRTX4080());
    }

    @Override
    public void addStorage() {

    }

    @Override
    public void addPowerSource() {

    }

    @Override
    public void addMotherboard() {

    }
}

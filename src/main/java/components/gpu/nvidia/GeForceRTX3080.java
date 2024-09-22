package components.gpu.nvidia;

import components.gpu.GPU;

import java.util.List;

public class GeForceRTX3080 extends GPU {
    @Override
    public String nombre() {
        return "GeForce RTX 3080";
    }

    @Override
    public String tipoMemoria() {
        return "GDDR6X";
    }

    @Override
    public List<String> puertosSalida() {
        return List.of("1x HDMI", "3x DisplayPort");
    }

    @Override
    public double precio() {
        return 70;
    }

    @Override
    public String marca() {
        return "NVIDIA";
    }
}

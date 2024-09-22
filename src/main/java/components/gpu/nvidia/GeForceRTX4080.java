package components.gpu.nvidia;

import components.gpu.GPU;

import java.util.List;

public class GeForceRTX4080 extends GPU {
    @Override
    public String nombre() {
        return "GeForce RTX 4080";
    }

    @Override
    public String tipoMemoria() {
        return "GDDR6X";
    }

    @Override
    public List<String> puertosSalida() {
        return List.of("1x HDMI 2.1", "3x DisplayPort 1.4a");
    }

    @Override
    public double precio() {
        return 90;
    }

    @Override
    public String marca() {
        return "NVIDIA";
    }
}

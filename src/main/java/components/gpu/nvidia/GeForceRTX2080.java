package components.gpu.nvidia;

import components.gpu.GPU;

import java.util.List;

public class GeForceRTX2080 extends GPU {
    @Override
    public String nombre() {
        return "GeForce RTX 2080";
    }

    @Override
    public String tipoMemoria() {
        return "GDDR6";
    }

    @Override
    public List<String> puertosSalida() {
        return List.of("1x HDMI", "3x DisplayPort", "1x USB Type-C");
    }

    @Override
    public double precio() {
        return 50;
    }

    @Override
    public String marca() {
        return "NVIDIA";
    }
}

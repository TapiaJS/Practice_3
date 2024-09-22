package components.gpu.amd;

import components.gpu.GPU;

import java.util.List;

public class RadeonRX5700 extends GPU {
    @Override
    public String nombre() {
        return "Radeon RX 5700";
    }

    @Override
    public String tipoMemoria() {
        return "GDDR6";
    }

    @Override
    public List<String> puertosSalida() {
        return List.of("1x HDMI", "3x DisplayPort");
    }

    @Override
    public double precio() {
        return 50;
    }

    @Override
    public String marca() {
        return "AMD";
    }
}

package components.gpu.amd;

import components.gpu.GPU;

import java.util.List;

public class RadeonRX7700 extends GPU {
    @Override
    public String nombre() {
        return "Radeon RX 7700";
    }

    @Override
    public String tipoMemoria() {
        return "GDDR6";
    }

    @Override
    public List<String> puertosSalida() {
        return List.of("1x HDMI 2.1a", "2x DisplayPort 2.1", "1x USB Type-C");
    }

    @Override
    public double precio() {
        return 90;
    }

    @Override
    public String marca() {
        return "AMD";
    }
}

package components.gpu.amd;

import components.gpu.GPU;

import java.util.List;

public class RadeonRX6900 extends GPU {

    @Override
    public String nombre() {
        return "Radeon RX 6900";
    }

    @Override
    public String tipoMemoria() {
        return "GDDR6 ";
    }

    @Override
    public List<String> puertosSalida() {
        return List.of("1x HDMI", "2x DisplayPort", "1x USB Type-C");
    }

    @Override
    public double precio() {
        return 70;
    }

    @Override
    public String marca() {
        return "AMD";
    }
}

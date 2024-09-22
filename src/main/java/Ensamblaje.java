import pc.PC;

public class Ensamblaje {
    public void createBasicPC(PC pc){
        pc.addCPU();
        pc.addRAM();
        pc.addGPU();
        pc.addStorage();
        pc.addPowerSource();
        pc.addMotherboard();
        //pc.buildPcCase(); no es necesario, si quieren lo anexan
    }
    public void createGamingPC(){

    }
    public void createAvancedPC(){

    }
}

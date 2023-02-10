package prototype.practica;

public class Client {
    public static void main(String[] args) {
        SamsungR10 prototypeSamsung = new SamsungR10(
                "Helio G80", 12.0,"20MP",
                5.1, 2, "5000mAh"
        );
        SamsungR10 celular1 = prototypeSamsung.clone();
        celular1.setTamano("64Gb");
        celular1.setMemoriaRAM("2Gb");
        celular1.setAccesorios(new Accesorios("AKG", "SuperCharge Type C","Negro"));
        celular1.setSim(new SIM("VIVA", 65160602));
        celular1.showInfo();

        SamsungR10 celular2 = prototypeSamsung.clone();
        celular2.setTamano("128Gb");
        celular2.setMemoriaRAM("8Gb");
        celular2.setAccesorios(new Accesorios("AirBuds", "SuperCharge Type C","Azul"));
        celular2.setSim(new SIM("VIVA", 67509911));
        celular2.showInfo();

        SamsungR10 celular3 = prototypeSamsung.clone();
        celular3.setTamano("32Gb");
        celular3.setMemoriaRAM("2Gb");
        celular3.setAccesorios(new Accesorios("AKG", "Type C","Transparente"));
        celular3.setSim(new SIM("TIGO", 77532411));
        celular3.showInfo();

        SamsungR10 celular4 = prototypeSamsung.clone();
        celular4.setTamano("128Gb");
        celular4.setMemoriaRAM("6Gb");
        celular4.setAccesorios(new Accesorios("AirBuds S2", "Type C","Batman Collaboration"));
        celular4.setSim(new SIM("Entel", 70599323));
        celular4.showInfo();

        SamsungR10 celular5 = prototypeSamsung.clone();
        celular5.setTamano("16Gb");
        celular5.setMemoriaRAM("2Gb");
        celular5.setAccesorios(new Accesorios("AirBuds Pro", "Inalambrico","Lila"));
        celular5.setSim(new SIM("TIGO", 72121123));
        celular5.showInfo();

    }
}

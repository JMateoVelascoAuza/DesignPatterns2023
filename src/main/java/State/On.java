package State;

import java.util.List;
import java.util.Random;

public class On implements IState{
    @Override
    public void cambiarComponentes(PC pc) {
        System.out.println("Iniciando PC");
        List<String> programasAbiertos = List.of("GTA V", "L4D2","EXCEL","Warzone 2.0","Discord","Chrome");
        Random random = new Random();

        int programas = random.nextInt(9)+1;
        double consumoRAM = pc.getRam().getConsumo();
        double consumoCPU = pc.getCpu().getConsumo();

        for(int p = 0; p < programas;p++ ){
            System.out.println("Ejecutando el siguiente programa: "+programasAbiertos.get(p));
            pc.getProgramasAbiertos().add(programasAbiertos.get(p));
            try {
                Thread.sleep(1500);
                consumoCPU += 5;
                pc.getCpu().setConsumo(consumoCPU);
                consumoRAM += 5;
                pc.getRam().setConsumo(consumoRAM);
                pc.showInfo();
            }catch (InterruptedException exception){
                exception.printStackTrace();
            }
        }
        System.out.println("Iniciando Sesion!");
    }
}

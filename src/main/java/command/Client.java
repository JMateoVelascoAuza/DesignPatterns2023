package command;

public class Client {
    public static void main(String[] args) {
        Personaje heroe = new Personaje("Scorpion");

        CHit hit = new CHit(heroe);
        CCover cover = new CCover(heroe);
        CJump jump = new CJump(heroe);
        CRun run = new CRun(heroe);
        CHeal curarse = new CHeal(heroe);

        Nivel nivel1 = new Nivel("CORRER!");
        nivel1.addCommand(run);

        Nivel nivel2 = new Nivel("REGENERACION!");
        nivel2.addCommand(cover).addCommand(curarse);

        Nivel nivel3 = new Nivel("ATACAR!");
        nivel3.addCommand(jump).addCommand(run).addCommand(hit);

        Nivel nivel4 = new Nivel("CONTRATACAR!");
        nivel4.addCommand(run).addCommand(jump).addCommand(run).addCommand(jump).addCommand(cover).addCommand(hit).addCommand(curarse).addCommand(run);

        nivel1.run(1);
        nivel2.run(2);
        nivel3.run(3);
        nivel4.run(4);
    }
}

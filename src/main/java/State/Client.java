package State;

public class Client {
    public static void main(String[] args) {
        PC pc = new PC("RTX 2070", "Corsair Vengeance DDR4");
        pc.showInfo();

        pc.changeState(new On());
        pc.showInfo();

        pc.changeState(new Restart());
        pc.showInfo();

        pc.changeState(new Off());
        pc.showInfo();
    }

}

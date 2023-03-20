package Bridge.ejercicio.NoBridge;

public class Client {

    public static void main(String[] args){
        IPlatform linux = new Linux();
        IPlatform windows = new Windows();

        linux.pickX64();
        linux.pickX86();

        windows.pickX86();
        windows.pickX64();
    }
}

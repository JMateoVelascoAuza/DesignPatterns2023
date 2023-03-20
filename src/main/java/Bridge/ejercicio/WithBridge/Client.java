package Bridge.ejercicio.WithBridge;

public class Client {
    public static void main(String[] args){
        IArch iArch64 = new X64();
        IArch iArch86 = new X86();
        IPlatform windows = new Windows(iArch64);
        IPlatform linux = new Linux(iArch86);

        windows.pickArch();
        linux.pickArch();
    }
}

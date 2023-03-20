package Bridge.ejercicio.WithBridge;

public class X64 implements IArch{

    @Override
    public void assignArch() {
        System.out.println("Assigning arch x64");
    }
}

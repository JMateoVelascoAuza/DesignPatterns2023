package Bridge.ejercicio.WithBridge;

public class X86 implements IArch{

    @Override
    public void assignArch() {
        System.out.println("Assigning arch x86");
    }
}

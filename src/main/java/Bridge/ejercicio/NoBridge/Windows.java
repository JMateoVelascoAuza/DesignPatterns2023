package Bridge.ejercicio.NoBridge;

public class Windows implements IPlatform{

    public Windows() {
        System.out.println("Starting Windows");
    }

    @Override
    public void pickX86() {
        System.out.println("Picked x86");
    }

    @Override
    public void pickX64() {
        System.out.println("Picked x64");
    }
}

package Bridge.ejercicio.NoBridge;

public class Linux implements IPlatform{

    public Linux() {
        System.out.println("Starting Linux");
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

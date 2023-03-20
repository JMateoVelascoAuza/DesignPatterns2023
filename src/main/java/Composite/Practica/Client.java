package Composite.Practica;

public class Client {

    public static void main(String[] args){
        Computer c1 = new Computer("i9 5466", 100);
        Computer c2 = new Computer("i9 5009", 100);
        Computer c3 = new Computer("i7 4326", 100);
        Computer c4 = new Computer("i5 2330", 100);
        Computer c5 = new Computer("i9 8943", 100);
        Computer c6 = new Computer("i5 1230", 100);

        PCHolder l1 = new PCHolder("Laboratory");
        PCHolder l2 = new PCHolder("Laboratory");

        l1.add(c1);
        l1.add(c2);
        l1.add(c3);

        l2.add(c4);
        l2.add(c5);
        l2.add(c6);

        PCHolder pcContainer1 = new PCHolder("Contenedor de PC's");
        pcContainer1.add(l1);
        pcContainer1.add(l2);

        System.out.println("El precio total del 'Contenedor de PC's' es: "+pcContainer1.getPrice());
    }
}

package mediator;

public class Main {
    public static void main(String[] args) {
        Skype skype = new Skype();

        Dev dev1 = new Dev(skype, "python");
        dev1.setCi("69414689").setName("Ander").setCargo("dev");
        Dev dev2 = new Dev(skype, "JavaScript");
        dev2.setCi("74017401").setName("Juancla").setCargo("dev");
        Dev dev3 = new Dev(skype, "Scratch");
        dev3.setCi("74017490").setName("Emanuel").setCargo("dev");

        Qa qa1 = new Qa(skype,"Junior");
        qa1.setCi("47104011").setName("Rene").setCargo("QA");
        Qa qa2 = new Qa(skype, "Senior");
        qa2.setCi("643926119").setName("Anuel").setCargo("QA");
        Qa qa3 = new Qa(skype, "Medium");
        qa3.setCi("470172074").setName("Charlie").setCargo("QA");

        Sm sm1 = new Sm(skype,"Scru Manager");
        sm1.setCi("07403174").setName("Mauricio").setCargo("SM");
        Sm sm2 = new Sm(skype, "Jefe Scrum");
        sm2.setCi("64891648").setName("Mateo").setCargo("SM");
        Sm sm3 = new Sm(skype, "DevOps");
        sm3.setCi("74012904").setName("Fabiana").setCargo("SM");


        skype.addProfesionalToTheChat(dev1.getCi(), dev1)
                .addProfesionalToTheChat(dev2.getCi(),dev2)
                .addProfesionalToTheChat(dev3.getCi(), dev3)
                .addProfesionalToTheChat(qa1.getCi(), qa1)
                .addProfesionalToTheChat(qa2.getCi(), qa2)
                .addProfesionalToTheChat(qa3.getCi(),qa3)
                .addProfesionalToTheChat(sm1.getCi(), sm1)
                .addProfesionalToTheChat(sm2.getCi(),sm2)
                .addProfesionalToTheChat(sm3.getCi(), sm3);


        qa1.send("A todos los QA's favor de enviar un informe");
        //dev1.send("Bienvenidos a todos los Developers");
        //sm1.send("Esperemos que absolutamente todos se encuentren bien");

    }
}

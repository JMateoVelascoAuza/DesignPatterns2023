package Adapter.Practica;

public class Client {
    public static void main(String[] args){
        IEmpresa1 android = new Android("Huawei P30 Pro");
        android.login();

        IEmpresa1 ios = new Ios("Iphone X");
        ios.logout();

        IEmpresa1 windowsPhone = new Android("Windows Phone");
        windowsPhone.reportes();

        IEmpresa1 escritorio = new Union(new AppEscritorio("MathLab"));
        escritorio.logout();

        IEmpresa1 web = new Union(new AppWeb("Photopea"));
        web.login();

    }
}

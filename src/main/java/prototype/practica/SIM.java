package prototype.practica;

public class SIM {
    private String empresaTel;
    private int numeroTel;

    public SIM(String empresaTel, int numeroTel) {
        this.empresaTel = empresaTel;
        this.numeroTel = numeroTel;
    }

    public String getEmpresaTel() {
        return empresaTel;
    }

    public void setEmpresaTel(String empresaTel) {
        this.empresaTel = empresaTel;
    }

    public int getNumeroTel() {
        return numeroTel;
    }

    public void setNumeroTel(int numeroTel) {
        this.numeroTel = numeroTel;
    }
    public void showInfo(){
        System.out.println("Empresa telefonica-"+getEmpresaTel()+" Numero De Telefono-"+getNumeroTel());
    }
}

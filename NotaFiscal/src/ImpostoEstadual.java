public class ImpostoEstadual extends Imposto {
    private String uf;

    public ImpostoEstadual(double aliquota, String sigla, String uf) {
        super(aliquota, sigla);
        this.uf = uf;
    }
    public ImpostoEstadual() {
    }

    public String getUf() {
        return uf;
    }
    public void setUf(String uf) {
        this.uf = uf;
    }
    
    @Override 
    public void getEsfera() {
        System.out.println("Metodo getEsfera utilizado em ImpostoEstadual");
    }
}

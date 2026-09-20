public abstract class ImpostoEstadual extends Imposto {
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
    public String getEsfera(){
        return "Imposto Estadual";
    }
}

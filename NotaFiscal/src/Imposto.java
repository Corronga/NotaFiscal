
public class Imposto {
    private double aliquota;
    private String sigla;

    
    public Imposto(double aliquota, String sigla) {
        this.aliquota = aliquota;
        this.sigla = sigla;
    }
    public Imposto() {
    }

    public double getAliquota() {
        return aliquota;
    }
    public void setAliquota(double aliquota) {
        this.aliquota = aliquota;
    }
    public String getSigla() {
        return sigla;
    }
    public void setSigla(String sigla) {
        this.sigla = sigla;
    } 
    
    
}   


public abstract class Imposto {
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
    
    public void salvar() {
        System.out.println(("Metodo SALVAR utilizado em classe Imposto"));
    }
    public void alterar() {
        System.out.println(("Metodo ALTERAR utilizado em classe Imposto"));
    }
    public void excluir() {
        System.out.println(("Metodo EXCLUIR utilizado em classe Imposto"));    
    }
    public void pesquisar() {
        System.out.println(("Metodo PESQUISAR utilizado em classe Imposto"));
    }

    public double calcularBC(double baseCalculo) {
        return 0;
    }
    public void calcularValor() {
    }
    
    public String getEsfera() {
        return "Imposto";
    }

    public abstract double calcularImposto(double baseCalculo); 
    
}   

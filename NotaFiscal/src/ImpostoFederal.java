public abstract class ImpostoFederal extends Imposto {
    private int codigo_receita;
    
    public ImpostoFederal(double aliquota, String sigla, int codigo_receita) {
        super(aliquota, sigla);
        this.codigo_receita = codigo_receita;
    }
    public ImpostoFederal() {
    }

    public int getCodigo_receita() {
        return codigo_receita;
    }
    public void setCodigo_receita(int codigo_receita) {
        this.codigo_receita = codigo_receita;
    }

    public void calcularBC() {
        System.out.println("Metodo calcularBC utilizado em Imposto Federal");
    }
    
    @Override 
    public String getEsfera(){
        return "Imposto Federal";
    }
}

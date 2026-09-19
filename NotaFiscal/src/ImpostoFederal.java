public class ImpostoFederal extends Imposto {
    private String codigo_receita;
    
    public ImpostoFederal(double aliquota, String sigla, String codigo_receita) {
        super(aliquota, sigla);
        this.codigo_receita = codigo_receita;
    }
    public ImpostoFederal() {
    }

    public String getCodigo_receita() {
        return codigo_receita;
    }
    public void setCodigo_receita(String codigo_receita) {
        this.codigo_receita = codigo_receita;
    }
    
    public void getEsfera(){
        System.out.println("Imposto Federal");
    }
}

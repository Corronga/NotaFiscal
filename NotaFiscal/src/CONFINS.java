public class CONFINS extends ImpostoFederal{
    private double desconto_base; 

    public CONFINS (double aliquota, String sigla, int codigo_receita, double desconto_base) {
        super(aliquota, sigla, codigo_receita);
        this.desconto_base = desconto_base;
    }
    public CONFINS(){
    }

    public double getDesconto_base() {
        return desconto_base;
    }
    public void setDesconto_base(double desconto_base) {
        this.desconto_base = desconto_base;
    }

    @Override
    public void getEsfera() {
        System.out.println("Metodo getEsfera utilizado em CONFINS");
    }
}


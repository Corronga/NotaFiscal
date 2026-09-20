public class COFINS extends ImpostoFederal{
    private double desconto_base; 

    public COFINS (double aliquota, String sigla, int codigo_receita, double desconto_base) {
        super(aliquota, sigla, codigo_receita);
        this.desconto_base = desconto_base;
    }
    public COFINS(){
    }

    public double getDesconto_base() {
        return desconto_base;
    }
    public void setDesconto_base(double desconto_base) {
        this.desconto_base = desconto_base;
    }

    @Override 
    public double calcularImposto(double baseCalculo) {
        double valorImposto = baseCalculo * (getAliquota() / 100);
        return valorImposto;
    }
}


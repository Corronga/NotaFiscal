public class PIS extends ImpostoFederal{
    
    public PIS (double aliquota, String sigla, int codigo_receita) {
        super(aliquota, sigla, codigo_receita);
    }
    public PIS(){
    }
    
    @Override 
    public double calcularBC(double baseCalculo) {
        double valorImposto = baseCalculo * (getAliquota() / 100);
        return valorImposto;
    }
}


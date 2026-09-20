public class PIS extends ImpostoFederal{
    
    public PIS (double aliquota, String sigla, int codigo_receita) {
        super(aliquota, sigla, codigo_receita);
    }

    @Override
    public void calcularBC() {
        System.out.println("Metodo calcularBC utilizado em PIS");
    }

}


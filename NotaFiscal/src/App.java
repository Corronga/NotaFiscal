public class App {
    public static void main(String[] args) throws Exception {

        NotaFiscal nota = new NotaFiscal(1, "000001", 10000.00, null);

        Imposto icms = new ICMS(12, "0", "GO", 0);
        Imposto pis = new PIS(1.65, "0", 8109);
        Imposto confins = new COFINS(7.6, "0", 2172, 0);
        
        nota.adicionar(icms);
        nota.adicionar(pis);
        nota.adicionar(confins);
        
        
        nota.exibirImpostos();
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        double valorVenda = 10000.00; 

        NotaFiscal nota = new NotaFiscal(1, "000001", valorVenda, null);

        Imposto icms = new ICMS(12, "0", "GO", 0);
        Imposto pis = new PIS(1.65, "0", 8109);
        Imposto confins = new CONFINS(7.6, "0", 2172, 0);
        
        nota.adicionar(icms);
        nota.adicionar(pis);
        nota.adicionar(confins);
        
    }
}

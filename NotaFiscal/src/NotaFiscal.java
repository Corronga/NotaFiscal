
import java.util.List;

public class NotaFiscal {
    private int id; 
    private String numero_nota;
    private double valor_operacao; 
    private List<Imposto> impostos;
    
    public NotaFiscal(int id, String numero_nota, double valor_operacao, List<Imposto> impostos) {
        this.id = id;
        this.numero_nota = numero_nota;
        this.valor_operacao = valor_operacao;
        this.impostos = impostos;
    }
    public NotaFiscal() {
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNumero_nota() {
        return numero_nota;
    }
    public void setNumero_nota(String numero_nota) {
        this.numero_nota = numero_nota;
    }
    public double getValor_operacao() {
        return valor_operacao;
    }
    public void setValor_operacao(double valor_operacao) {
        this.valor_operacao = valor_operacao;
    }
    public List<Imposto> getImpostos() {
        return impostos;
    }
    public void setImpostos(List<Imposto> impostos) {
        this.impostos = impostos;
    } 
    public void adicionar(Imposto imposto) {
        impostos.add(imposto);
    }
    
    public void exibirImpostos() {
        System.out.println("Impostos da Nota Fiscal " + numero_nota + ":");
        for (Imposto imposto : impostos) {
            System.out.println("Esfera: " + imposto.getEsfera());
            System.out.println("Sigla: " + imposto.getSigla());
            System.out.println("Alíquota: " + imposto.getAliquota() + "%");
            System.out.println("Valor do Imposto: R$ " + imposto.calcularImposto(valor_operacao));
            System.out.println("-------------------------");
        }
    }
}

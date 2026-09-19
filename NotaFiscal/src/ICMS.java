public class ICMS extends ImpostoEstadual{
    private double reducao_bc; 
    
    public ICMS(double aliquota, String sigla, String uf, double reducao_bc) {
        super(aliquota, sigla, uf);
        this.reducao_bc = reducao_bc;
    }
    public ICMS() {
    }
    
    public double getReducao_bc() {
        return reducao_bc;
    }
    public void setReducao_bc(double reducao_bc) {
        this.reducao_bc = reducao_bc;
    }

    
}

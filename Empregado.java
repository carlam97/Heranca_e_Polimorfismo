public class Empregado extends Pessoa {    // subclasse 
    
    private int codigoSetor;
    private double salarioBase;
    private double imposto;
    
    //fazer os métodos get e set

    public double calculaSalario(){
        double salarioTotal=0;
        salarioTotal=this.salarioBase-this.imposto;
        return salarioTotal;
    }
}

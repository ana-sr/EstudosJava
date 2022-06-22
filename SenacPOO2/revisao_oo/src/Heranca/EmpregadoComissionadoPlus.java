package Heranca;

public class EmpregadoComissionadoPlus extends EmpregadoComissionado{

	private double salarioBase;
	
	public EmpregadoComissionadoPlus(double salario, String primeiroNome, String 
			ultimoNome, String CPF, double vendasbruta, double taxa) {
		super(primeiroNome, ultimoNome, CPF, vendasbruta, taxa);
		setSalarioBase(salario);
	}
	
	public void setSalarioBase (double salario) {
		salarioBase = (salario <0.0) ? 0.0 : salario;
	}
	
	public double getSalarioBase() {
		return salarioBase;
	}
	
	//polimorfismo do metodo
	@Override

	public double Salario() {
		return salarioBase + (super.getTaxaComissao() * super.getVendasBruta());
	}
	
	//main
	public static void main (String args[]) {
		EmpregadoComissionadoPlus  objeto = new EmpregadoComissionadoPlus (1200.0 ,"Fernando",
				"Silva", "040.998.089-93", 23000, 0.1);
		System.out.printf("Empregado: %s %s \n", objeto.getPrimeiroNome(), 
				objeto.getUltimoNome());
		System.out.println("CPF: "+objeto.getCPF());
		System.out.println("Total de Vendas: "+objeto.getVendasBruta());
		System.out.println("Taxa de comissao: "+objeto.getTaxaComissao());
		System.out.printf("Salario; %.2f \n", objeto.Salario());
	}
	
}

package Heranca;

public class EmpregadoComissionado {
	//atributos
	private String primeiroNome;
	private String ultimoNome;
	private String CPF;
	private double vendasBruta;
	private double porcentagemComissao;
	
	//inicio contructor (argumentos)
	public EmpregadoComissionado (String primeiroNome, String ultimoNome, String
			CPF, double vendasbruta, double taxa) {
		this.primeiroNome = primeiroNome;
		this.ultimoNome = ultimoNome;
		this.CPF = CPF;
		setVendasBruta (vendasbruta);
		setTaxaComissao (taxa);
	}
	//fim construtor
	//set e get

	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}
	
	public String getPrimeiroNome() {
		return primeiroNome;
	}
	
	public void setUltimoNome(String ultimoNome) {
		this.ultimoNome = ultimoNome;
	}

	public String getUltimoNome() {
		return ultimoNome;
	}
	
	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getCPF() {
		return CPF;
	}
	
	public void setVendasBruta (double vendas) {
		vendasBruta = (vendas<0.0)? 0.0 : vendas;
	}
	
	public double getVendasBruta() {
		return vendasBruta;
	}
	
	public  void setTaxaComissao (double taxa) {
		porcentagemComissao=(taxa>0.0 && taxa < 1.0)? taxa: 0.0;
	}
	
	public double getTaxaComissao() {
		return porcentagemComissao;
	}
	
	public double Salario() {
		return getVendasBruta() + getTaxaComissao();
	}
	
	//main
	public static void main(String arg[]) {
		EmpregadoComissionado objeto = new EmpregadoComissionado("Manoel", "Chave", 
				"030.991.091-66", 23890.4, 0.05);
		System.out.printf("Empregado: %s %s \n", objeto.getPrimeiroNome(), 
				objeto.getUltimoNome());
		System.out.println("CPF: "+ objeto.getCPF());
		System.out.println("Total de Vendas: "+objeto.getVendasBruta());
		System.out.println("Taxa de Comissão: "+objeto.getTaxaComissao());
		System.out.printf("Salario: %.2f \n", objeto.Salario());
	}
	
	
	

	
}

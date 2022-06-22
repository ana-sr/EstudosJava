package InterfaceJava;

public class Funcionario {
	
	private String PrimeiroNome;
	private String UltimoNome;
	private String cpf;
	
	public Funcionario(String PrimeiroNome, String UltimoNome, String cpf) {
		this.PrimeiroNome = PrimeiroNome;
		this.UltimoNome = UltimoNome;
		this.cpf = cpf;
	}
	
	
	public String getPrimeiroNome() {
		return PrimeiroNome;
	}


	public void setPrimeiroNome(String primeiroNome) {
		PrimeiroNome = primeiroNome;
	}


	public String getUltimoNome() {
		return UltimoNome;
	}


	public void setUltimoNome(String ultimoNome) {
		UltimoNome = ultimoNome;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public void setPnome (String s) {
		PrimeiroNome = s;
	}
}

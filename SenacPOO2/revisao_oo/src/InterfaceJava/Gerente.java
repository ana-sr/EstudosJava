package InterfaceJava;

public class Gerente extends Funcionario implements Autenticavel {

	private String senha;

	public Gerente(String s, String PrimeiroNome, String UltimoNome, String cpf) {
		super(PrimeiroNome, UltimoNome, cpf);
		senha = s;
	}

	@Override
	public String toString() {
		return String.format("Funcionario Gerente: \n $s ", super.toString());
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public boolean autentica(String senha) {
		if (!this.getSenha().equals(senha)) {
			return false;
		}

		return true;
	}
}

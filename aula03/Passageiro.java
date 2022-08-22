
class Passageiro{

    private String primeiroNome;
    private String ultimoNome;
    private String cpfString;

	public String getprimeiroNome() {
		return this.primeiroNome;
	}

	public void setprimeiroNome(String novoValor) {
		this.primeiroNome = novoValor;
	}

	public String getultimoNome() {
		return this.ultimoNome;
	}

	public void setultimoNome(String novoValor) {
		this.ultimoNome = novoValor;
	}

	public String getcpf() {
		return this.cpfString;
	}

	public void setcpf(String novoValor) {
		this.cpfString = novoValor;
	}

	Passageiro(String novoPrimeiroNome, String novoUltimoNome, String novoCpf) {
		this.setprimeiroNome(novoPrimeiroNome);
		this.setultimoNome(novoUltimoNome);
		this.setcpf(novoCpf);
	}

 
	Passageiro(String novoCpf) {
		this.cpfString = novoCpf;
	}

	public String toString() {
		return ("Nome Completo: " + this.getprimeiroNome() + 
				" " + this.getultimoNome() +  
				", CPF: " + this.getcpf());
	}

}

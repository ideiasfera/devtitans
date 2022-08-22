class Motor {

	private String modelo;
	private float potencia;
	private boolean ativo;

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String novoValor) {
		this.modelo = novoValor;
	}

	public float getPotencia() {
		return this.potencia;
	}

	public void setPotencia(float novoValor) {
		this.potencia = novoValor;
	}

	public boolean getAtivo() {
		return this.ativo;
	}

	public void setAtivo(boolean novoValor) {
		this.ativo = novoValor;
	}

	Motor(String novoModelo, float novaPotencia) {
		this.setModelo(novoModelo);
		this.setPotencia(novaPotencia);
		this.setAtivo(false);
	}

	public void ligar() {
		this.setAtivo(true);
		System.out.println("......VRUMMMM!!");
	}
	
	public void desligar(){
		this.setAtivo(false);
		System.out.println("mmmmm……..");
	}

}

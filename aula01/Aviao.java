class Aviao {

	private String modelo;
	private String identificador;
	private boolean motor;
	private float altura;
	private float velocidade;
	private boolean emvoo;

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String novoValor) {
		this.modelo = novoValor;
	}

	public String getIdentificador() {
		return this.identificador;
	}

	public void setIdentificador(String novoValor) {
		this.identificador = novoValor;
	}
	
	public boolean getMotor() {
		return this.motor;
	}

	public void setMotor(boolean novoValor) {
		this.motor = novoValor;
	}

	public float getAltura() {
		return this.altura;
	}

	public void setAltura(float novoValor) {
		this.altura = novoValor;
	}

	public float getVelocidade() {
		return this.velocidade;
	}

	public void setVelocidade(float novoValor) {
		this.velocidade = novoValor;
	}

	public boolean getEmVoo() {
		return this.emvoo;
	}

	public void setEmVoo(boolean novoValor) {
		this.emvoo = novoValor;
	}

	public void imprimaOk() {
		System.out.println("Ok");
	}
	
	Aviao(String novoM, String novoId) {
		this.setModelo(novoM);
		this.setIdentificador(novoId);
		this.setMotor(false);
		this.setAltura(0.0f);
	}
	
	public void ligaMotor() {
		this.setMotor(true);
		System.out.println("Vrummmmmmm");
	}
	
	public void desligaMotor(){
		this.setMotor(false);
		System.out.println("........");
	}
	
	public void imprimeEstadoMotor() {
		if (this.getMotor()) {
			System.out.println("O motor esta ligado..");
		} else {
			System.out.println("O motor esta desligado..");
		}
	}

	public boolean getEstadoMotor() {
		return this.getMotor();
	}
	
	public void acelerar() {
		if (this.getEstadoMotor()) {
			this.setVelocidade(this.getVelocidade() + 50.0f);
			System.out.println("Aviao a " + this.getVelocidade() + "km/h");
			atualizarStatusVoo();
		} else {
			System.out.println("ERRO: Motor desligado");
		}
	}

	public void desacelerar() {
		if (this.getEstadoMotor()) {

			if (this.getVelocidade() > 0.0f) {
				this.setVelocidade(this.getVelocidade() - 50.0f);
			}

			System.out.println("Aviao a " + this.getVelocidade() + "km/h");
			atualizarStatusVoo();

		} else {
			System.out.println("ERRO: Motor desligado");
		}
	}

	public void atualizarStatusVoo() {
		if (this.getEmVoo()){
			if (this.getVelocidade() >= 200.0f) {
				System.out.println("Estou voando...");
			} else {
				this.setEmVoo(false);
				System.out.println("Estou aterrisando...");
			}
		} else {
			if (this.getVelocidade() < 200.0f) {
				System.out.println("Estou em solo...");
			} else {
				this.setEmVoo(true);
				System.out.println("Estou decolando...");
			}
		}
	}
	
}

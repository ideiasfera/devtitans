
class AguiaGigante implements Motorizavel{

	private float peso;
	private String nome;
	private float forca;
	private boolean acordada;

	private float getPeso(){
		return this.peso;
	}

	private void setPeso(float novoPeso){
		this.peso = novoPeso;
	}

	private String getNome(){
		return this.nome;
	}

	private void setNome(String novoNome){
		this.nome = novoNome;
	}

	private float getForca(){
		return this.forca;
	}

	private void setForca(float novaForca){
		this.forca = novaForca;
	}

	private boolean getAcordada(){
		return this.acordada;
	}

	private void setAcordada(boolean novaAcordada){
		this.acordada = novaAcordada;
	}

    AguiaGigante(String nome, float peso,float forca){
        this.setNome(nome);
        this.setPeso(peso);
        this.setForca(forca);
        this.setAcordada(true);
	}

	public boolean getAtivo(){
		return this.acordada;
	}

	public float getPotencia(){
		if(acordada) {
			return this.forca;
		}
		else{
			return 0;
		}
	}

	public void ligar(){
		if(!this.acordada) {
		  this.setAcordada(true);
	      System.out.println("croac");
		}
	}

	public void desligar(){
		if(this.acordada) {
			this.setAcordada(false);
			System.out.println("ronc");
		}
	}

}


import java.util.ArrayList;
import java.util.Iterator;

class Aviao {

	private String modelo;
	private String identificador;
	private float altura;
	private float velocidade;
	private boolean emvoo;
	
	private Motorizavel motorEsquerdo;
	private Motorizavel motorDireito;

	private ArrayList<Passageiro> ListaPassageiros;

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

	Aviao(String novoM, String novoId, Motorizavel motorE, Motorizavel motorD) {
		this.setModelo(novoM);
		this.setIdentificador(novoId);
		this.setAltura(0.0f);
		this.setVelocidade(0.0f);
		this.setEmVoo(false);
		this.setMotorEsquerdo(motorE);
		this.setMotorDireito(motorD);
		ListaPassageiros = new ArrayList<Passageiro>(); 		
	}

	public void imprimeEstadoMotor() {
		
		if ((this.getMotorEsquerdo().getAtivo()) && (this.getMotorDireito().getAtivo()))  {
			System.out.println("O motores estão ligados..");
		} else {
			if ((this.getMotorEsquerdo().getAtivo()) || (this.getMotorDireito().getAtivo()))  {
			  if (this.getMotorEsquerdo().getAtivo()) {
				System.out.println("Somente o motor Esquerdo está ligado");
			  } else {
				System.out.println("Somente o motor Direito está ligado");
			  }
			} else {
				System.out.println("Os motores estão desligados..");
			}
			
		}
		
	}

	public boolean getEstadoMotor() {
		
		if ((this.motorEsquerdo.getAtivo()) || (this.motorDireito.getAtivo())) {
			return true;
		}
		else{
			return false;
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

	private void setMotorEsquerdo(Motorizavel novoMotorEsquerdo){
		this.motorEsquerdo = novoMotorEsquerdo;
	}

	private void setMotorDireito(Motorizavel novoMotorDireito){
		this.motorDireito = novoMotorDireito;
	}

	public void acelerar() {
		
		float baseEsquerda = 0.0f;
		float baseDireita = 0.0f;
		
		if (this.getMotorEsquerdo().getAtivo())  {
			baseEsquerda = this.getMotorEsquerdo().getPotencia();
		}
		
		if (this.getMotorDireito().getAtivo())  {
			baseDireita = this.getMotorDireito().getPotencia();
		}

		if (this.getEstadoMotor()) {
			this.setVelocidade(this.getVelocidade() + baseEsquerda + baseDireita);
			System.out.printf("Aviao a %.2f km/h\n",this.getVelocidade());
		} else {
			System.out.println("ERRO: Motor desligado");
		}
	}

	public void desacelerar() {

		float baseEsquerda = 0.0f;
		float baseDireita = 0.0f;

		if (! this.getMotorEsquerdo().getAtivo())  {
			baseEsquerda = this.getMotorEsquerdo().getPotencia();
		}
		
		if (! this.getMotorDireito().getAtivo())  {
			baseDireita = this.getMotorDireito().getPotencia();
		}


		if (this.getEstadoMotor()) {

			if (this.getVelocidade() > 0.0f) {
				this.setVelocidade(this.getVelocidade() - baseEsquerda - baseDireita);
                if (this.getVelocidade() < 0.0f) {
				  this.setVelocidade(0.0f);	
				} 
			}
			System.out.printf("Aviao a %.2f km/h\n",this.getVelocidade());
			atualizarStatusVoo();

		} else {
			System.out.println("ERRO: Motor desligado");
		}
		this.atualizarStatusVoo();
	}

	public Motorizavel getMotorEsquerdo() {
		return this.motorEsquerdo;
	}


	public Motorizavel getMotorDireito() {
		return this.motorDireito;
	}

	public void setmotorEsquerdo(Motorizavel novoValor) {
		this.motorEsquerdo = novoValor;
	}	

	public void setmotorDireito(Motorizavel novoValor) {
		this.motorDireito = novoValor;
	}	

	public void ligarMotor() {
		this.getMotorEsquerdo().ligar();
		this.getMotorDireito().ligar();
	}

	public void ligarMotorEsquerdo() {
		this.getMotorEsquerdo().ligar();
	}

	public void ligarMotorDireito() {
		this.getMotorDireito().ligar();
	}

	public void desligarMotor(){
		this.getMotorEsquerdo().desligar();
		this.getMotorDireito().desligar();
	}

	public void desligarMotorEsquerdo(){
		this.getMotorEsquerdo().desligar();
	}

	public void desligarMotorDireito(){
		this.getMotorDireito().desligar();
	}


	public Boolean adicionarPassageiro(Passageiro obj){
        if(this.getVelocidade() == 0.0f){
            this.ListaPassageiros.add(obj);
            return true;
        }else{
            System.out.println("Protocolos de segurança não permitem embarques com a aeronave em movimento");
            return false;
        }
    }

    public void desembarcarPassageiros(){
		int tamanho = ListaPassageiros.size();
		int i = 0;
		if (this.getVelocidade() == 0.0f){
			System.out.println("Passageiros desembacados:"); 
			while (i < tamanho) {
	      			System.out.println(ListaPassageiros.get(0).toString());
	      			ListaPassageiros.remove(0);
	      			i++;
      			}	
		}
		else{
			System.out.println("Protocolos de segurança não permitem desembarques com a aeronave em movimento");
		}
    }

    public void imprimirListaDePassageiro(){
		int i = 0;
		Iterator<Passageiro> iterator = ListaPassageiros.iterator();
		 
		System.out.println("Passageiros embarcados:"); 
    		while (iterator.hasNext()) {
      			System.out.printf("%d-%s\n", i, iterator.next().toString());
      			i++;
    		}
    }

	public Passageiro buscaPassageiroPorCpf(String cpf){
		int tamanho = ListaPassageiros.size();
		int i = 0;
		boolean achou = false;
		Passageiro p = null;		
	 	while ((i < tamanho) && (!achou)) {
      			if(ListaPassageiros.get(i).getcpf() == cpf){
      				p = ListaPassageiros.get(i);
      			}
      			i++;
    		}
		return p;
	}

}

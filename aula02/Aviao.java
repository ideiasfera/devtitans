
import java.util.ArrayList;

class Aviao {

	private String modelo;
	private String identificador;
	private float altura;
	private float velocidade;
	private boolean emvoo;
	
	private Motor motorEsquerdo;
	private Motor motorDireito;

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

	Aviao(String novoM, String novoId, Motor motorE, Motor motorD) {
		this.setModelo(novoM);
		this.setIdentificador(novoId);
		this.setAltura(0.0f);
		this.setMotorEsquerdo(motorE);
		this.setMotorDireito(motorD);
		ListaPassageiros = new ArrayList<Passageiro>(); 		
	}

	public void imprimeEstadoMotor() {
		
		if ((motorEsquerdo.getAtivo()) && (motorDireito.getAtivo()))  {
			System.out.println("O motores estão ligados..");
		} else {
			if ((motorEsquerdo.getAtivo()) || (motorDireito.getAtivo()))  {
			  if (motorEsquerdo.getAtivo()) {
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
		
		if ((motorEsquerdo.getAtivo()) || (motorDireito.getAtivo())) {
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

	private void setMotorEsquerdo(Motor novoMotorEsquerdo){
		this.motorEsquerdo = novoMotorEsquerdo;
	}

	private void setMotorDireito(Motor novoMotorDireito){
		this.motorDireito = novoMotorDireito;
	}

	public void acelerar() {
		
		float base = 0.0f;
		
		
		if (this.getEstadoMotor()) {
			
			base = 0;

			if (motorEsquerdo.getAtivo())  {
				base = base + motorEsquerdo.getPotencia();
			}
			
			if (motorDireito.getAtivo())  {
				base = base + motorDireito.getPotencia();
			}

			
			this.setVelocidade(this.getVelocidade() + base);
			System.out.println("Aviao a " + this.getVelocidade() + "km/h");
			atualizarStatusVoo();
		} else {
			System.out.println("ERRO: Motor desligado");
		}
	}

	public void desacelerar() {

		float base = 0.0f;

		if (this.getEstadoMotor()) {

			if (this.getVelocidade() > 0.0f) {

				base = 0;

				if (! motorEsquerdo.getAtivo())  {
					base = base + motorEsquerdo.getPotencia();
				}
				
				if (! motorDireito.getAtivo())  {
					base = base + motorDireito.getPotencia();
				}

				this.setVelocidade(this.getVelocidade() - base);
			}

			System.out.println("Aviao a " + this.getVelocidade() + "km/h");
			atualizarStatusVoo();

		} else {
			System.out.println("ERRO: Motor desligado");
		}
	}

	public boolean getmotorEsquerdo() {
		return motorEsquerdo.getAtivo();
	}

	public boolean getmotorDireito() {
		return motorDireito.getAtivo();
	}

	public void setmotorEsquerdo(boolean novoValor) {
		this.motorEsquerdo.setAtivo(novoValor);
	}	

	public void setmotorDireito(boolean novoValor) {
		this.motorDireito.setAtivo(novoValor);
	}	

	public void ligarMotor(Motor motorE, Motor motorD) {

		if (! getmotorEsquerdo()) {
			setmotorEsquerdo(true);
			motorE.ligar();
		} else {
			
		}
		
		if (! getmotorDireito()) {
			setmotorDireito(true);
			motorD.ligar();
		} else {
			
		}
		
	}

	public void ligarMotorEsquerdo(Motor motorE) {

		if (! getmotorEsquerdo()) {
			setmotorEsquerdo(true);
			motorE.ligar();
		} else {
			
		}
		
		
	}

	public void ligarMotorDireito(Motor motorD) {

		if (! getmotorDireito()) {
			setmotorDireito(true);
			motorD.ligar();
		} else {
			
		}
		
	}


	public void desligarMotor(Motor motorE, Motor motorD){

		if (getmotorEsquerdo()) {
			setmotorEsquerdo(false);
			motorE.desligar();
		} else {
			
		}

		if (getmotorDireito()) {
			setmotorDireito(false);
			motorD.desligar();
		} else {
			
		}

	}

	public void desligarMotorEsquerdo(Motor motorE){

		if (getmotorEsquerdo()) {
			setmotorEsquerdo(false);
			motorE.desligar();
		} else {
			
		}

	}

	public void desligarMotorDireito(Motor motorD){

		if (getmotorDireito()) {
			setmotorDireito(false);
			motorD.desligar();
		} else {
			
		}

	}


	public Boolean adicionarPassageiro(Passageiro obj){
        if(!getEmVoo()){
            ListaPassageiros.add(obj);
            return true;
        }else{
            System.out.println("Protocolos de segurança não permitem embarques com a aeronave em movimento");
            return false;
        }
    }

    public void desembarcarPassageiros(){
        if(!getEmVoo()){
            for(Passageiro p: ListaPassageiros){
                System.out.println(p.getprimeiroNome()+" "+p.getultimoNome()+" desembarcou da aeronave!");
            }
            ListaPassageiros.removeAll(ListaPassageiros);
        }else{
            System.out.println("Protocolos de segurança não permitem desembarques com a aeronave em movimento");
        }
    }

    public void imprimirListaDePassageiro(){
        for(Passageiro p: ListaPassageiros){
            System.out.println(p.getprimeiroNome()+" "+p.getultimoNome()+" "+p.getcpf());
        }
    }

	public Passageiro buscaPassageiroPorCpf(String cpf){
        for(Passageiro p : ListaPassageiros){
            if(p.getcpf()==cpf){
                return p;
            }
        }
        return null;
    }

}

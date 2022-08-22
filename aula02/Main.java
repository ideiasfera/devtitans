
class Main{

	public static void main(String[] args) {
		
        Passageiro Passageiro1 = new Passageiro("Bruno","Seabra","88785823287");
        Passageiro Passageiro2 = new Passageiro("Barbara","Seabra","11111111111");
        Passageiro Passageiro3 = new Passageiro("Jane","Seabra","22222222222");
        Passageiro Passageiro4 = new Passageiro("João","Bosco","33333333333");
        Passageiro Passageiro5 = new Passageiro("Pedro","Ramos","44444444444");

        MotorTurbinado asaEsquerda = new MotorTurbinado("Motor Esquerdo", 50.0f);
        MotorTurbinado asaDireita = new MotorTurbinado("Motor Direito", 50.0f);

		Aviao baraoVermelho;
		
		baraoVermelho = new Aviao("Fokker DR1", "Freiherr", asaEsquerda, asaDireita);
		baraoVermelho.imprimaOk();

		System.out.println( "Modelo: "+baraoVermelho.getModelo()+
							"\nId: "+baraoVermelho.getIdentificador()+
							"\nAltura: "+baraoVermelho.getAltura());


		baraoVermelho.ligarMotorEsquerdo(asaEsquerda);
		baraoVermelho.imprimeEstadoMotor();
		baraoVermelho.desligarMotorEsquerdo(asaEsquerda);
		baraoVermelho.imprimeEstadoMotor();
		
		baraoVermelho.ligarMotorEsquerdo(asaEsquerda);
		
        baraoVermelho.adicionarPassageiro(Passageiro1);
        baraoVermelho.adicionarPassageiro(Passageiro2);
        baraoVermelho.adicionarPassageiro(Passageiro3);
        baraoVermelho.adicionarPassageiro(Passageiro4);
        baraoVermelho.adicionarPassageiro(Passageiro5);   
		
		
		baraoVermelho.acelerar();
		baraoVermelho.acelerar();
		baraoVermelho.desligarMotorEsquerdo(asaEsquerda);
		baraoVermelho.acelerar();

		baraoVermelho.ligarMotorEsquerdo(asaEsquerda);
		baraoVermelho.desacelerar();
		baraoVermelho.desacelerar();
		baraoVermelho.desacelerar();
		baraoVermelho.desligarMotorEsquerdo(asaEsquerda);
		baraoVermelho.desacelerar();

		baraoVermelho.ligarMotorEsquerdo(asaEsquerda);
		baraoVermelho.acelerar();
		baraoVermelho.acelerar();
		baraoVermelho.acelerar();
		baraoVermelho.acelerar();
		baraoVermelho.acelerar();
	
        baraoVermelho.imprimirListaDePassageiro();

		baraoVermelho.desacelerar();
		baraoVermelho.desacelerar();
		baraoVermelho.desacelerar();
		baraoVermelho.desacelerar();
		baraoVermelho.desacelerar();
		baraoVermelho.desacelerar();

        baraoVermelho.desembarcarPassageiros();

	}

}
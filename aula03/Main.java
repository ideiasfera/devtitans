
class Main{

	public static void main(String[] args) {
		

		Passageiro Passageiro1,Passageiro2, Passageiro3, Passageiro4, Passageiro5;	

		AguiaGigante Aguia1, Aguia2;
		
		Motor Motor1, Motor2;

		Aviao baraoVermelho;

        Passageiro1 = new Passageiro("Bruno","Seabra","88785823287");
        Passageiro2 = new Passageiro("Barbara","Seabra","11111111111");
        Passageiro3 = new Passageiro("Jane","Seabra","22222222222");
        Passageiro4 = new Passageiro("João","Bosco","33333333333");
        Passageiro5 = new Passageiro("Pedro","Ramos","44444444444");

		Aguia1 = new AguiaGigante("Aguia 1", 10, 1);
		Aguia2 = new AguiaGigante("Aguia 2", 20, 2);

		Motor1 = new Motor("Motor A", 50f);
		Motor2 = new Motor("Motor B", 50f);

        MotorTurbinado asaEsquerda = new MotorTurbinado("Motor Esquerdo", 50.0f);
        MotorTurbinado asaDireita = new MotorTurbinado("Motor Direito", 50.0f);

		
		
		baraoVermelho = new Aviao("Fokker DR1", "Freiherr", Aguia1, Aguia2);
		baraoVermelho.imprimaOk();

		System.out.println( "Modelo: "+baraoVermelho.getModelo()+
							"\nId: "+baraoVermelho.getIdentificador()+
							"\nAltura: "+baraoVermelho.getAltura());


		baraoVermelho.ligarMotor();
		
        baraoVermelho.adicionarPassageiro(Passageiro1);
        baraoVermelho.adicionarPassageiro(Passageiro2);
        baraoVermelho.adicionarPassageiro(Passageiro3);
        baraoVermelho.adicionarPassageiro(Passageiro4);
        baraoVermelho.adicionarPassageiro(Passageiro5);   
		
		baraoVermelho.desligarMotor();

		baraoVermelho.ligarMotor();
		baraoVermelho.acelerar();
		baraoVermelho.acelerar();
		baraoVermelho.desligarMotor();

		baraoVermelho.acelerar();

		baraoVermelho.ligarMotor();

		baraoVermelho.desacelerar();
		baraoVermelho.desacelerar();
		baraoVermelho.desacelerar();

		baraoVermelho.desligarMotor();

		baraoVermelho.desacelerar();

		baraoVermelho.ligarMotor();
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
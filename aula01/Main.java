class Main{

	public static void main(String[] args) {
		
		Aviao baraoVermelho;
		
		//baraoVermelho = new Aviao();
		baraoVermelho = new Aviao("Fokker DR1", "Freiherr");
		baraoVermelho.imprimaOk();

		/*
		baraoVermelho.setModelo("Fokker DR1");
		baraoVermelho.setIdentificador("Freiherr");
		baraoVermelho.setMotor(false);
		baraoVermelho.setAltura(0.0f);
		*/
		
		System.out.println( "Modelo: "+baraoVermelho.getModelo()+
							"\nId: "+baraoVermelho.getIdentificador()+
							"\nStatus Motor: "+baraoVermelho.getMotor()+
							"\nAltura: "+baraoVermelho.getAltura());

		baraoVermelho.ligaMotor();
		baraoVermelho.imprimeEstadoMotor();
		baraoVermelho.desligaMotor();
		baraoVermelho.imprimeEstadoMotor();
		
		baraoVermelho.ligaMotor();
		baraoVermelho.acelerar();
		baraoVermelho.acelerar();
		baraoVermelho.desligaMotor();
		baraoVermelho.acelerar();

		baraoVermelho.ligaMotor();
		baraoVermelho.desacelerar();
		baraoVermelho.desacelerar();
		baraoVermelho.desacelerar();
		baraoVermelho.desligaMotor();
		baraoVermelho.desacelerar();

		baraoVermelho.ligaMotor();
		baraoVermelho.acelerar();
		baraoVermelho.acelerar();
		baraoVermelho.acelerar();
		baraoVermelho.acelerar();
		baraoVermelho.acelerar();
		baraoVermelho.desacelerar();
		baraoVermelho.desacelerar();
		baraoVermelho.desacelerar();
		baraoVermelho.desacelerar();
		baraoVermelho.desacelerar();
		baraoVermelho.desacelerar();

		

	}

}
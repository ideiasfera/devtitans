
class MotorTurbinado extends Motor{

    MotorTurbinado(String novoModelo,Float novaPotencia){
        super(novoModelo,novaPotencia);
    }

    public void ligar(){
        super.ligar();
        System.out.println("TRUMMMMMMMâ€¦.");
    }

    public float getPotencia(){
        return(super.getPotencia() * 1.2f);
    }

}

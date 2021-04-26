abstract public class Solido {
    //attributi
    private double pesoSpecifico;

    //Costruttori
    public Solido(){

    }
    public Solido(double pesoSpecifico){
        setPesoSpecifico(pesoSpecifico);   
    }

    public void setPesoSpecifico(double pesoSpecifico) {
        this.pesoSpecifico = pesoSpecifico;
    }
    public double getPesoSpecifico() {
        return pesoSpecifico;
    }

    abstract public double superficie();
    abstract public double volume();

    public double peso(){
        return getPesoSpecifico();
    }
    
}

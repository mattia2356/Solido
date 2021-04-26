public class Sfera extends Solido{
    //Attributi
    private double raggio;

    //Costruttori
    public Sfera(){

    }

    public Sfera(double pesoSpecifico, double raggio){
        super(pesoSpecifico);
        setRaggio(raggio);
    }

    //Setter && Getter
    public void setRaggio(double raggio) {
        this.raggio = raggio;
    }
    public double getRaggio() {
        return raggio;
    }

    //Metodi
    @Override
    public double superficie() {
        return(4*(Math.PI*Math.pow(getRaggio(),2)));
    }
    @Override
    public double volume() {
        return(4*Math.PI*(Math.pow(getRaggio(), 3)/3));
    }
}

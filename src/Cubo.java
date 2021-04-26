public class Cubo extends Solido{
    //Attributi
    private double lato;

    //Costruttori
    public Cubo(){

    }

    public Cubo(double pesoSpecifico, double lato){
        super(pesoSpecifico);
        setLato(lato);
    }

    //Setter && Getter
    public void setLato(double lato) {
        this.lato = lato;
    }
    public double getLato() {
        return lato;
    }

    //Metodi
    public double volume()
    {
        double volume;
        volume = Math.pow(getLato(), 3);
        return volume;
    }

    //calcolo della superficie
    public double superficie()
    {
        double superficie;
        superficie = 6*Math.pow(getLato(), 2);
        return superficie;
    }
}

public class Cilindro extends Solido{
    //attributi
    private double raggio;
    private double altezza;

    public Cilindro(){

    }
    public Cilindro(double raggio, double altezza, double pesoSpecifico){
        super(pesoSpecifico);
        setAltezza(altezza);
        setRaggio(raggio);
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }
    public void setRaggio(double raggio) {
        this.raggio = raggio;
    }
    public double getAltezza() {
        return altezza;
    }
    public double getRaggio() {
        return raggio;
    }
    @Override
    public double superficie() {
        return(Math.PI * Math.pow(getRaggio(), 2) * altezza);
    }
    @Override
    public double volume() {
        return(Math.PI * Math.pow(getRaggio(), 2));
    }
}

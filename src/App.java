public class App {
    public static void main(String[] args) throws Exception {
        Solido sfera = new Sfera(1.0, 0.5);
        Solido cubo = new Cubo(3.0, 1.1);
        System.out.println("Sfera --> volume: "+sfera.volume());
        System.out.println("Sfera --> peso: "+sfera.peso());
        System.out.println("Cubo --> volume: "+cubo.volume());
        System.out.println("Cubo --> volume: "+cubo.peso());
        //-----------------------------------------------------//
        Solido solido1 = sfera;
        System.out.println("Solido1 --> volume: "+solido1.volume());
        System.out.println("Solido1 --> peso: "+solido1.peso());
        //-----------------------------------------------------//
        Solido solido2 = cubo;
        System.out.println("Solido2 --> volume: "+solido2.volume());
        System.out.println("Solido2 --> peso: "+solido2.peso());
    }
}

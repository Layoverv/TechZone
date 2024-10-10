class Planeta {
    
    private String nombre;
    private int cantidadSatellites;
    private double masa;
    private double volumen;
    private double diametro;
    private double distanciaAlSol;
    private boolean esObservable;

    
    public Planeta(String nombre, int cantidadSatellites, double masa, double volumen, double diametro, double distanciaAlSol, boolean esObservable) {
        this.nombre = nombre;
        this.cantidadSatellites = cantidadSatellites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distanciaAlSol = distanciaAlSol;
        this.esObservable = esObservable;
    }

    
    public String getNombre() {
        return nombre;
    }

    
    public void imprimirValores() {
        System.out.println("Nombre del planeta: " + nombre);
        System.out.println("Cantidad de satélites: " + cantidadSatellites);
        System.out.println("Masa: " + masa + " kg");
        System.out.println("Volumen: " + volumen + " m^3");
        System.out.println("Diámetro: " + diametro + " km");
        System.out.println("Distancia al sol: " + distanciaAlSol + " km");
        System.out.println("Es observable: " + esObservable);
    }

    
    public double calcularDensidad() {
        return masa / volumen;
    }
}

public class Main {
    public static void main(String[] args) {
        // Creación del objeto P1: Tierra
        Planeta p1 = new Planeta("TierraDeJose", 1, 5.9736E24, 1.08321E12, 12742, 150000000, true);
        p1.imprimirValores();
        System.out.println("Densidad de " + p1.getNombre() + ": " + p1.calcularDensidad() + " kg/m^3");
        
        Planeta p2 = new Planeta("JúpiterDeJose", 79, 1.899E27, 1.4313E15, 139820, 750000000, true);
        p2.imprimirValores();
        System.out.println("Densidad de " + p2.getNombre() + ": " + p2.calcularDensidad() + " kg/m^3");
    }
}

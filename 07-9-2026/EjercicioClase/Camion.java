public class Camion extends Vehiculo implements Cargable {
    private double capacidadMaximaCarga;
    private double cargaActual;

    public Camion(String codigo, String marca, String modelo, int anio, double velocidadActual, double cantidadMaximaCarga, double cargaActual) {
        super(codigo, marca, modelo, anio, velocidadActual);
        this.capacidadMaximaCarga = cantidadMaximaCarga;
        this.cargaActual = cargaActual;
    }

    public double getCapacidadMaximaCarga() {
        return capacidadMaximaCarga;
    }

    public void setCapacidadMaximaCarga(double capacidadMaximaCarga) {
        this.capacidadMaximaCarga = capacidadMaximaCarga;
    }

    public double getCargaActual() {
        return cargaActual;
    }

    public void setCargaActual(double cargaActual) {
        this.cargaActual = cargaActual;
    }

    @Override 
    public void conducir() {
        System.out.println("Conduciendo el camion " + getMarca() + " " + getModelo());
    }

    @Override 
    public void cargar(double peso) {
        if (cargaActual + peso <= capacidadMaximaCarga) {
            cargaActual += peso;
            System.out.println("Cargando peso. Carga actual: " + cargaActual);
        }
        else {
            System.out.println("No se puede cargar, excede el limite.");
        }
    }

    @Override 
    public void descargar() {
        cargaActual = 0;
        System.out.println("Camion descargado completamente.");
    }

    @Override 
    public String toString() {
        return super.toString() + ", Capacidad max: " + capacidadMaximaCarga + ", Carga actual: " + cargaActual;
        
    }
}
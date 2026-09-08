public class Motocicleta extends Vehiculo {
    private int cilindrada;

    public Motocicleta(String codigo, String marca, String modelo, int anio, double velocidadActual, int cilindrada) {
        super(codigo, marca, modelo, anio, velocidadActual);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override 
    public void conducir() {
        System.out.println("Conduciendo la moto " + getMarca() + " " + getModelo());
    }

    @Override
    public String toString() {
        return super.toString() + ", Cilindrada: " + cilindrada;
    }
}
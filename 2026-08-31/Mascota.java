public class Mascota {
    private String nombre;
    private String especie;
    private int edad;
    private double peso;

    public Mascota(String nombre, String especie, int edad, double peso) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.peso = peso;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Peso: " + peso + " kg");
    }

    public void clasificarPeso() {
        if (peso < 2) {
            System.out.println("Clasificación: Bajo peso");
        } else if (peso <= 10) {
            System.out.println("Clasificación: Peso normal");
        } else {
            System.out.println("Clasificación: Sobrepeso");
        }
    }
}
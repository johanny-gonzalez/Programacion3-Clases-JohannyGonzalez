public class Main {
    public static void main(String[] args) {
        Mascota m1 = new Mascota("Pelusa", "conejo", 1, 1.5);
        Mascota m2 = new Mascota("Michi", "gato", 3, 4.5);
        Mascota m3 = new Mascota("Max", "perro", 5, 14.2);

        m1.mostrarDatos();
        m1.clasificarPeso();
        System.out.println();

        m2.mostrarDatos();
        m2.clasificarPeso();
        System.out.println();

        m3.mostrarDatos();
        m3.clasificarPeso();
    }
}
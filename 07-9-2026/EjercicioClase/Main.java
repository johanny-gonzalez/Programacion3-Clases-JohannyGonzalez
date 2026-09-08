public class Main {
    public static void main(String[] args) {
        Vehiculo[] vehiculos = new Vehiculo[5];

        vehiculos[0] = new Automovil("A1", "Toyota", "Corolla", 2020, 50, 4);
        vehiculos[1] = new Motocicleta("M1", "Yamaha", "DT", 2021, 40, 125);
        vehiculos[2] = new Camion("C1", "Volvo", "FH", 2019, 30, 5000, 1000);
        vehiculos[3] = new Automovil("A2", "Honda", "Civic", 2022, 60, 4);
        vehiculos[4] = new Camion("C2", "Mack", "Anthem", 2018, 20, 8000, 2000);

        for (int i = 0; i < vehiculos.length; i++) {
            System.out.println("Tipo real: " + vehiculos[i].getClass().getName());
            System.out.println(vehiculos[i].toString());
            vehiculos[i].conducir();

            if (vehiculos[i] instanceof Cargable) {
                System.out.println("Este vehiculo se puede cargar.");
                Cargable c = (Cargable) vehiculos[i];
                c.cargar(500);
                c.descargar();
            }

            System.out.println("--------------------------------");
        }
    }
}
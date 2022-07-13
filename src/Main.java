public class Main {
    public static void main(String[] args) {
        // Asignación de valores e impresión

        System.out.println("Impresión del objeto CLIENTE");
        Cliente cliente = new Cliente();
        cliente.edad = 25;
        cliente.telefono = "5550484178";
        cliente.nombre = "Maria";
        cliente.credito = 25000.70;
        System.out.println(cliente.edad);
        System.out.println(cliente.telefono);
        System.out.println(cliente.nombre);
        System.out.println(cliente.credito);

        System.out.println("Impresión del objeto TRABAJADOR");
        Trabajador trabajador = new Trabajador();
        trabajador.edad = 41;
        trabajador.telefono = "5550784512";
        trabajador.nombre = "Ulises";
        trabajador.salario = 2600.49;
        System.out.println(trabajador.edad);
        System.out.println(trabajador.telefono);
        System.out.println(trabajador.nombre);
        System.out.println(trabajador.salario);

    }
}
// Clase padre
class Persona {
    int edad;
    String nombre;
    String telefono;
}

// Clases hijas
class Cliente extends Persona {
    double credito;
}

class Trabajador extends Persona {
    double salario;
}
package Actividades;

public class Laptop {
    private String marca;
    private String modelo;
    private int memoriaRam;
    private int almacenamiento;
    private boolean encendida;

    // Constructor

    public Laptop(String marca, String modelo, int memoriaRam, int almacenamiento) {
        this.marca = marca;
        this.modelo = modelo;
        this.memoriaRam = memoriaRam;
        this.almacenamiento = almacenamiento;
        this.encendida = false;
    }

    // Metodo privado para encender la laptop

    private void encendida() {
        if (!encendida) {
            encendida = true;
            System.out.println("Laptop" + marca + " " + modelo + " está encendida");
        } else {
            System.out.println("La laptop" + marca + " " + modelo + "ya esta encendida");
        }
    }

    //Metodo privado para apagar la laptop

    private void apagar() {
        if (encendida) {
            encendida = false;
            System.out.println("Laptop" + marca + " " + modelo + " está apagada");
        } else {
            System.out.println("La laptop" + marca + " " + modelo + "ya esta apagada");
        }
    }

    //Metodo principal para ejercutar el programa

    public static void main(String[] args) {
        Laptop miLaptop = new Laptop("Asus", "Vivobook", 16, 1000);

        // Llamamos a los metodos privados usando metodos publicos o desde dentro de la clase
        miLaptop.usarLaptop(true);
        miLaptop.usarLaptop(false);
    }
    // Metodo publico para usar la laptop (endender/apagar)

    public void usarLaptop(boolean encendida) {
        if (encendida) {
            this.encendida();
        } else {
            this.apagar();
        }
    }
}

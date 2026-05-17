public class VentanaComputador implements Observer {

    @Override
    public void actualizar(float temperatura) {
        mostrarEnVentana(temperatura);
    }

    public void mostrarEnVentana(float numero) {
        System.out.println("Ventana Computador: " + numero + " °C");
    }
}
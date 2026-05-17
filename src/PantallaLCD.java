public class PantallaLCD implements Observer {

    @Override
    public void actualizar(float temperatura) {
        mostrarEnPantalla(temperatura);
    }

    public void mostrarEnPantalla(float numero) {
        System.out.println("Pantalla LCD: " + numero + " °C");
    }
}
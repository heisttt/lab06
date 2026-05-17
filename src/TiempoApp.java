public class TiempoApp {

    public static void main(String[] args) {

        MonitorTiempo monitor = new MonitorTiempo();

        PantallaLCD lcd = new PantallaLCD();
        VentanaComputador ventana = new VentanaComputador();
        PantallaRelojInteligente reloj = new PantallaRelojInteligente();

        monitor.agregarObserver(lcd);
        monitor.agregarObserver(ventana);
        monitor.agregarObserver(reloj);

        System.out.println("Primera actualización:");
        monitor.setTemperatura(25.0f);

        System.out.println();

        System.out.println("Segunda actualización:");
        monitor.setTemperatura(30.5f);

        System.out.println();

        monitor.eliminarObserver(ventana);

        System.out.println("Tercera actualización:");
        monitor.setTemperatura(18.2f);
    }
}
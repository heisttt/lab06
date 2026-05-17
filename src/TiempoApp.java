public class TiempoApp {

    public static void main(String[] args) {

        MonitorTiempo monitor = new MonitorTiempo();

        PantallaLCD lcd = new PantallaLCD();
        VentanaComputador ventana = new VentanaComputador();
        PantallaRelojInteligente reloj = new PantallaRelojInteligente();

        monitor.agregarObserver(lcd);
        monitor.agregarObserver(ventana);
        monitor.agregarObserver(reloj);

        System.out.println("Primera actualizacion:");
        monitor.setTemperatura(20);

        System.out.println();

        System.out.println("Segunda actualizacion:");
        monitor.setTemperatura(20);

        System.out.println();

        monitor.eliminarObserver(ventana);

        System.out.println("Tercera actualizacion:");
        monitor.setTemperatura(20);
    }
}
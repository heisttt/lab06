public class MonitorTiempo implements Subject {

    private Observer[] observers;
    private int cantidad;
    private float temperatura;

    public MonitorTiempo() {
        observers = new Observer[10];
        cantidad = 0;
    }

    @Override
    public void agregarObserver(Observer o) {
        observers[cantidad] = o;
        cantidad++;
    }

    @Override
    public void eliminarObserver(Observer o) {

        for (int i = 0; i < cantidad; i++) {

            if (observers[i] == o) {

                for (int j = i; j < cantidad - 1; j++) {
                    observers[j] = observers[j + 1];
                }

                cantidad--;
                break;
            }
        }
    }

    @Override
    public void notificarObservers() {

        for (int i = 0; i < cantidad; i++) {
            observers[i].actualizar(temperatura);
        }
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
        notificarObservers();
    }

    public float getTemperatura() {
        return temperatura;
    }
}
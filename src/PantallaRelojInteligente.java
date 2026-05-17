public class PantallaRelojInteligente implements Observer {

    @Override
    public void actualizar(float temperatura) {
        mostrarEnReloj(temperatura);
    }

    public void mostrarEnReloj(float numero) {
        System.out.println("Reloj Inteligente: " + numero);
    }
}
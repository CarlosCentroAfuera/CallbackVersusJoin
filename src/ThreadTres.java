public class ThreadTres extends Thread{

    Descargable c;

    interface Descargable {
        void descargaIniciada();

        void bloqueDescargado();

        void descargaFinalizada();

        void mostrarNombreDelFichero(String nombreFichero);
    }

    public ThreadTres(Descargable descargable) {
        c = descargable;
    }

    private String nombreFicheroDescargado;
    @Override
    public void run() {
        try {
            // Inicio descarga
            c.descargaIniciada();
            // Descarga del bloque 1
            sleep(2000);
            c.bloqueDescargado();
            // Descarga del bloque 2
            sleep(2000);
            c.bloqueDescargado();
            // Descarga del bloque 3
            sleep(2000);
            c.bloqueDescargado();
            // Descarga del bloque 4
            sleep(2000);
            c.bloqueDescargado();
            // Fin descarga
            c.descargaFinalizada();
            nombreFicheroDescargado = "temp.txt";
            c.mostrarNombreDelFichero(nombreFicheroDescargado);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

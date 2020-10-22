public class ThreadTres extends Thread{

    ClasePrincipalTres c;
    public ThreadTres(ClasePrincipalTres clasePrincipalTres) {
        c = clasePrincipalTres;
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

public class ClasePrincipalTres {

    public ClasePrincipalTres() throws InterruptedException {
        System.out.println("Comienza la descarga de internet");
        ThreadTres t3 = new ThreadTres(this);
        t3.start();
        System.out.println("El usuario ya puede hacer otras cosas...");

    }


    public void descargaIniciada() {
        System.out.print("[");
    }

    public void bloqueDescargado(){
        System.out.print("=");
    }

    public void descargaFinalizada(){
        System.out.print("]");
    }

    public void mostrarNombreDelFichero(String nombre){
        System.out.print("El nombre fichero descargado es " + nombre);
    }
}

public class ClasePrincipalTres implements ThreadTres.Descargable {

    public ClasePrincipalTres() throws InterruptedException {
        System.out.println("Comienza la descarga de internet");
        ThreadTres t3 = new ThreadTres(this);
        t3.start();
        System.out.println("El usuario ya puede hacer otras cosas...");

    }

    public void detallesDescargaIniciada(){
        System.out.print("He comenzado la descarga a las " + System.currentTimeMillis());
    }

    @Override
    public void descargaIniciada() {
        detallesDescargaIniciada();
        System.out.print("[");
    }

    @Override
    public void bloqueDescargado(){
        System.out.print("=");
    }

    @Override
    public void descargaFinalizada(){
        System.out.print("]");
    }

    @Override
    public void mostrarNombreDelFichero(String nombre){
        System.out.print("El nombre fichero descargado es " + nombre);
    }
}

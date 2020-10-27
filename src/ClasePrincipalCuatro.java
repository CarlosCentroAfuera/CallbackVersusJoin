public class ClasePrincipalCuatro implements ThreadTres.Descargable {

    public ClasePrincipalCuatro() throws InterruptedException {
        System.out.println("Comienza la descarga de la intranet");
        ThreadTres t3 = new ThreadTres(this);
        t3.start();
        System.out.println("El usuario ya puede hacer otras cosas...");

    }


    @Override
    public void descargaIniciada() {
        System.out.print("(");
    }

    @Override
    public void bloqueDescargado(){
        System.out.print("--");
    }

    @Override
    public void descargaFinalizada(){
        System.out.print(")");
    }

    @Override
    public void mostrarNombreDelFichero(String nombre){
        System.out.print("El nombre fichero descargado es " + nombre);
    }
}

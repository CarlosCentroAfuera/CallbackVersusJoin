public class ClasePrincipalUno {

    String nombre;

    public ClasePrincipalUno(String nombre) throws InterruptedException {
        this.nombre = nombre;
        System.out.println("ClasePrincipal - Entro");
        ThreadUno t1 = new ThreadUno(this);
        t1.start();

        System.out.println("ClasePrincipal - Salgo");
    }

    public void decirQueBienLoHeHecho(){
        System.out.println("Que bien lo ha hecho " + nombre);
    }

}

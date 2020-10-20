public class ClasePrincipalUno {

    public ClasePrincipalUno() throws InterruptedException {
        System.out.println("ClasePrincipal - Entro");
        ThreadUno t1 = new ThreadUno(this);
        t1.start();

        System.out.println("ClasePrincipal - Salgo");
    }

    public void decirHola(){
        System.out.println("Hola");
    }

}

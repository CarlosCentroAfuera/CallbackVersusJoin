public class ClasePrincipalDos {

    public ClasePrincipalDos() throws InterruptedException {
        System.out.println("ClasePrincipalDos - Entro");
        ThreadDos t1 = new ThreadDos(this);
        t1.start();
        System.out.println("ClasePrincipalDos - Salgo");
    }

    public void decirHola(String s){
        System.out.println("Hola de parte del " + s);
    }
}

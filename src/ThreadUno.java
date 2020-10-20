public class ThreadUno extends Thread{
    ClasePrincipalUno clasePrincipalUno;

    public ThreadUno(ClasePrincipalUno clasePrincipalUno){
        this.clasePrincipalUno = clasePrincipalUno;
    }

    @Override
    public void run() {
        try {
            System.out.println("TheardUno - Entro");
            sleep(2000);
            clasePrincipalUno.decirHola();
            System.out.println("TheardUno - Salgo");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

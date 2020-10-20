public class ThreadDos extends Thread {

    ClasePrincipalDos clasePrincipal;

    public ThreadDos(ClasePrincipalDos clasePrincipal){
        this.clasePrincipal = clasePrincipal;
    }

    @Override
    public void run() {
        try {
            System.out.println("TheardUno - Entro");
            for (int i = 0; i < 5; i++){
                sleep(2000);
                clasePrincipal.decirHola("Soy el ThreadDos");
            }
            System.out.println("TheardUno - Salgo");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }



}



//Override


public class Teste2 {
        public void fazAlgo() {
              System.out.println("Este � o m�todo da super classe");
        }
   }
 class NovoTeste extends Teste2 {
        @Override
        public void fazAlgo() {
              System.out.println("Este � o m�todo foi sobrescrito");
        }
   
   public static void main(String args[]){
        Teste2 T = new Teste2();
        T.fazAlgo(); // Retorna "Este � o m�todo da super classe"
       NovoTeste  TN = new NovoTeste();
        TN.fazAlgo(); // Retorna "Este m�todo foi sobrescrito"
   }}
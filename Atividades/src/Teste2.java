//Override


public class Teste2 {
        public void fazAlgo() {
              System.out.println("Este é o método da super classe");
        }
   }
 class NovoTeste extends Teste2 {
        @Override
        public void fazAlgo() {
              System.out.println("Este é o método foi sobrescrito");
        }
   
   public static void main(String args[]){
        Teste2 T = new Teste2();
        T.fazAlgo(); // Retorna "Este é o método da super classe"
       NovoTeste  TN = new NovoTeste();
        TN.fazAlgo(); // Retorna "Este método foi sobrescrito"
   }}
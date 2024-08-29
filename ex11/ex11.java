package ex11;

public class ex11 {
   public static void main(String[] args) {}
       String nome;
       int populacao;
       String estado;

       void aumentarPopulacao ( int quantidade){
           populacao += quantidade;
           System.out.println("a populacao de " + nome + " aumentou para " + populacao + " habitantes.");
       }

       void diminuirPopulacao ( int quantidade){
           if (quantidade <= populacao) {
               populacao -= quantidade;
               System.out.println("a populacao de " + nome + " diminuiu para " + populacao + " habitantes.");
           } else {
               System.out.println("quantidade maior que a população atual.");
           }
       }
}

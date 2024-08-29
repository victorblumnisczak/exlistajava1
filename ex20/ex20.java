package ex20;

public class ex20 {
    public static void main(String[] args) {}
    String nome;
    String CNPJ;
    int numeroFuncionarios;

    void contratar() {
        numeroFuncionarios++;
        System.out.println("Contratando funcionário. Número de funcionários: " + numeroFuncionarios);
    }

    void demitir() {
        if (numeroFuncionarios > 0) {
            numeroFuncionarios--;
            System.out.println("Demitindo funcionário. Número de funcionários: " + numeroFuncionarios);
        } else {
            System.out.println("Não há funcionários para demitir.");
        }
    }
}

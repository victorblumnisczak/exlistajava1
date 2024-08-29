package ex15;

public class ex15 {
    public static void main(String[] args) {}
    String nome;
    String endereco;
    String telefone;
    boolean aberta = false;

    void abrir() {
        if (!aberta) {
            aberta = true;
            System.out.println("A loja " + nome + " está aberta.");
        } else {
            System.out.println("A loja " + nome + " já está aberta.");
        }
    }

    void fechar() {
        if (aberta) {
            aberta = false;
            System.out.println("A loja " + nome + " está fechada.");
        } else {
            System.out.println("A loja " + nome + " já está fechada.");
        }
    }
}


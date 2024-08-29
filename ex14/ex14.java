package ex14;

public class ex14 {
    public static void main(String[] args) {}
    String nome;
    String genero;
    double preco;
    boolean emAndamento = false;

    void iniciar() {
        if (!emAndamento) {
            emAndamento = true;
            System.out.println("iniciando o jogo " + nome + ".");
        } else {
            System.out.println("o jogo " + nome + " ja esta em andamento.");
        }
    }

    void pausar() {
        if (emAndamento) {
            emAndamento = false;
            System.out.println("pausando o jogo " + nome + ".");
        } else {
            System.out.println("o jogo " + nome + " ja esta pausado.");
        }
    }
}


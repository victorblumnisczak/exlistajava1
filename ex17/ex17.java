package ex17;

public class ex17 {
    public static void main(String[] args) {}
    String titulo;
    String autor;
    double tamanhoArquivo;
    boolean aberto = false;

    void abrir() {
        if (!aberto) {
            aberto = true;
            System.out.println("Abrindo o livro digital " + titulo + ".");
        } else {
            System.out.println("O livro digital " + titulo + " já está aberto.");
        }
    }

    void fechar() {
        if (aberto) {
            aberto = false;
            System.out.println("Fechando o livro digital " + titulo + ".");
        } else {
            System.out.println("O livro digital " + titulo + " já está fechado.");
        }
    }
}

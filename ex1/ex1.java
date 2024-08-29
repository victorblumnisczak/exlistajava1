package ex1;

public class ex1 {
    public static void main(String[] args) {}
        String titulo;
        String autor;
        int numeroDePaginas;
        int paginaAtual = 0;

        void abrir () {
            System.out.println("Abrindo o livro " + titulo);
        }

        void lerPagina () {
            if (paginaAtual < numeroDePaginas) {
                paginaAtual++;
                System.out.println("Lendo página " + paginaAtual);
            } else {
                System.out.println("Você já terminou de ler o livro.");
            }
        }
    }


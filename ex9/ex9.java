package ex9;

public class ex9 {
    public static void main(String[] args) {}
        String nome;
        double preco;
        int qtdEstoque;

        void aumentarEstoque ( int quantidade){
            qtdEstoque += quantidade;
            System.out.println("o estoque de " + nome + " aumentando paraa " + qtdEstoque + " unidades.");
        }

        void diminuirEstoque ( int quantidade){
            if (quantidade <= qtdEstoque) {
                qtdEstoque -= quantidade;
                System.out.println("o estoque de " + nome + " diminuindo para " + qtdEstoque + " unidades.");
            } else {
                System.out.println("quantidade insuficiente.");
            }
        }
    }



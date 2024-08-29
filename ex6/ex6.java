package ex6;

public class ex6 {
    public static void main(String[] args) {}
        String processador;
        int memRAM;
        int armaz;
        boolean ligado = false;

        void ligar () {
            if (!ligado) {
                ligado = true;
                System.out.println("computador esta ligando.");
            } else {
                System.out.println("computador esta ligado.");
            }
        }

        void desligar () {
            if (ligado) {
                ligado = false;
                System.out.println("computador esta desligado.");
            } else {
                System.out.println("computador esta desligado.");
            }
        }
    }



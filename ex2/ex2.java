package ex2;

public class ex2 {
  public static void main(String[] args) {}
      String marca;
      String modelo;
      int capacidadeBateria;
      boolean ligado = false;

      void ligar () {
          if (!ligado) {
              ligado = true;
              System.out.println("Celular ligado.");
          } else {
              System.out.println("Celular já está ligado.");
          }
      }

      void desligar () {
          if (ligado) {
              ligado = false;
              System.out.println("Celular desligado.");
          } else {
              System.out.println("Celular já está desligado.");
          }
      }
  }


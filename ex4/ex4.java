package ex4;

public class ex4 {
    public static void main(String[] args) {}
    String numeroConta;
    double saldo;

    void depositar(double valor){
            saldo += valor;
            System.out.println("deposito de R$ " + valor + " realizado com sucesso. saldo atual: R$ " + saldo);
        }
    }
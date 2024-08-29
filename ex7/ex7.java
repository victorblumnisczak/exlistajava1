package ex7;

public class ex7 {
    public static void main(String[] args) {}
        String nome;
        String matricula;
        String curso;
        double[] notas;
        double calcularMedia () {
            double soma = 0;
            for (double nota : notas) {
                soma += nota;
            }
            return soma / notas.length;
        }
}


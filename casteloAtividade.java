import java.util.Scanner;

public class casteloAtividade {
    public static void main(String[] agrs) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número da dimensão: ");
        int numeroDimensao = scanner.nextInt();

        System.out.println("--- DIMENSAO " + numeroDimensao + " x " + numeroDimensao + " ---");

        int linha = 0;
        while (linha < numeroDimensao) {
            int coluna = 0;
            while (coluna < numeroDimensao) {
                boolean bordaLinha = (linha == 0 || linha == numeroDimensao - 1);
                boolean bordaColuna = (coluna == 0 || coluna == numeroDimensao - 1);

                if (bordaLinha && bordaColuna) {
                    System.out.print("+"); // canto
                } else if (bordaLinha || bordaColuna) {
                    System.out.print("#"); // borda
                } else {
                    System.out.print("."); // interior
                }

                coluna = coluna + 1;
            }
            System.out.println();
            linha = linha + 1;
        }
    }
}


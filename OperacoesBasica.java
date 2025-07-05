import java.util.Scanner;

public class OperacoesBasicas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String repetir = "s";

        while (repetir.equalsIgnoreCase("s")) {
            System.out.println("OPERAÇÕES FUNDAMENTAIS COM NÚMEROS NATURAIS");
            System.out.println("===================");
            int op;
            int n1, n2;
            System.out.println("Menu.\n");
            System.out.println("0. Notas");
            System.out.println("1. Adição");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.println("Informe a Operação que Você Deseja Realizar: ");
            op = scanner.nextInt();

            if (op == 0) {
                System.out.println("Números Inteiros:");
                System.out.println("Conjunto dos Números Naturais:\nIN{0,1,2,3,4,5,6,7,8,9,...}");
                System.out.println("");
            }

            if (op == 1) {
                System.out.println("Adição: permite determinar o número de elementos\nda união de dois ou mais conjuntos.\n");
                System.out.println("Digite o Valor da Primeira Parcela: ");
                n1 = scanner.nextInt();
                System.out.println("Digite o Valor da Segunda Parcela: ");
                n2 = scanner.nextInt();
                int soma = n1 + n2;
                System.out.println("O Valor do Total/ou Soma é: " + soma);
            }

            if (op == 2) {
                System.out.println("Subtração: permite determinar a diferença entre dois números naturais. ");
                System.out.println("Digite o Valor do Minuendo: ");
                n1 = scanner.nextInt();
                System.out.println("Digite o Valor do Subtraendo: ");
                n2 = scanner.nextInt();
                int sub = n1 - n2;
                System.out.println("O Restou/ou Diferença é: " + sub);
            }

            if (op == 3) {
                System.out.println("Subtração: é muitas vezes definida como uma adição\nde parcelas iguais.\n(2+2+2 = 3x2) (três parcelas iguais a 2)");
                System.out.println("Qualquer numéro natural multiplicado por zero é zero (4x0 = 0)\n");
                System.out.println("Digite o Valor do Primeiro Multiplicando ( Fatores ) : ");
                n1 = scanner.nextInt();
                System.out.println("Digite o Valor do Segundo Multiplicando ");
                n2 = scanner.nextInt();
                int mult = n1 * n2;
                System.out.println("A Multiplicação dos Multiplicandos ( Fatores ) é: " + mult);
            }

            if (op == 4) {
                System.out.println("Divisão: permite determinar o quociente entre dois números.\nÉ a operação inversa da multiplicação.\n( 18x4 = 72 --> 72/4 = 18)");
                System.out.println("Quociente é o resultado de uma divisão.\nQuando o dividendo é múltiplo do divisor, a divisão é exata ( 16/8 = 2)\nQuando o dividendo não é multiplo do divisor, a divisão é aproximada ou inexata ( 16/5 = 3 (resto = 1) )");
                System.out.println("Digite o Valor do Dividendo: ");
                n1 = scanner.nextInt();
                System.out.println("Digite o Valor do Divisor");
                n2 = scanner.nextInt();

                if (n2 != 0) {
                    int div = n1 / n2;
                    int resto = n1 % n2;
                    System.out.println("O Valor do Quociente é: " + div + "\nO Valor do Resto é: " + resto);
                } else {
                    System.out.println("Não é possível dividir por zero!");
                }
            }

            System.out.println("\nDeseja voltar ao menu? [s/n]");
            scanner.nextLine(); // limpar o buffer do teclado
            repetir = scanner.nextLine();
        }

        System.out.println("Fim do programa.");
        scanner.close();
    }
}

import java.util.Scanner;

public class OperacoesBasicas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuar = "s";

        while (continuar.equalsIgnoreCase("s")) {
            System.out.println("\nOPERAÇÕES FUNDAMENTAIS COM NÚMEROS NATURAIS");
            System.out.println("============================================");
            int op;
            int n1, n2;

            System.out.println("\nMenu:");
            System.out.println("0. Notas");
            System.out.println("1. Adição");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.print("Informe a Operação que Você Deseja Realizar: ");
            op = scanner.nextInt();

            if (op == 0) {
                System.out.println("Números Inteiros:");
                System.out.println("Conjunto dos Números Naturais:\nIN {0,1,2,3,4,5,6,7,8,9,...}");
            } else if (op == 1) {
                System.out.println("Adição: permite determinar o número de elementos da união de dois ou mais conjuntos.");
                System.out.print("Digite o Valor da Primeira Parcela: ");
                n1 = scanner.nextInt();
                System.out.print("Digite o Valor da Segunda Parcela: ");
                n2 = scanner.nextInt();
                int soma = n1 + n2;
                System.out.println("O Valor da Soma é: " + soma);
            } else if (op == 2) {
                System.out.println("Subtração: permite determinar a diferença entre dois números naturais.");
                System.out.print("Digite o Valor do Minuendo: ");
                n1 = scanner.nextInt();
                System.out.print("Digite o Valor do Subtraendo: ");
                n2 = scanner.nextInt();
                int sub = n1 - n2;
                System.out.println("O Resultado da Diferença é: " + sub);
            } else if (op == 3) {
                System.out.println("Multiplicação: adição de parcelas iguais (ex: 3x2 = 2+2+2)");
                System.out.print("Digite o Primeiro Fator: ");
                n1 = scanner.nextInt();
                System.out.print("Digite o Segundo Fator: ");
                n2 = scanner.nextInt();
                int mult = n1 * n2;
                System.out.println("O Resultado da Multiplicação é: " + mult);
            } else if (op == 4) {
                System.out.println("Divisão: determina o quociente entre dois números.");
                System.out.print("Digite o Valor do Dividendo: ");
                n1 = scanner.nextInt();
                System.out.print("Digite o Valor do Divisor: ");
                n2 = scanner.nextInt();

                if (n2 == 0) {
                    System.out.println("Erro: divisão por zero não é permitida!");
                } else {
                    int div = n1 / n2;
                    int resto = n1 % n2;
                    System.out.println("O Quociente é: " + div);
                    System.out.println("O Resto é: " + resto);
                }
            } else {
                System.out.println("Opção inválida.");
            }

            // Perguntar se deseja continuar
            System.out.print("\nDeseja voltar ao menu? [s/n]: ");
            scanner.nextLine(); 
            continuar = scanner.nextLine();
        }

        System.out.println("\nPrograma Encerrado.");
        scanner.close();
    }
}

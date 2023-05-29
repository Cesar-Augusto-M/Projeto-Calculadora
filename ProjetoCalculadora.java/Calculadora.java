import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Operacao calcular = new Operacao();

            while (true) {
                System.out.println("Escolha a operação:");
                System.out.println("1. Adição");
                System.out.println("2. Subtração");
                System.out.println("3. Multiplicação");
                System.out.println("4. Divisão");
                System.out.println("5. Potência");
                System.out.println("6. Raiz Quadrada");
                System.out.println("Digite 'Q' para sair.");

                String opcao = scanner.nextLine();

                if (opcao.equalsIgnoreCase("Q")) {
                    System.out.println("Programa encerrado.");
                    break;
                }

                if (opcao.matches("[1-6]")) {
                    System.out.println("Opção inválida. Tente novamente.");
                    continue;
                }

                System.out.print("Digite o primeiro número: ");
                double numeroUm = scanner.nextDouble();
                scanner.nextLine();

                if (opcao.equals("6") && numeroUm < 0) {
                    System.out.println("Não existe raiz de número negativo.");
                    continue;
                }

                System.out.print("Digite o segundo número: ");
                double numeroDois = scanner.nextDouble();
                scanner.nextLine();

                switch (opcao) {
                    case "1":
                        System.out.println("Resultado: " + calcular.adicao(numeroUm, numeroDois));
                        break;
                    case "2":
                        System.out.println("Resultado: " + calcular.subtracao(numeroUm, numeroDois));
                        break;
                    case "3":
                        System.out.println("Resultado: " + calcular.multiplicacao(numeroUm, numeroDois));
                        break;
                    case "4":
                        if (numeroDois == 0) {
                            System.out.println("Impossível realizar uma divisão por zero.");
                        } else {
                            System.out.println("Resultado: " + calcular.divisao(numeroUm, numeroDois));
                        }
                        break;
                    case "5":
                        System.out.println("Resultado: " + calcular.potencia(numeroUm, numeroDois));
                        break;
                    case "6":
                        System.out.println("Resultado: " + calcular.raizQuadrada(numeroUm));
                        break;
                }
            }
        }
    }

    private static String calcularpotencia(double numeroUm, double numeroDois) {
        return null;
    }
}



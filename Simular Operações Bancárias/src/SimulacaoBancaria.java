
import java.util.Scanner;


public class SimulacaoBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria(1000.0); 

        int opcao;
        do {
            exibirMenu();
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor a depositar: ");
                    double valorDeposito = scanner.nextDouble();
                    conta.depositar(valorDeposito);
                    break;

                case 2:
                    System.out.println("Digite o valor a sacar: ");
                    double valorSaque = scanner.nextDouble();
                    conta.sacar(valorSaque);
                    break;

                case 3:
                    conta.consultarSaldo();
                    break;
                
                case 4: 
                    System.out.println("Encerrando o programa... ");
                    break;
                
                default:
                    System.out.println("Opção inválida. Por favor, tente novamente");
                    break;
            }
        } while (opcao !=4);
        scanner.close();
    }
    public static void exibirMenu() {
        System.out.println("\n === Menu ===");
        System.out.println("1. Depositar");
        System.out.println("2. Sacar");
        System.out.println("3. Consultar saldo");
        System.out.println("4. Encerrar");
        System.out.println("Escolha uma das opções");
        
    }
    }
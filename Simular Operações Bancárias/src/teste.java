//import java.util.Scanner;

//public class SimulacaoBancaria {

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        double saldo = 0;
//        boolean continuar = true;

//        while (continuar) {
            
//            int opcao = scanner.nextInt();

//            switch (opcao) {
//                case 1:
      
//                    double valorDeposito = scanner.nextDouble();
//                    saldo += valorDeposito;
//                    System.out.printf("Saldo atual: %.1f\n", saldo);
//                    break;
//                case 2:
      
//                    double valorSaque = scanner.nextDouble();
              
//                    if (saldo >= valorSaque) {
//                        saldo -= valorSaque;
//                        System.out.printf("Saldo atual: %.1f\n", saldo);
//                    } else {
//                        System.out.println("Saldo insuficiente.")                    }
//                    break;
//                case 3:
//                    System.out.printf("Saldo atual: %.1f\n", saldo);
//                    break;
//                case 0:
//                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
//                    break;
//                default:
//                    System.out.println("Opção inválida. Tente novamente.");
//            }
//        }
//        scanner.close();
//        System.out.println("Programa encerrado.");
//    }
//}
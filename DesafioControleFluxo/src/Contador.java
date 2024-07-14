import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número:");
        int primeiroNumero = terminal.nextInt();
        
        System.out.println("Digite o segundo número:");
        int segundoNumero = terminal.nextInt();
        
        terminal.close(); // Fechar o Scanner após o uso
        
        try {
            if (primeiroNumero > segundoNumero) {
                throw new ParametrosInvalidosException("O segundo número deve ser maior que o primeiro.");
            }
            
        int contagem = segundoNumero - primeiroNumero;
            
            for (int i = primeiroNumero; i <= segundoNumero; i++) {
                System.out.println(i);
            }
            
        } catch (ParametrosInvalidosException e) {
            System.out.println("Erro ao contar: " + e.getMessage());
        }
    }
}

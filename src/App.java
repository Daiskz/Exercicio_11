import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("Digite o primeiro número inteiro: ");
            double a = entrada.nextDouble();
            System.out.print("Digite o próximo número inteiro: ");
            double b = entrada.nextDouble();
            System.out.print("Digite um número real: ");
            double c = entrada.nextDouble();
            double numero1 = (a * 2 + (b/2));
            double numero2 = (c + (a * 3));
            double numero3 = Math.pow(c, 3);
            System.out.println("O produto do dobro do primeiro número inteiro com metade do segundo número inteiro é: " + numero1);
            System.out.println("A soma do triplo do primeiro número com o terceiro número real é: " + numero2);
            System.out.println("O terceiro número real elevado ao cubo é: " + numero3);
        }
        
    }
}

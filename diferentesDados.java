import java.util.Scanner;

public class diferentesDados {
    
    public static void main(String[] args) {
        System.out.println("===============");

        Scanner scanner = new Scanner(System.in);

        System.out.println(">>> Digite um Texto <<<");
        String texto = scanner.nextLine();
        System.out.println("O texto digitado " + "foi" + texto);

        System.out.println(">>> Digite um decimal <<<");
        double numeroDecimal = scanner.nextDouble();
        System.out.println("O número decimal digitado " + "foi " + numeroDecimal);

        System.out.println(">>> Digite um inteiro <<<");
        int numeroInteiro = scanner.nextInt();
        System.out.println(("O número inteiro digitado " + "foi " + numeroInteiro));

        System.out.println(">>> Digite um boolean <<<");
        boolean booleano = scanner.nextBoolean();
        System.out.println("O booleano digitado " + "foi " + booleano);

        scanner.close();

        System.out.println("Fim!");
        System.out.println("==============");
    }
}


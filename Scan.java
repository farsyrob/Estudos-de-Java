import java.util.Scanner;
// importa o Scanner, necessário para computar inputs

public class Scan{

	public static void main(String[] args) {

	System.out.println("==================");
	
	Scanner scanner = new Scanner(System.in);
	// determina a variável "scanner" e a associa ao input do usuário
	// Scanner: prepara o scanner para ser utilizado

	System.out.print("Digite uma distância: ");
	// a diferença pro prinLN é que no print, o cursor no terminal,
	// permanece na mesma linha de código.
	double distanciaPercorrida = scanner.nextDouble();
	//chama a variável scanner, e prepara o programa pra esperar pra um valor, 'nextDouble()'

	System.out.println("A distância digitada foi " + distanciaPercorrida + "Km.");

	scanner.close();
	// encerra o scanner **IMPORTANTE**

	System.out.println("Fim!");
	System.out.println("=================");
	}
}
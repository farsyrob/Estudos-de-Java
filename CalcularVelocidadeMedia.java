/* podemos comentar
assim independente de
linhas */
// ou assim para apenas
// uma linha
/**
 * e assim para uma boa
 * formatação
 * */

public class CalcularVelocidadeMedia {

	public static void main(String[] args) {
		System.out.println("=========== VELOCIDADE MEDIA ===========");

	double distanciaPercorrida = 150;
	//uma variável é uma caixa de memória que armazena dados e os associa a um nome;
	System.out.println("A distancia percorrida foi de " + distanciaPercorrida + "Km.");
	//o sinal de + representa a concatenação de dados, quando temos Strings, e soma,
		//quando temos números;

	final double tempoGasto = 1.5;
	// o comando 'final' determina a variável como uma CONSTANTE, então o valor dela
	// deve ser sempre o mesmo até o fim do código;
	System.out.println("O tempo gasto foi de " + tempoGasto + " horas.");

	double velocidadeMedia = distanciaPercorrida / tempoGasto;
	//uma variável também pode ser um resultado entre duas variáveis previamente determinadas;
	System.out.println("Para encontrar a velocidade média " + "dividimos a distância (" + distanciaPercorrida + ") pelo tempo gasto no percurso (" + tempoGasto + ").");
	System.out.println("A velocidade média é de " + velocidadeMedia + "Km/h.");

	}
}


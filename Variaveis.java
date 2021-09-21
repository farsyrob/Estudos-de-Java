/** Estudo de variáveis em Java
 * FarsyRob
 * AlgaWorks apostila
 * */
public class Variaveis {
	public static void main(String[] args) {
		System.out.println("====================");

		double precoProduto = 100.0;
		System.out.println("O preço do produto é de " + precoProduto + " reais.");
		//fazendo alterações a execução muda

		double percentualDesconto = 16.9;
		System.out.println("O desconto será de " + percentualDesconto + "%.");

		double desconto = precoProduto * percentualDesconto / 100;

		double precoComDesconto = precoProduto - desconto;

		System.out.println("Com desconto, o produto sai por R$ " + precoComDesconto + ".");

		System.out.println("Fim.");	
		System.out.println("====================");	
	}
}
/** Variáveis : 
 * - numeros:
 * 		- inteiros (byte, short, long, int);
 * 		- decimais (float, double);
 * 
 * - logicos (boolean) : 
 * 		- True;
 * 		- False;
 * - texto :
 * 		- String (textos de qualquer tamanho); 
 * 		- char (um caracter);
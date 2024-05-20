
import java.util.Locale;
import java.util.Scanner;


public class Contador {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);		
		Scanner terminal = new Scanner(System.in);
		System.out.println("SEJA BEM VINDO !!!");
		System.out.println("Digite o primeiro parâmetro!");
		int parametroUm = scanner.nextInt();
		System.out.println("Digite o segundo parâmetro!");
		int parametroDois = scanner.nextInt();
		
		try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException exception) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro!!");
        }
		
	}
	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contagem = parametroDois - parametroUm;
            for (int repeticao = 1; repeticao <= contagem; repeticao = repeticao+1){
            System.out.println("Imprimindo o número " + repeticao);                
            }
    }

}
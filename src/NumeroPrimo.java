import java.util.Scanner;

public class NumeroPrimo {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite um número: ");
		int num = entrada.nextInt();
		int cont = 0;
		
		for(int i = 1; i <= num; i++) {
			if (num % i == 0) {
				cont++;
				System.out.println("o resto da divisão entre o "+num+ " e "+cont+ " = "+num%cont);
			}
		}
		if (cont == 2) {
			System.out.println("O número é primo");
		}else {
			System.out.println("Não é primo");
		}
			
		entrada.close();
	}
}

import java.util.Random;
import java.util.Scanner;

public class AdivinheUmNumero {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Random random = new Random();
		int tentativas = 10;
		boolean acertou = false;
		int numeroChute = 0;
		int aleatorio = random.nextInt(10);
		
		while(tentativas > 0 && acertou == false) {
			System.out.print("Digite um número entre 0 e 10: ");
			numeroChute = entrada.nextInt();
			
			if(numeroChute == aleatorio ) {
				tentativas--;
				System.out.println("Você acertou e gastou apenas "+(10 - tentativas )+ " vidas");
				acertou = true;
			}else if(numeroChute > aleatorio) {
				tentativas--;
				System.out.println("O número que você digitou é maior. Restam apenas "+tentativas+" vidas");
			}else if(numeroChute < aleatorio) {
				tentativas--;
				System.out.println("O número que você digitou é menor. Restam apenas "+tentativas+" vidas");
			}else {
				System.out.println("Você não acertou!");
			}
		}
		
		
		entrada.close();
	}
}

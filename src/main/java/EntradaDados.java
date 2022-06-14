import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class EntradaDados {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner scanner1 = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);

		String nome = "";
		int idade = 0;
		double altura = 0;
		BigDecimal salario = new BigDecimal(0);
		String frase = "";



		System.out.print("Digite nome, idade, altura, salário: ");
		nome = scanner1.next();
		idade = scanner1.nextInt();
		altura = scanner1.nextDouble();
		salario = scanner1.nextBigDecimal();

		scanner1.nextLine();
		System.out.print("Digite uma frase que você gosta: ");
		frase = scanner1.nextLine();
		// OU
		// System.out.print("Digite uma frase que você gosta: ");
		//frase = scanner2.nextLine();

		System.out.printf(Locale.ITALY,
				"%nNome: %s %nIdade %d %nAltura: %,.2f %nSalário R$ %,.2f %n%n",
				nome,
				idade,
				altura,
				salario);

		System.out.printf("A frase digitada foi: %s", frase);

		scanner1.close();
		scanner2.close();
	}
}

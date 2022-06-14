import java.util.Date;
import java.util.Locale;

public class Saida {
	public static void main(String[] args) {
		double valor = 2310.57843;
		String texto = "Olá Mundo!!!";
		Date agora = new Date();

		System.out.println("*** Imprimindo valores Boleanos ***");
		System.out.println(valor);
		System.out.printf("%b %B %n", true, true);
		System.out.printf("%b %B %n", false, false);
		System.out.printf("3 > 4 = %b%n", 3 > 4);
		System.out.printf("4 > 3 = %b %n%n", 4 > 3);

		System.out.println("*** Imprimindo o texto formatado ***");
		System.out.println(texto);
		System.out.printf("Maiusculo: %S %n", texto);
		System.out.printf("Texto Normal: %s %n", texto);
		System.out.printf("Texto com 20 posições: |%20s| %n", texto);
		System.out.printf("Texto com 20 posições: |%-20s| %n", texto);
		System.out.printf("Texto com 20 posições: |%-20s| %n", texto);
		System.out.printf("Texto com 20 posições: |%-10.3s| %n%n", texto);

		System.out.println("*** Imprimindo o valor formatado ***");
		System.out.printf("Inteiro: %d %n", (int) valor);
		System.out.printf(Locale.US,"Inteiro com formatação America: %,d %n", (int) valor);
		System.out.printf(Locale.ITALY,"Inteiro com formatação Italiana: %,d %n", (int) valor);
		System.out.printf("Ponto Flutuante: %f%n", valor);
		System.out.printf(Locale.US,"Região US: %f%n", valor);
		System.out.printf(Locale.ITALY,"Região FR: %f%n", valor);
		System.out.printf("2 casas decimanis: %.2f%n", valor);
		System.out.printf("4 casas decimanis e separador de milhar: %,.4f %n%n", valor);

		System.out.println("*** Imprimindo o Data e Hora ***");
		System.out.printf("Hora Completa %tT %n", agora);
		System.out.printf("São %tH hora(s), %tM minuto(s) e %tS secondo(s) %n", agora, agora, agora);
		System.out.printf("Dia: %td, Més: %tm e Ano %tY %n", agora, agora, agora);
	}
}

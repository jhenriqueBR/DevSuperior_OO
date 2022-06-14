public class FuncaoMatematica {
	public static void main(String[] args) {
		int valor1 = 9;
		int base = 2;
		int expoente = 3;
		int valor2 = -3;
		int valor3 = 4;

		System.out.printf("A raiz de %d é %f %n", valor1, Math.sqrt(valor1));
		System.out.printf("A potência de %d elevado a %d é %f %n", base, expoente, Math.pow(base, expoente));
		System.out.printf("A valor absoluto de %d é %d %n", valor2, Math.abs(valor2));
		System.out.printf("A valor absoluto de %d é %d %n", valor3, Math.abs(valor3));
	}
}

public class Variavel {
	public static void main(String[] args) {
		String nome = "José Henrique";
		int _idade = 47;
		String enderecoCompleto = "Rua Sobe e desce, 555 - Qualquer Lugar - Rio de Janeiro / RJ";

		var nomeVr2 = "José Henrique";
		var _idadeVr2 = 47;
		var enderecoCompletoVr2 = "Rua Sobe e desce, 555 - Qualquer Lugar - Rio de Janeiro / RJ";

		System.out.print("Nome : ");
		System.out.println(nome);
		System.out.print("Idade : ");
		System.out.println(_idade);
		System.out.print("Endereço : ");
		System.out.println(enderecoCompleto);

		System.out.println();

		System.out.print("Nome : ");
		System.out.println(nomeVr2);
		System.out.print("Idade : ");
		System.out.println(_idadeVr2);
		System.out.print("Endereço : ");
		System.out.println(enderecoCompletoVr2);

	}
}

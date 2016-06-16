package maquina;

public class Pilha {
	
	public static Pilha instancia;
	private static boolean empilhar = true;
	static {
		instancia = new Pilha();
	}
	private String pilha;

	private Pilha() {
		super();
		pilha = "";
	}
	public void empilha(String str) {
		pilha = pilha + str;
		System.out.println("Empilhando: "+str);
		System.out.println("Pilha: "+pilha);
	}
	
	public void setPilha(String str) {
		pilha = str;
	}
	
	public String getPilha() {
		return pilha;
	}
	
	public String getString() {
		String aux = pilha;
		pilha = "";
		return aux;
	}
	public boolean empilhar() {
		boolean aux = empilhar;
		empilhar = !aux;
		return aux;
	}
	@Override
	public String toString() {
		return "{\"pilha\":\"" + pilha + "\"}";
	}
}
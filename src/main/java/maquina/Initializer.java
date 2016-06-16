package maquina;


public class Initializer {
	public static  boolean init(Maquina maquina, Fita fita) {
		fita.consumir();
		Pilha.instancia.empilha(fita.getConsumido());
		boolean aceita =  maquina.aceita(fita, "") && fita.getConsumido()==null;
		System.out.println(Tabela.instancia);
		System.out.println(Pilha.instancia);
		return aceita;
	}
}

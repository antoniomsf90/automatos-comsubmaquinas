package maquina;

import java.util.ArrayList;
import java.util.List;

public class Tabela {
	public static Tabela instancia;
	static {
		instancia = new Tabela();
	}
	private List<Linha> linhas;

	public Tabela() {
		super();
		linhas = new ArrayList<Linha>();
	}

	public List<Linha> getLinhas() {
		return linhas;
	}

	public void setLinhas(List<Linha> linhas) {
		this.linhas = linhas;
	}
	
	public void addLinha(Linha l) {
		if(!l.getToken().equals("")) {
			this.linhas.add(l);
		}
	}	
	
	public void getLinha(int index) {
		this.linhas.get(index);
	}
	
	public void restart() {
		this.linhas.clear();
	}
	
	@Override
	public String toString() {
		return "Tabela [linhas=" + linhas + "\n]";
	}
}
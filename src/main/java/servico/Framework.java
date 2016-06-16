package servico;

import java.util.ArrayList;
import java.util.List;

import maquina.Estado;
import maquina.Maquina;

public class Framework {
	List<Maquina> maquinas;

	private static Framework instance;

	private Framework() {
		maquinas = new ArrayList<Maquina>();
	}

	public static Framework getInstance() {
		if (instance == null) {
			instance = new Framework();
		}
		return instance;
	}

	public Maquina criaMaquina(String nome) {
		Maquina maquina = new Maquina(nome);
		maquinas.add(maquina);
		return maquina;
	}

	public Estado criaEstado(String nome, boolean ehInicial, boolean ehFinal) {
		return new Estado(nome, ehInicial, ehFinal);
	}
}

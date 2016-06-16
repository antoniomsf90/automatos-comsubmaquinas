package maquina;

public class Linha {
	private String token;
	private int numeroLinha;
//	private Metodos tipo;
//	public Linha(String token, int numeroLinha, Metodos tipo) {
//		super();
//		this.token = token;
//		this.numeroLinha = numeroLinha;
//		this.tipo = tipo;
//	}
	
	public Linha(String token, int numeroLinha) {
		super();
		this.token = token;
		this.numeroLinha = numeroLinha;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public int getNumeroLinha() {
		return numeroLinha;
	}
	public void setNumeroLinha(int numeroLinha) {
		this.numeroLinha = numeroLinha;
	}
//	public Metodos getTipo() {
//		return tipo;
//	}
//	public void setTipo(Metodos tipo) {
//		this.tipo = tipo;
//	}
//	@Override
//	public String toString() {
//		return "\n\tLinha [token=" + token + ", numeroLinha=" + numeroLinha + ", tipo=" + tipo + "]";
//	}
	
	@Override
	public String toString() {
		return "\n\tLinha [token=" + token + ", numeroLinha=" + numeroLinha + "]";
	}
}
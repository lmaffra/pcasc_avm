package planejamento;

public class Recurso {
	
	private String nome;
	private int tempo;
	private int visita;
	private double tempoResposta;
	private double throughput;
	private double utilizacao;
	private double clientes;
	
	public Recurso(String nome, int tempo, int visita) {
		this.nome = nome;
		this.tempo = tempo;
		this.visita = visita;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getTempo() {
		return tempo;
	}

	public void setTempo(int tempo) {
		this.tempo = tempo;
	}

	public int getVisita() {
		return visita;
	}

	public void setVisita(int visita) {
		this.visita = visita;
	}

	public double getTempoResposta() {
		return tempoResposta;
	}

	public void setTempoResposta(double tempoResposta) {
		this.tempoResposta = tempoResposta;
	}

	public double getThroughput() {
		return throughput;
	}

	public void setThroughput(double throughput) {
		this.throughput = throughput;
	}

	public double getUtilizacao() {
		return utilizacao;
	}

	public void setUtilizacao(double utilizacao) {
		this.utilizacao = utilizacao;
	}

	public double getClientes() {
		return clientes;
	}

	public void setClientes(double clientes) {
		this.clientes = clientes;
	}
}

package br.com.analiseLog.model;

public class EntradaLog {
	private String sistema;
	private String dataHora;
	private String tipo;
	private String mensagem;

	public EntradaLog(String sistema, String dataHora, String tipo, String mensagem) {
		super();
		this.sistema = sistema;
		this.dataHora = dataHora;
		this.tipo = tipo;
		this.mensagem = mensagem;
	}

	public String getSistema() {
		return sistema;
	}

	public void setSistema(String sistema) {
		this.sistema = sistema;
	}

	public String getDataHora() {
		return dataHora;
	}

	public void setDataHora(String dataHora) {
		this.dataHora = dataHora;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

}
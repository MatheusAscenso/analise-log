package br.com.analiseLog.view;

import br.com.analiseLog.model.EntradaLog;

public class TelaDadoUsuario {

	 public void apresentarLog(EntradaLog entradaLog) {
	        System.out.println("Sistema: " + entradaLog.getSistema());
	        System.out.println("Data e Hora: " + entradaLog.getDataHora());
	        System.out.println("Tipo: " + entradaLog.getTipo());
	        System.out.println("Mensagem: " + entradaLog.getMensagem());
	    }
	}

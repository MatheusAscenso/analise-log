package br.com.analiseLog.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import br.com.analiseLog.model.EntradaLog;

public class Extrailog {
	private static final String LOG_REGEX = "^(.*?) - \\[(.*?)\\] - (.*?) - Mensagem=(.*)$";
	
	public static EntradaLog parselog(String log) {
		Pattern pattern = Pattern.compile(LOG_REGEX);
		Matcher matcher = pattern.matcher(log);
		
		if (matcher.matches()) {
			String sistema = matcher.group(1);
			String dataHora = matcher.group(2);
			String tipo = matcher.group(3);
			String mensagem = matcher.group(4);
			return new EntradaLog(sistema,dataHora, tipo, mensagem);
		}else {
			throw new IllegalArgumentException("Formato de Log inválido!");
		}
	}

}
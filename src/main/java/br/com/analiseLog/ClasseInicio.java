package br.com.analiseLog;

import br.com.analiseLog.model.EntradaLog;
import br.com.analiseLog.service.ColetarLog;
import br.com.analiseLog.view.TelaDadoUsuario;
import br.com.analiseLog.view.TelaInicial;

public class ClasseInicio {

	public static void main(String[] args) {
        TelaInicial telaInicial = new TelaInicial();
        ColetarLog coletarLog = new ColetarLog();
        TelaDadoUsuario telaDousuario = new TelaDadoUsuario();

        telaInicial.inicio();
        EntradaLog entradaLog = coletarLog.receberlog(); //
        telaDousuario.apresentarLog(entradaLog);
    }
}

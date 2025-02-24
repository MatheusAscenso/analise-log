package br.com.analiseLog.service;

import java.util.Scanner;

import br.com.analiseLog.model.EntradaLog;

public class ColetarLog {
    public EntradaLog receberlog() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira a String de log: ");
        String log = scanner.nextLine();
        try {
            EntradaLog entradaLog = Extrailog.parselog(log);
            System.out.println("Log analisado: ");
            return entradaLog;
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
            return null;
        } finally {
            scanner.close();
        }
    }
}
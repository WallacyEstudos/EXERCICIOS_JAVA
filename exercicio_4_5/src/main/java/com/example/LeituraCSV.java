package com.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeituraCSV {
    String arquivoCSV = "C:\\Users\\DevTarde\\Documents\\Diogo\\Tarde\\JavaProjectsTarde\\dados.csv";
    String linha = "";
    String divisor = ","; // O divisor usado no CSV, neste caso é a vírgula

    public void teste() {
        try (BufferedReader br = new BufferedReader(
                new FileReader(arquivoCSV))) {
            // Lendo e imprimindo o cabeçalho (primeira linha)
            if ((linha = br.readLine()) != null) {
                String[] colunas = linha.split(divisor);
                System.out.println("Cabeçalho:");
                for (String coluna : colunas) {
                    System.out.print(coluna + " ");
                }
                System.out.println("\n---------------------------");
            }

            // Leitura dos demais dados
            System.out.println("Conteúdo:");
            while ((linha = br.readLine()) != null) {
                String[] valores = linha.split(divisor);
                for (String valor : valores) {
                    System.out.print(valor + " ");
                }
                System.out.println();
            }

        } catch (IOException e) {
            System.err.println(e);
        }
    }
}

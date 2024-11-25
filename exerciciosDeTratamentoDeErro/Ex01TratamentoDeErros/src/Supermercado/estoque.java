package Supermercado;

import java.io.*;
import java.util.Scanner;

public class estoque {

    public static void main(String[] args) {
        String caminhoArquivo = "C:\\Users\\LABORATORIO\\eclipse-workspace\\Ex01TratamentoDeErros\\src\\Supermercado\\produtos.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha = br.readLine(); 
            if (linha == null) {
                throw new IOException("O arquivo está vazio.");
            }

            System.out.println("Produto - Valor Total em Estoque");
            while ((linha = br.readLine()) != null) {
                try {
                    String[] dados = linha.split(",");
                    String produto = dados[0];
                    int quantidade = Integer.parseInt(dados[1]);
                    double preco = Double.parseDouble(dados[2]);

                    if (quantidade < 0 || preco < 0) {
                        throw new IllegalArgumentException("Quantidade ou preço não podem ser negativos.");
                    }

                    double valorTotal = quantidade * preco;
                    System.out.printf("%s - R$ %.2f%n", produto, valorTotal);

                } catch (NumberFormatException e) {
                    System.out.println("Erro ao processar linha: " + linha + ". Dados inválidos.");
                } catch (IllegalArgumentException e) {
                    System.out.println("Erro: " + e.getMessage() + " Linha: " + linha);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Erro: Arquivo não encontrado.");
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        } finally {
            System.out.println("Execução finalizada.");
        }
    }
}
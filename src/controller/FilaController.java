package controller;

import view.Cliente;

import java.util.Scanner;

import br.edu.fateczl.filaobj.Fila;

public class FilaController {
    public void inserirCliente(Fila fila, Scanner scanner) {
        System.out.print("Digite o nome do cliente: ");
        String nome = scanner.next();
        fila.insert(new Cliente(fila.size() + 1, nome));
        System.out.println("Senha gerada com sucesso!");
    }

    public void chamarCliente(Fila fila, Fila filaPrioritarios) {
        try {
            for (int i = 0; i < 3; i++) {
                if (!filaPrioritarios.isEmpty()) {
                    Cliente cliente = (Cliente) filaPrioritarios.remove();
                    System.out.println("Chamando próximo cliente prioritário: " + cliente.getNome());
                } else {
                    Cliente cliente = (Cliente) fila.remove();
                    System.out.println("Chamando próximo cliente: " + cliente.getNome());
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

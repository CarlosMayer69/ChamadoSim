package view;

import br.edu.fateczl.filaobj.Fila;
import controller.FilaController;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Fila fila = new Fila();
        Fila filaPrioritarios = new Fila();

        // Inicialização das senhas prioritárias
        for (int i = 1; i <= 10; i++) {
            filaPrioritarios.insert(new Cliente(i, "Prioritário-" + i));
        }

        Scanner scanner = new Scanner(System.in);
        FilaController filaController = new FilaController();

        int opcao;
        do {
            System.out.println("\n----- Menu -----");
            System.out.println("1. Inserir nova senha na fila");
            System.out.println("2. Inserir nova senha na fila de prioritários");
            System.out.println("3. Chamar próximo cliente para atendimento");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    filaController.inserirCliente(fila, scanner);
                    break;
                case 2:
                    filaController.inserirCliente(filaPrioritarios, scanner);
                    break;
                case 3:
                    filaController.chamarCliente(fila, filaPrioritarios);
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 4);
    }
}

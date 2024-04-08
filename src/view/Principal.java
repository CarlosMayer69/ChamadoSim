package view;

import br.edu.fateczl.filaobj.Fila;
import controller.FilaController;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Fila fila = new Fila();
        Fila filaPrioritarios = new Fila();

        // Inicializa��o das senhas priorit�rias
        for (int i = 1; i <= 10; i++) {
            filaPrioritarios.insert(new Cliente(i, "Priorit�rio-" + i));
        }

        Scanner scanner = new Scanner(System.in);
        FilaController filaController = new FilaController();

        int opcao;
        do {
            System.out.println("\n----- Menu -----");
            System.out.println("1. Inserir nova senha na fila");
            System.out.println("2. Inserir nova senha na fila de priorit�rios");
            System.out.println("3. Chamar pr�ximo cliente para atendimento");
            System.out.println("4. Sair");
            System.out.print("Escolha uma op��o: ");
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
                    System.out.println("Op��o inv�lida!");
            }
        } while (opcao != 4);
    }
}

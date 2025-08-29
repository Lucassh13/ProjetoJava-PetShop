import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== 🐾 Sistema de Banho Pet Shop ===");
            System.out.println("1 - Agendar banho");
            System.out.println("2 - Consultar agenda");
            System.out.println("3 - Editar agendamento");
            System.out.println("4 - Excluir agendamento");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1 -> AgendaManager.agendar();
                case 2 -> AgendaManager.listar();
                case 3 -> AgendaManager.editar();
                case 4 -> AgendaManager.excluir();
                case 5 -> System.out.println("Encerrando...");
                default -> System.out.println("❌ Opção inválida!");
            }
        } while (opcao != 5);

        sc.close();
    }
}
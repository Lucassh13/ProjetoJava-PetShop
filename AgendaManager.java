import java.util.Scanner;

public class AgendaManager {
    public static Agendamento[] agenda = new Agendamento[10];
    public static Scanner sc = new Scanner(System.in);

    public static void listar() {
        System.out.println("\n📋 Agenda do Dia:");
        for (int i = 0; i < agenda.length; i++) {
            if (agenda[i] == null) {
                System.out.println((i+1) + " - [Disponível]");
            } else {
                System.out.println((i+1) + " - " + agenda[i]);
            }
        }
    }

    public static void agendar() {
        listar();
        System.out.print("\nEscolha o horário (1 a 10): ");
        int pos = sc.nextInt() - 1;
        sc.nextLine();

        if (agenda[pos] != null) {
            System.out.println("❌ Horário já ocupado!");
            return;
        }

        System.out.print("Nome do pet: ");
        String nomePet = sc.nextLine();
        System.out.print("Espécie: ");
        String especie = sc.nextLine();
        System.out.print("Nome do dono: ");
        String nomeDono = sc.nextLine();
        System.out.print("Telefone do dono: ");
        String telefone = sc.nextLine();

        System.out.print("Tipo de serviço (1 - Simples | 2 - Com Tosa): ");
        int tipo = sc.nextInt(); sc.nextLine();

        if (tipo == 1) {
            agenda[pos] = new BanhoSimples(nomePet, especie, nomeDono, telefone, "Horário " + (pos+1));
        } else {
            agenda[pos] = new BanhoComTosa(nomePet, especie, nomeDono, telefone, "Horário " + (pos+1));
        }

        System.out.println("✅ Agendamento realizado com sucesso!");
    }

    public static void editar() {
        listar();
        System.out.print("\nQual horário deseja editar? ");
        int pos = sc.nextInt() - 1;
        sc.nextLine();

        if (agenda[pos] == null) {
            System.out.println("❌ Nenhum agendamento neste horário!");
            return;
        }

        System.out.print("Novo nome do pet: ");
        agenda[pos].nomePet = sc.nextLine();
        System.out.print("Nova espécie: ");
        agenda[pos].especie = sc.nextLine();
        System.out.print("Novo nome do dono: ");
        agenda[pos].nomeDono = sc.nextLine();
        System.out.print("Novo telefone: ");
        agenda[pos].telefoneDono = sc.nextLine();

        System.out.println("✏️ Agendamento atualizado!");
    }

    public static void excluir() {
        listar();
        System.out.print("\nQual horário deseja excluir? ");
        int pos = sc.nextInt() - 1;

        if (agenda[pos] == null) {
            System.out.println("❌ Nenhum agendamento neste horário!");
            return;
        }

        agenda[pos] = null;
        System.out.println("🗑️ Agendamento excluído!");
    }
}

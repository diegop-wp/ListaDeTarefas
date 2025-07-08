import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        TarefaServico tarefaServico = new TarefaServico();
        Scanner entrada = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("==BEM_VINDO A SUA LISTA DE TAREFA==");
            System.out.println("           --MENU--");
            System.out.println("1- Adicionar Tarefa");
            System.out.println("2- Listar Tarefa");
            System.out.println("3- Concluir tarefa");
            System.out.println("4- Remover Tarefa");
            System.out.println("0- Sair");
            System.out.print("Escolha uma opção:");

            opcao = Integer.parseInt(entrada.nextLine());
            //convertendo int para String para evitar bugs com ENTER

            switch (opcao) {
                case 1:
                    System.out.println("Descrição da Tarefa");
                    String des = entrada.nextLine();
                    tarefaServico.addTarefas(des);
                    break;
                case 2:
                    tarefaServico.listar();
                    break;
                case 3:
                    System.out.println("Qual tarefa você quer concluir?");
                    String concluir = entrada.nextLine();
                    tarefaServico.concluir(concluir);
                    break;
                case 4:
                    System.out.println("Qual Tarefa você quer remover?");
                    String remove = entrada.nextLine();
                    tarefaServico.remover(remove);
                    break;
                case 0:
                    System.out.println("saindo...");
                default:
                    System.out.println("Opcão invalida");

            }


        } while (opcao != 0);
        entrada.close();
    }
}
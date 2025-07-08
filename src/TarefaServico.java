import java.util.ArrayList;
import java.util.List;

public class TarefaServico {

    //amarzenar obejto do tipo Tarefa
    private List<Tarefa> tarefas = new ArrayList<>();

    public void addTarefas(String descricao) {
        tarefas.add(new Tarefa(descricao));

    }

    public void listar() {
        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma Tarefa foi adicionada");
        } else {
            for (int i = 0; i < tarefas.size(); i++) {
                System.out.println(tarefas.get(i));
            }

        }

    }

    public void concluir(String valorBusca) {
        boolean achou = false;
        //verificando se o valorbusca e valido
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getDescricao().equalsIgnoreCase(valorBusca)){
                tarefa.concluir();
                System.out.println("Tarefa concluida: " + valorBusca );
                achou = true;
                break;

            }
        }
        if (!achou){
            System.out.println("Valor não encontrado :"+valorBusca);
        }

    }
    public void remover(String removeValor){
        boolean achou = false;
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getDescricao().equalsIgnoreCase(removeValor)){
                tarefas.remove(tarefa);
                System.out.println("Tarefa Removida:" + removeValor );
                achou = true;
                break;
            }
        }
        if (!achou){
            System.out.println("Valor não encotrado"+ removeValor);
        }

    }

}
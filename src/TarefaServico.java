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

}
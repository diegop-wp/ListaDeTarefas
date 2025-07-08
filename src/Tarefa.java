public class Tarefa {
    private String descricao;
    private Boolean concluida;

    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.concluida = false;
    }

    public void concluir(){
        this.concluida = true;
    }

    public void dataConcluir(int dataPrevista){

    }

    @Override
    public String toString() {
        return concluida?"[X]" + descricao :"[]"+descricao ;
    }

    public String getDescricao() {
        return descricao;
    }


}

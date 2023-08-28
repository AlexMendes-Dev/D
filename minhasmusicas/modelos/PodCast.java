package programacao.workspace.user.minhasmusicas.modelos;

public class PodCast extends Audio {
    String apresentador;
    String descricao;

    public String getApresentador() {
        return apresentador;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int getClassificacao() {

        if(getTotalCurtidas() > 500){
            return 10;
        }
        else {
            return 8;
        }

    }
}

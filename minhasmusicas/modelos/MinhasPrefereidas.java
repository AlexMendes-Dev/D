package programacao.workspace.user.minhasmusicas.modelos;

public class MinhasPrefereidas {
    public void inclui(Audio audio){

        if(audio.getClassificacao() >= 9 ){

            System.out.println(audio.getTitulos() + "estar entre os mais vizualizados da semana!");

        }
        else {
            System.out.println(audio.getTitulos() + "estar entre as mais tocadas do mês.");
        }

        }
    }

package programacao.workspace.user.minhasmusicas.principal;


import programacao.workspace.user.minhasmusicas.modelos.MinhasPrefereidas;
import programacao.workspace.user.minhasmusicas.modelos.Musicas;
import programacao.workspace.user.minhasmusicas.modelos.PodCast;

public class Main {
    public static void main(String[] args) {
        Musicas minhamusica = new Musicas();

        minhamusica.setTitulos("Bondade de Deus; ");
        minhamusica.setArtista("Isaias Saad");

        for (int i = 0; i < 1000; i++) {
            minhamusica.reproduz();
        }
        for (int i = 0; i < 50; i++) {
            minhamusica.curte();
        }

        PodCast podCast = new PodCast();

        podCast.setTitulos("True Pod Cast, ");
        podCast.setApresentador("Alessandro Pascoal");

        for (int i = 0; i < 5000; i++) {
            podCast.reproduz();
        }
        for (int i = 0; i < 1000; i++) {
          podCast.curte();

        }
        MinhasPrefereidas preferidas = new MinhasPrefereidas();
        preferidas.inclui(podCast);
        preferidas.inclui(minhamusica);


    }
}

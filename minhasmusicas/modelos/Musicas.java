package programacao.workspace.user.minhasmusicas.modelos;

public class Musicas extends Audio {
    String album;
    String artista;
    String genero;

    public void setAlbum(String album) {

        this.album = album;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAlbum() {

        return album;
    }

    public String getArtista() {
        return artista;
    }

    public String getGenero() {
        return genero;
    }

    @Override
    public int getClassificacao() {
        if(getTotalDeReproducao() > 2000){
            return 10;
        }
        else {
            return 7;
        }

    }

}

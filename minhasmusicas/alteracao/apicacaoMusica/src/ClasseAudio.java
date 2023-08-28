public class ClasseAudio {

   private String titulo = "Musicas Preferidas";
    private int duracao;
    private int totalDeDuracao;
    private int curtidas;
    private int classificacao;

    public int getClassificacao() {
        return classificacao;
    }
    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public int getDuracao() {
        return duracao;
    }
    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
    public int getTotalDeDuracao() {
        return totalDeDuracao;
    }
    public void setTotalDeDuracao(int totalDeDuracao) {
        this.totalDeDuracao = totalDeDuracao;
    }
    public int getCurtidas() {
        return curtidas;
    }
    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public int totalDeDuracao(){

        totalDeDuracao =+ duracao;
        totalDeDuracao++;

        return totalDeDuracao;
    }
    public void fichaTecnica(){
        System.out.println("Nome do Artista:" + titulo);
        System.out.println("Duração da faixa musical: " + duracao);


    }
}


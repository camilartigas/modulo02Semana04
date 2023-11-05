package herois_parte4.model;

public class Heroi extends Personagem {

    private String nomeVidaReal;

    public Heroi(String nome, String superPoder, String nomeVidaReal) {
        this.setNome(nome);
        this.setSuperPoder(superPoder);
        this.nomeVidaReal = nomeVidaReal;
    }

    public String getNomeVidaReal() {
        return nomeVidaReal;
    }

    public void setNomeVidaReal(String nomeVidaReal) {
        this.nomeVidaReal = nomeVidaReal;
    }
}

package herois_parte4.model;

public class Vilao extends Personagem {

    private Integer tempoDePrisao;

    public Vilao(String nome, String superPoder, Integer tempoDePrisao) {
        this.setNome(nome);
        this.setSuperPoder(superPoder);
        this.tempoDePrisao = tempoDePrisao;
    }

    public Integer getTempoDePrisao() {
        return tempoDePrisao;
    }

    public void setTempoDePrisao(Integer tempoDePrisao) {
        this.tempoDePrisao = tempoDePrisao;
    }
}

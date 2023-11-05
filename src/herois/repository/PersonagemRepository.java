package herois_parte4.repository;

import herois_parte2.model.Personagem;

import java.util.*;
public class PersonagemRepository {
    private List<Personagem> personagens = new ArrayList<>();

    public void inserir(Personagem personagem){
        personagens.add(personagem);
    }

    public List<Personagem> listar(){
        return personagens;
    }
}

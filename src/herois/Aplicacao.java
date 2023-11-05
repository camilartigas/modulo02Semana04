package herois;

import herois.cli.Display;
import herois.model.Opcao;
import herois.model.Personagem;
import herois.repository.PersonagemRepository;

public class Aplicacao {

    private Display display = new Display();
    private PersonagemRepository personagemRepo = new PersonagemRepository();
    public void executar() {

        Opcao opcao = null;

        do {
            display.exibirMenu();
            int codigo = display.obterOpcao();
            try {
                opcao = Opcao.converter(codigo);
                processar(opcao);
            }catch (IllegalArgumentException e){
                display.exibirMensagem( e.getMessage());
            }
        }while (opcao != Opcao.SAIR);

    }

    private void processar(Opcao opcao) {
        if (opcao == Opcao.SAIR)
            return;
        if (opcao == Opcao.CADASTRAR_HEROI){
            Personagem heroi = display.obterDadosHeroi();
            personagemRepo.inserir(heroi);

        }
    }
}

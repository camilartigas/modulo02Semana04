package herois_parte4;

import herois_parte4.cli.Display;
import herois_parte4.model.Heroi;
import herois_parte4.model.Opcao;
import herois_parte4.repository.PersonagemRepository;

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
            Heroi heroi = display.obterDadosHeroi();
            personagemRepo.inserir();

        }
    }
}

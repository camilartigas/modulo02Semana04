package herois_parte4.cli;

import herois_parte4.model.Heroi;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Display {
    public void exibirMenu(){
        System.out.println("****** MENU ******");
        System.out.println();
        System.out.println("1- Cadastrar Herói");
        System.out.println("2- Cadastrar Vilão");
        System.out.println("3- Listar");
        System.out.println("4- Sair");
        System.out.println();

    }

    public int obterOpcao() {
        System.out.println("Informe a opção desejada");
        Scanner scanner = new Scanner(System.in);
        try {
            int op = scanner.nextInt();
            return op;
        }catch (InputMismatchException e){
            return -1;
        }

    }

    public void exibirMensagem(String mensagem) {
        System.out.println();
        System.out.println(mensagem);
        System.out.println();
    }

    public Heroi obterDadosHeroi() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um nome");
        String nome = scanner.nextLine();
        System.out.println("Informe o superpoder");
        String superPoder = scanner.nextLine();
        System.out.println("Informe nome real");
        String nomeVidaReal = scanner.nextLine();
        return new Heroi(nome, superPoder, nomeVidaReal);

    }
}

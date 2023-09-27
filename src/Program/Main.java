package Program;

import Entites.BK;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BK bk = new BK();
        String confSenha;
        System.out.println("Tem cadastro? Sim(s) ou Não(n)");
        Character resposta = sc.next().charAt(0);

        if (resposta == 'S' || resposta == 's') {
            System.out.println("Fds vai fazer outro");
        }

        do {
            System.out.println("Escreva seu nome:");
            bk.setNome(sc.next());
            System.out.println("Escreva seu email:");
            bk.setEmail(sc.next());
            System.out.println("Escreva seu cpf:");
            bk.setCpf(sc.nextInt());
            System.out.println("Escreva seu telefone:");
            bk.setTelefone(sc.nextInt());
            System.out.println("Escreva uma senha");
            bk.setSenha(sc.next());
            System.out.println("Confirme a senha");
            confSenha = sc.next();
        } while (confSenha != bk.getSenha() && bk.getSenha()==null && confSenha == null);
        System.out.printf("Cadastrado com sucesso! %nAgora loge em sua conta.%n");
        System.out.println(logar());


    }
    public static String logar(){
        Scanner sc = new Scanner(System.in);
        BK bk = new BK();
        boolean logou;
        String mensagem = "";
        System.out.println("Escreva seu cpf:");
        int cpf = sc.nextInt();
        System.out.println("Escreva sua senha:");
        String senha = sc.next();

        if(cpf == bk.getCpf()){
            if(senha == bk.getSenha()){
                logou = true;
                mensagem = "Seja bem vindo";
            }
            else{
                logou = false;
                mensagem += "Sua senha está incorreta.";
            }
        }else{
            logou = false;
            mensagem += "Seu cpf está incorreto";
        }
        return mensagem;
    }
}


package br.com.zup;

import javax.sound.midi.Soundbank;
import java.util.List;
import java.util.Scanner;

public class Sistema {
    //Nossa linha de frente com o usuário

    private static Scanner capturaDados(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    public static void menu() {
        System.out.println("Seja bem vindo a Universal");
        System.out.println("Digite 1 - para cadastrar um consumidor. ");
        System.out.println("Digite 2 - para cadastrar uma fatura. ");
        System.out.println("Digite 3 - para consultar fatura por e-mail de um consumidor.");
        System.out.println("Digite 4 - para sair.");
    }

    public static Consumidor cadastrarConsumidor() throws Exception{
        String nome = capturaDados("Digite o nome do consumidor: ").nextLine();
        String email = capturaDados("Digite o email do consumidor: ").nextLine();

        return ServicoConsumidor.cadastrarConsumidor(nome, email);
    }

    public static Fatura cadastraFatura() throws Exception {
        String email =  capturaDados("Digite o email do consumnidor: ").nextLine();
        double valor = capturaDados("Digite o valor da fatura: ").nextDouble();
        String dataDeVencimento = capturaDados("Digite a data do vencimento: ").nextLine();

        return ServiçoFatura.cadastrarFatura(email, valor, dataDeVencimento);
    }

    public static List<Fatura> pesquisarFatura()throws Exception{
        String email =  capturaDados("Digite o email do consumnidor: ").nextLine();
        ServicoConsumidor.validarEmail(email);
        //Receber lista do serviço fatura
        List<Fatura>faturasDoUsuario = ServiçoFatura.pesquisarFaturaPeloEmailConsumidor(email);

        return faturasDoUsuario;
    }

}

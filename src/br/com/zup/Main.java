package br.com.zup;

public class Main {

    public static void main(String[] args) {
        try{
            Sistema.cadastrarConsumidor();
            Sistema.cadastraFatura();
            Sistema.cadastraFatura();
            Sistema.pesquisarFatura();

        }catch(Exception erro){
            System.out.println(erro.getMessage()); //mensagem que esta no estouro da excessão
        }


    }
}

package br.com.zup;

public class Main {

    public static void main(String[] args) {
        boolean continuar = true;
        while(continuar){
            try{
               continuar =  Sistema.execultar();

            }catch(Exception erro){

                System.out.println(erro.getMessage()); //mensagem que esta no estouro da excessão
            }

        }


    }
}

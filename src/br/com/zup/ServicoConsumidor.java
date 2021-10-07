package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServicoConsumidor {
    private static List<Consumidor>consumidores = new ArrayList<>();


    //validar email (verificar se tem @)
    public static void validarEmail(String email) throws Exception{
        if (!email.contains("@")){
            throw new Exception("E-mail inválido!");
        }
    }


    //Verificar se email existe (percorrer lista).
    public static void verificarSeOEmailExiste(String email)throws Exception{
        for (Consumidor consumidorReferencia: consumidores) {
            if (consumidorReferencia.getEmail().equals(email)){
                throw new Exception("Esse e-mail já está cadastrado. ");
            }
        }
    }


    public static Consumidor cadastrarConsumidor(String nome, String email)throws Exception{
        validarEmail(email);
        verificarSeOEmailExiste(email);
        Consumidor consumidor = new Consumidor(nome, email);
        consumidores.add(consumidor);
        return consumidor;
    }


    public static Consumidor pesquisarConsumidorPorEmail(String email) throws Exception{
        for (Consumidor consumidorReferencia:consumidores) {
           if(consumidorReferencia.getEmail().equals(email)){
               return consumidorReferencia;
           }
        }
        throw new Exception("Consumidor não cadastrado no sistema. ");
    }


}

package com.loiane.cursojava.aulas.aula36;

public class Teste {
    public static void main(String[] args) {

        Contato contato = new Contato();

        contato.setNome("W.W");
        //contato.setEndereco("Kings Landing");
        //contato.setTelefone("11 9999-9999");

        //relacionament tem-um endereço

        Endereco end = new Endereco();
        end.setNomeRua("Breaking bad");
        end.setNumero("n/a");
        end.setComplemento("-");
        end.setCidade("Albuquerque");
        end.setEstado("New mexico");
        end.setCep("59965787");

        contato.setEndereco(end);
        //relacionament tem-um telefone
        Telefone telefone = new Telefone();

        telefone.setTipo("celular");
        telefone.setDdd("11");
        telefone.setNumero("11 9999-9999");

        Telefone telefone2 = new Telefone();

        telefone2.setTipo("casa");
        telefone2.setDdd("11");
        telefone2.setNumero(" 88888-9999");

        Telefone[] telefones = new Telefone[2];
        telefones[0] = telefone;
        telefones[1] = telefone2;

        //contato.setTelefone(telefone);
        contato.setTelefones(telefones);


        //Teste saida no console
        System.out.println(contato.getNome());

        if (contato != null && contato.getEndereco() != null) {
            System.out.println(contato.getEndereco().getCidade());
        }

        //System.out.println(contato.getTelefone());

        /*if (contato != null && contato.getTelefone() != null) {
            System.out.println(contato.getTelefone().getDdd() +" "+ contato.getTelefone().getNumero());
        }*/

        if (contato != null && contato.getTelefones() != null) {
            for(Telefone t : contato.getTelefones()) {
                System.out.println(t.getDdd() +" "+ t.getNumero());
            }
        }


    }
}

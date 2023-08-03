package teste;

import infra.DAO;
import modelo.Pessoa;

public class ConsultarUsuario {

    public static void main(String[] args) {

        DAO<Pessoa> dao = new DAO<>(Pessoa.class);
        Long idConsulta = 3L;
        
        Pessoa pessoaConsulta = dao.abrirTransacao().consultarPorId(idConsulta);

        if (idConsulta != null) {
            System.out.println("\n Nome da pessoa: " + pessoaConsulta.getNome()
                    + "\n telefone: " + pessoaConsulta.getTelefone()
                    + "\n endereço: " + pessoaConsulta.getEndereco());
        } else {
            System.out.println("Id inválido! Digite um número de id válido!");
        }

    }
}

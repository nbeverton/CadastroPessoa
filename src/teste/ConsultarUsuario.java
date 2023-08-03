package teste;

import infra.DAO;
import modelo.Pessoa;

public class ConsultarUsuario {

    public static void main(String[] args) {

        DAO<Pessoa> dao = new DAO<>(Pessoa.class);
        Long idConsulta = 12L;

        try {
            Pessoa usuarioConsulta = dao.abrirTransacao().consultarPorId(idConsulta);

            if (idConsulta != null) {
                System.out.println("\n Nome da pessoa: " + usuarioConsulta.getNome()
                        + "\n telefone: " + usuarioConsulta.getTelefone()
                        + "\n endereço: " + usuarioConsulta.getEndereco());
            }

        } catch (NullPointerException exception){
            System.out.println("\n Erro! Id inválido! Digite um número de id válido!");
        }




    }
}

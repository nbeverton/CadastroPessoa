// Esta classe é similiar ao InserirPessoa (genérica), mas agora usando os padrões de projeto DAO.

package teste;

import infra.DAO;
import modelo.Pessoa;

public class InserirUsuario {
    public static void main(String[] args) {

        Pessoa usuario = new Pessoa(
                "Carla",
                "Rua DEF",
                1234.5679
        );

        DAO<Pessoa> dao = new DAO<>(Pessoa.class);
        dao.abrirTransacao().incluir(usuario).fecharTransacao().fechar();
    }

}

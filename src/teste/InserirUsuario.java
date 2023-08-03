// Esta classe é similiar ao InserirPessoa (genérica), mas agora usando os padrões de projeto DAO.

package teste;

import infra.DAO;
import modelo.Pessoa;

public class InserirUsuario {
    public static void main(String[] args) {

        Pessoa usuario = new Pessoa("Bruno", "Rua CDE", 1234.5678);

        DAO<Pessoa> dao = new DAO<>(Pessoa.class);
        dao.abrirTransacao().incluir(usuario).fecharTransacao().fechar();
    }

}

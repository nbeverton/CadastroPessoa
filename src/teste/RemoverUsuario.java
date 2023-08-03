package teste;

import infra.DAO;
import modelo.Pessoa;

public class RemoverUsuario {

    public static void main(String[] args) {

        DAO<Pessoa> dao = new DAO<>(Pessoa.class);

        Long usuarioRemover = 2L;

        dao.abrirTransacao().remover(usuarioRemover).fecharTransacao().fechar();
    }
}

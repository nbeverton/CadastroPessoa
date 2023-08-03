package teste;


import infra.DAO;
import modelo.Pessoa;

public class RemoverUsuario {

    public static void main(String[] args) {

        DAO<Pessoa> dao = new DAO<>(Pessoa.class);
        dao.abrirTransacao().remover(6L).fecharTransacao().fechar();
    }
}

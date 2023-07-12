package teste;

import modelo.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class InserirPessoa {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence
                .createEntityManagerFactory("projeto-CadastroPessoas");
        EntityManager em = emf.createEntityManager();

        Pessoa novaPessoa = new Pessoa(
                "Rita",
                "Rua de Cima",
                1234.5678
        );

        em.getTransaction().begin();
        em.persist(novaPessoa);
        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
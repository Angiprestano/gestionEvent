package AngiPrestano.DAO;

import AngiPrestano.entities.event;
import jdk.jfr.Event;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class eventDAO {
    private final EntityManager em;

    public eventDAO(EntityManager em) {
        this.em = em;
    }
    public void save(event event) {
        EntityTransaction transaction = em.getTransaction();
        // inizio transazione
        transaction.begin();
        em.persist(event);
        transaction.commit();
    }
}

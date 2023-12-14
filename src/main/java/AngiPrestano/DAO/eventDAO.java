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
    public event findById(long id) {
        return  em.find(event.class, id);
    }

    public void findByIdDelete(long id) {
        event found = this.findById(id);

        if(found != null) {
            EntityTransaction transaction = em.getTransaction();
            transaction.begin();
            em.remove(found);
            transaction.commit();
            System.out.println("L'evento " + found.getTitle() + "è stato eliminato");
        } else {
            System.out.println("L'evento con l'id" + id + "non è stato trovato");
        }
    }

}

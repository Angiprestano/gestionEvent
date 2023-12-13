package AngiPrestano;

import AngiPrestano.DAO.eventDAO;
import AngiPrestano.entities.event;
import AngiPrestano.entities.eventType;
import jdk.jfr.EventType;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDate;

public class Application {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestionEvent");

    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();
        eventDAO ed = new eventDAO(em);

        event serietv = new event("Station19", LocalDate.of(2024 , 3, 12), "Is a drama series, of fire fighters", eventType.PUBLICO, 6000);
        ed.save(serietv);
    }
}

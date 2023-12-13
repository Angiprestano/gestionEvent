package AngiPrestano.DAO;

import javax.persistence.EntityManager;

public class eventDAO {
    private final EntityManager em;

    public eventDAO(EntityManager em) {
        this.em = em;
    }
}

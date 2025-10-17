package bo.developer.daleyma.proyecto.dao;

import bo.developer.daleyma.proyecto.modelo.Country;
import org.hibernate.Query;
import org.hibernate.SessionFactory;

import java.util.List;

public class CountryDAO {
    private final SessionFactory sessionFactory;

    public CountryDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public List<Country> getAll() {
        String Hql = "SELECT c FROM Country c JOIN FETCH c.languages";
        Query<Country> query = sessionFactory.getCurrentSession().createQuery(Hql, Country.class);
        return query.list();
    }
}

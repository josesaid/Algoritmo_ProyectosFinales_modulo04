package bo.developer.daleyma.proyecto.dao;

import bo.developer.daleyma.proyecto.modelo.City;
import org.hibernate.SessionFactory;
import org.hibernate.Query;

import java.util.List;

public class CityDAO {
    private final SessionFactory sessionFactory;

    public CityDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public List<City> getItems(int offset, int limit) {
        Query<City> query = sessionFactory.getCurrentSession().createQuery(
                "SELECT c " +
                "FROM City c ",
                City.class);
        query.setFirstResult(offset);
        query.setMaxResults(limit);
        return query.list();
    }

    public int getTotalCount()  {
        String Hql = "SELECT COUNT(c) FROM City c";
        Query<Long> query = sessionFactory.getCurrentSession().createQuery(Hql, Long.class);
        return Math.toIntExact(query.uniqueResult());
    }

    // Obtener datos de MySQL
    public City getById(Integer id) {
        String Hql = "select c from City c join fetch c.country where c.id = :ID";
        Query<City> query = sessionFactory.getCurrentSession().createQuery(Hql, City.class);
        query.setParameter("ID", id);
        return query.getSingleResult();
    }

}

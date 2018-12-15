package examen.common.infrastructure.hibernate.repository;

import org.springframework.beans.factory.annotation.Autowired;

public class BaseHibernateRepository<T> implements BaseRepository<T> {

    @Override
    public void persist(T entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void save(T entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(T entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void merge(T entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void saveOrUpdate(T entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
//	protected SessionFactory sessionFactory;
//
//	@Autowired
//	public void setSessionFactory(final SessionFactory sessionFactory) {
//		this.sessionFactory = sessionFactory;
//	}
//
//	protected Session getSession() {
//		return sessionFactory.getCurrentSession();
//	}
//
//	public void persist(T entity) {
//		getSession().persist(entity);
//	}
//	
//	public void save(T entity) {
//		getSession().save(entity);
//	}
//	
//	public void update(T entity) {
//		getSession().update(entity);
//	}
//
//	public void merge(T entity) {
//		getSession().merge(entity);
//	}
//	
//	public void saveOrUpdate(T entity) {
//		getSession().saveOrUpdate(entity);
//	}
}

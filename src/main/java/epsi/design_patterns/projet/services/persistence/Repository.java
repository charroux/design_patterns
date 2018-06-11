package epsi.design_patterns.projet.services.persistence;

public interface Repository<T> {
	
	T save(T entity);
    T findOne(long primaryKey);
    T findByNom(String nom);
    Iterable<T> findAll();
    Long count();
    void delete(T entity);
    boolean exists(long primaryKey);

}

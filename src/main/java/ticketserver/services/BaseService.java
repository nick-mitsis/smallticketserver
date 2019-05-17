package ticketserver.services;

import java.util.List;

public interface BaseService<T,N> {
  
  T create (final T entity);
  
  void update(final T entity);
  
  void delete(final T entity);
  
  void deleteById(final N id);
  
  boolean exists(final T entity);
  
  T getEntity(final N id);

  List<T> findAll();

}

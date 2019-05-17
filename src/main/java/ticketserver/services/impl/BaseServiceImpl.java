package ticketserver.services.impl;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import ticketserver.model.BaseEntity;
import ticketserver.services.BaseService;

public abstract class BaseServiceImpl<T extends BaseEntity> implements BaseService<T, String> {
  public abstract JpaRepository<T, String> getRepository();

  @Override
  public List<T> findAll() {
    return getRepository().findAll();
  }

  @Override
  public T create(final T entity) {
    return getRepository().save(entity);
  }

  @Override
  public void update(final T entity) {
    getRepository().save(entity);
  }

  @Override
  public void delete(final T entity) {
    final T entityFound = getRepository().getOne(entity.getId());
    getRepository().delete(entityFound);
  }

  @Override
  public void deleteById(final String id) {
    getRepository().getOne(id);
    getRepository().deleteById(id);
  }

  @Override
  public boolean exists(final T entity) {
    return getRepository().existsById(entity.getId());
  }
}

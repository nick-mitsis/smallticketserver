package ticketserver.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ticketserver.model.BaseEntity;

@Repository
public interface BaseRepository<T extends BaseEntity, String> extends JpaRepository<T, String> {

}

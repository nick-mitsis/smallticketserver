package ticketserver.repositories;

import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ticketserver.model.BaseEntity;

@Repository
public interface BaseRepository<T extends BaseEntity, I extends Serializable> extends JpaRepository<T, I> {

}

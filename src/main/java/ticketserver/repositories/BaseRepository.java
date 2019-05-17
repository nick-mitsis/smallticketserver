package ticketserver.repositories;

import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import ticketserver.model.BaseEntity;

public interface BaseRepository<T extends BaseEntity, I extends Serializable> extends JpaRepository<T, I> {

}

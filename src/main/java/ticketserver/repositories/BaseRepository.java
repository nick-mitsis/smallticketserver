package ticketserver.repositories;

import java.io.Serializable;
import java.text.MessageFormat;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ticketserver.exceptions.TicketDoesNotExist;
import ticketserver.model.BaseEntity;

@Repository
public interface BaseRepository<T extends BaseEntity, I extends Serializable> extends JpaRepository<T, I> {

  default T fetchById(I id) {
    Optional<T> optional = findById(id);
    return optional.orElseThrow(() -> new TicketDoesNotExist(
        MessageFormat.format("Ticket with id {0} could not be found", id)));
  }
}

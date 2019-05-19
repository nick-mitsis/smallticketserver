package ticketserver.repositories;

import java.io.Serializable;
import org.springframework.stereotype.Repository;
import ticketserver.model.Ticket;

@Repository
public interface TicketRepository<T extends Ticket, I extends Serializable>
    extends BaseRepository<T, I> {
}

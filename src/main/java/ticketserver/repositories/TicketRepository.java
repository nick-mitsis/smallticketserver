package ticketserver.repositories;

import java.io.Serializable;
import org.springframework.stereotype.Repository;
import ticketserver.model.Ticket;

@Repository
public interface TicketRepository<T extends Ticket, ID extends Serializable>
    extends BaseRepository<Ticket, String> {
}

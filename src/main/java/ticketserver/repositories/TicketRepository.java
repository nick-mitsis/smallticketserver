package ticketserver.repositories;

import org.springframework.stereotype.Repository;
import ticketserver.model.Ticket;

@Repository
public interface TicketRepository<T extends Ticket, String> extends BaseRepository<T, String> {
}

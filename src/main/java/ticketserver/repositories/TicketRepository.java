package ticketserver.repositories;

import org.springframework.stereotype.Repository;
import ticketserver.model.Ticket;

@Repository
public interface TicketRepository extends BaseRepository<Ticket, String> {
}

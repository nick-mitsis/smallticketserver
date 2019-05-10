package ticketserver.repositories;

import java.io.Serializable;
import ticketserver.model.Ticket;

public interface TicketRepository<T extends Ticket, I extends Serializable>
    extends BaseRepository<T, I> {
}

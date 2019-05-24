package ticketserver.services.impl;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import ticketserver.model.Ticket;
import ticketserver.repositories.TicketRepository;
import ticketserver.services.TicketService;

@Service
@RequiredArgsConstructor
public class TicketServiceImpl extends BaseServiceImpl<Ticket> implements TicketService {
  private final TicketRepository ticketRepository;

  @Override
  public JpaRepository<Ticket, String> getRepository() {
    return ticketRepository;
  }

  @Override
  public Ticket getEntity(String ticketId) {
    return getRepository().getOne(ticketId);
  }
}

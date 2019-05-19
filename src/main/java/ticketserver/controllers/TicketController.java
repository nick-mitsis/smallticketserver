package ticketserver.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.RequiredArgsConstructor;
import ticketserver.model.Ticket;
import ticketserver.services.BaseService;
import ticketserver.services.TicketService;

@RestController
@RequestMapping("/tickets")
@RequiredArgsConstructor
public class TicketController extends BaseController<Ticket> {
  private final TicketService ticketservice;

  @Override
  protected BaseService<Ticket, String> getBaseService() {
    return ticketservice;
  }

}

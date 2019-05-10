package ticketserver.exceptions;

public class TicketDoesNotExist extends TicketException {

  private static final long serialVersionUID = -4510224434095373271L;

  public TicketDoesNotExist(String message, Object... objects) {
    super(message, objects);
  }
}

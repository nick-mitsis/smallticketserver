package ticketserver.exceptions;

import java.io.Serializable;
import java.text.MessageFormat;

public abstract class TicketException extends RuntimeException implements Serializable {

  private static final long serialVersionUID = -4151080270740251885L;

  protected TicketException() {}

  protected TicketException(String messsage) {
    super(messsage);
  }

  protected TicketException(String message, Object... objects) {
    super(MessageFormat.format(message, objects));
  }

}

package ticketserver.repositories;

import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import ticketserver.model.UserComments;

public interface UserCommentsRepository<T extends UserComments, I extends Serializable>
    extends JpaRepository<T, I> {
}

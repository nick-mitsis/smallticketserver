package ticketserver.repositories;

import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ticketserver.model.UserComments;

@Repository
public interface UserCommentsRepository<T extends UserComments, I extends Serializable>
    extends JpaRepository<T, I> {
}

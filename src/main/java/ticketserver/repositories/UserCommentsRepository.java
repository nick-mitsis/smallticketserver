package ticketserver.repositories;

import java.io.Serializable;
import org.springframework.stereotype.Repository;
import ticketserver.model.UserComments;

@Repository
public interface UserCommentsRepository<T extends UserComments, ID extends Serializable>
    extends BaseRepository<T, String> {

}

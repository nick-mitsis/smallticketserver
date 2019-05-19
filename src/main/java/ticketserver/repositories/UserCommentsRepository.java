package ticketserver.repositories;

import org.springframework.stereotype.Repository;
import ticketserver.model.UserComments;

@Repository
public interface UserCommentsRepository<T extends UserComments, String>
    extends BaseRepository<T, String> {
  
}

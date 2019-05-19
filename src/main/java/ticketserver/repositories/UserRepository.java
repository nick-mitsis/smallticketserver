package ticketserver.repositories;

import org.springframework.stereotype.Repository;
import ticketserver.model.User;

@Repository
public interface UserRepository<T extends User, String>
extends BaseRepository<T, String> {

}

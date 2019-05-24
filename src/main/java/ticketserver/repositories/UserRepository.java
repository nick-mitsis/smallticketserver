package ticketserver.repositories;

import java.io.Serializable;
import org.springframework.stereotype.Repository;
import ticketserver.model.User;

@Repository
public interface UserRepository<T extends User, ID extends Serializable> extends BaseRepository<User, String> {

}

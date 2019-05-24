package ticketserver.services.impl;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import ticketserver.model.User;
import ticketserver.repositories.UserRepository;
import ticketserver.services.UserService;

@Service
@RequiredArgsConstructor
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService {
  private final UserRepository userRepository;

  @Override
  public JpaRepository<User, String> getRepository() {
    return userRepository;
  }

  @Override
  public User getEntity(String userId) {
    return getRepository().getOne(userId);
  }

}

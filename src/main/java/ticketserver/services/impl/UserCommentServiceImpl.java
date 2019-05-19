package ticketserver.services.impl;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import ticketserver.model.UserComments;
import ticketserver.repositories.UserCommentsRepository;
import ticketserver.services.UserCommentService;

@Service
@RequiredArgsConstructor
public class UserCommentServiceImpl extends BaseServiceImpl<UserComments>
    implements UserCommentService {

  private final UserCommentsRepository<UserComments, String> userCommentsRepository;

  @Override
  public UserComments getEntity(String id) {
    return getRepository().getOne(id);
  }

  @Override
  public JpaRepository<UserComments, String> getRepository() {
    return userCommentsRepository;
  }
}

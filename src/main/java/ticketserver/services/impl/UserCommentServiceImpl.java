package ticketserver.services.impl;

import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import ticketserver.model.UserComments;
import ticketserver.services.UserCommentService;

@Service
@RequiredArgsConstructor
public class UserCommentServiceImpl extends BaseServiceImpl<UserComments>
    implements UserCommentService {

}

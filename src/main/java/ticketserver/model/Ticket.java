package ticketserver.model;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Ticket extends BaseEntity {

  private static final long serialVersionUID = 1L;

  private String title;
  private String description;
  private String ticketReporter;
  private String status;
  private List<UserComments> userComments;

}

package ticketserver.model;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
public class Ticket extends BaseEntity {

  private static final long serialVersionUID = 1L;

  @Column
  private String title;

  @Column
  private String description;

  @Column
  private String status;

  @ManyToOne
  private User user;

  @OneToMany(mappedBy = "tickets", cascade = CascadeType.ALL)
  private List<UserComments> userComments;

  public Ticket() {
    setId(java.util.UUID.randomUUID().toString());
  }

}

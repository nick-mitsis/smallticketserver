package ticketserver.model;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User extends BaseEntity {

  private static final long serialVersionUID = 1L;

  @Column
  private String firstName;
  @Column
  private String lastName;

  @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
  private List<Ticket> userTickets;
}

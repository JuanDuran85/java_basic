package sb.zone_fit_sb.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "clients")
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "membership")
    private Integer membershipId;
}

/**
 * @author       : Hind ABDELLAOUI
 * @date         : 05/02/2022
 * @Company      : CIGMA - MSI 2
 */
package hind.msi.userapi.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "User")
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name="fullName")
    private String fullName;
    @Column(name="email")
    private String email;
}
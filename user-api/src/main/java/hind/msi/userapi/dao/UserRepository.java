/**
 * @author       : Hind ABDELLAOUI
 * @date         : 05/02/2022
 * @Company      : CIGMA - MSI 2
 */
package hind.msi.userapi.dao;

import hind.msi.userapi.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}

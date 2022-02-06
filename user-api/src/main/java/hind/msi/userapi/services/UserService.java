/**
 * @author       : Hind ABDELLAOUI
 * @date         : 05/02/2022
 * @Company      : CIGMA - MSI 2
 */
package hind.msi.userapi.services;

import hind.msi.userapi.entities.User;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserService {

    Page<User> selectAll(Pageable page);
    User insert(User U);

}

/**
 * @author       : Hind ABDELLAOUI
 * @date         : 05/02/2022
 * @Company      : CIGMA - MSI 2
 */
package hind.msi.userapi.services;

import hind.msi.userapi.dao.UserRepository;
import hind.msi.userapi.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import org.springframework.data.domain.Pageable;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository UserRepository;

    @Override
    public Page<User> selectAll(Pageable pageable){
        return UserRepository.findAll(pageable);
    }

    @Override
    public User insert(User U){
        return UserRepository.save(U);
    }

}

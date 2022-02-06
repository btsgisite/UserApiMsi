/**
 * @author       : Hind ABDELLAOUI
 * @date         : 05/02/2022
 * @Company      : CIGMA - MSI 2
 */
package hind.msi.userapi.controllers;

import hind.msi.userapi.entities.User;
import hind.msi.userapi.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/UserApi/V1")
public class UserRestController {

    @Autowired
    private UserService service;

    @GetMapping("/AllUser")
    public Page<User> getAllUser(Pageable pageable) {
        return service.selectAll(pageable);
    }

    @PostMapping("/CreateUser")
    public User insert(@RequestBody User U) {
        return service.insert(U);
    }

}

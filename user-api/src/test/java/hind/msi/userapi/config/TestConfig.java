/**
 * @author       : Hind ABDELLAOUI
 * @date         : 06/02/2022
 * @Company      : CIGMA - MSI 2
 */
package hind.msi.userapi.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import hind.msi.userapi.entities.User;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

@TestConfiguration
public class TestConfig {

    @Bean
    public ObjectMapper objectMapper() {
        return new ObjectMapper();
    }

    @Bean
    public User firstUser() {
        User Testhind = new User();
        Testhind.setEmail("bts.gi.site@gmail.com");
        Testhind.setFullName("Hind ABDELLAOUI");
        Testhind.setId(10);
        return Testhind;
    }
}
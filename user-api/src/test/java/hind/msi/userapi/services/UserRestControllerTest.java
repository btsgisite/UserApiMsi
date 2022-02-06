package hind.msi.userapi.services;

import hind.msi.userapi.config.TestConfig;
import hind.msi.userapi.controllers.UserRestController;
import hind.msi.userapi.entities.User;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Import;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@Import(TestConfig.class)
public class UserRestControllerTest {


        private UserRestController controller;

        private UserService service;
       @Autowired
        @Qualifier(value = "firstUser") private User firstUser;

        @Before
        public void setUp() {
             service = Mockito.mock(UserService.class);
        }

        @Test
        public void getListUserTest() throws Exception{
            Page<User> pro= Mockito.mock(Page.class);
            when(service.selectAll(Pageable.ofSize(1))).thenReturn(pro);
            Page<User> UerFromService = service.selectAll(Pageable.ofSize(1));
            System.out.println("Hind getTotalPages : " + UerFromService.getTotalPages());
            System.out.println("Hind getTotalPages1 : " + pro.getTotalPages());
            when(service.selectAll(Pageable.ofSize(1))).thenReturn(UerFromService);
            assertThat(UerFromService.getTotalPages(), is(0));
            assertThat(pro.getTotalPages(), is(0));
        }
        @Test
        public void createNewUserTest() {
            User Testhind = new User();
            Testhind.setEmail("bts.gi.site@gmail.com");
            Testhind.setFullName("Hind ABDELLAOUI");
            BDDMockito.given(service.insert(Testhind)).willReturn(Testhind);
            User createdUser = service.insert(Testhind);
            System.out.println("Hind  : " + createdUser.getFullName());
            assertThat(createdUser.getFullName(), is("Hind ABDELLAOUI"));
            assertThat(createdUser.getEmail(), is("bts.gi.site@gmail.com"));
        }

}

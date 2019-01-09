package com.example.lombokdemo.model;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
public class UserTest {

    @Test
    public void getsAndSets(){
        User user = User.builder().id(1).name("brad").email("oluwajobaadegboye@hotmail.com").phone("641-819-1032")
                .username("oluwajoba").website("http://google.com").build();
        assertEquals("oluwajoba",user.getUsername());
        assertEquals(1,user.getId());
    }
}

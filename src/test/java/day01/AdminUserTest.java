package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdminUserTest {
    @Test
    void testGetPassword(){
        User user = new AdminUser("k.p@gmail.com", "12345");
        assertEquals("*****", user.getPassword());
    }
}
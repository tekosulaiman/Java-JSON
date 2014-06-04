package co.id;

import co.id.model.User;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.codehaus.jackson.map.ObjectMapper;

/**
 * @author tombisnis@yahoo.com
 */
public class TestJackson {
    public static void main(String[] args) {
        User user = new User();
        ObjectMapper objectMapper = new ObjectMapper();
        
        try {
            objectMapper.writeValue(new File("src/main/java/co/id/file/user.json"), user);
            
            System.out.println(objectMapper.writeValueAsString(user));
        } catch (IOException ex) {
            Logger.getLogger(TestJackson.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
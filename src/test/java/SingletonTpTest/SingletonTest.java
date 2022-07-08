package SingletonTpTest;

import SingletonTp.Singleton;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class SingletonTest {
    // Le resultat doit être jdbc:mysql://localhost:3306/mabase
    @Test
    public void testDbUrl() throws Exception {
        String url = Singleton.getProperties().getString("db.url");
        assertEquals("jdbc:mysql://localhost:3306/mabase", url);
    }

    // Le résultat doit être root
    @Test
    public void testDbRoot() throws Exception {
        String user = Singleton.getProperties().getString("db.user");
        assertEquals("root", user);
    }

    // Le résultat doit être 1234
    @Test
    public void testDbPassword() throws Exception {
        String password = Singleton.getProperties().getString("db.password");
        assertEquals("db.password", password);
    }

}

import Classes.Login;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class LoginTeste {
    
    public LoginTeste() {}

    @BeforeClass
    public static void setUpClass() {}

    @AfterClass
    public static void tearDownClass() {}

    @Before
    public void setUp() {}

    @After
    public void tearDown() {}

    @Test
    public void deveValidarLoginCorreto() {
        assertTrue(Login.verificarLogin("Aline", "aline.querino@gmail.com"));
    }

    @Test
    public void deveRetornarFalsoParaEmailErrado() {
        assertFalse(Login.verificarLogin("Aline", "email_errado@gmail.com"));
    }

    @Test
    public void deveRetornarFalsoParaUsuarioInexistente() {
        assertFalse(Login.verificarLogin("Joao", "joao@gmail.com"));
    }
}

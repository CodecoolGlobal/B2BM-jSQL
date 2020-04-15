import org.junit.jupiter.api.Test;

public class ErrorMessageTest extends Initialization {

    private HomePage homePage = new HomePage();

    @Test
    public void checkErrorMessage() {
        homePage.fillTheTextInput();
        homePage.checkErrorMessage();
    }
}

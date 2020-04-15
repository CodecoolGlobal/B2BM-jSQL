import org.junit.jupiter.api.Test;

public class ResetTest extends Initialization {

    private HomePage homePage = new HomePage();

    @Test
    public void clickOnResetButton() {
        homePage.clickOnResetButton();
    }
}

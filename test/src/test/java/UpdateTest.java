import org.junit.jupiter.api.Test;

public class UpdateTest extends Initialization {

    private HomePage homePage = new HomePage();

    @Test
    public void updateATable() {
        homePage.checkTableRow();
    }
}

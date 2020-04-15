import org.junit.jupiter.api.Test;

public class TaskTest extends Initialization {

    private HomePage homePage = new HomePage();

    @Test
    public void checkTask() {
        homePage.checkTask();
    }
}

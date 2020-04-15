import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {

    private WebDriver driver;
    private WebDriverWait wait;
    private WebElement textInput;
    private WebElement checkTableRow;
    private WebElement checkTask;
    private WebElement solutionButton;
    private WebElement resetButton;
    private WebElement errorMessage;

    public HomePage() {
        this.driver = getDriver();
        this.wait = getWait();
        PageFactory.initElements(driver, this);
    }

    public void fillTheTextInput() {
        textInput.sendKeys("");
    }

    public boolean checkTableRow() {
        return checkTableRow.isDisplayed();
    }

    public boolean checkTask() {
        return checkTask.isDisplayed();
    }

    public void clickOnSolutionButton() {
        solutionButton.click();
    }

    public void clickOnResetButton() {
        resetButton.click();
    }

    public boolean checkErrorMessage() {
        return errorMessage.isDisplayed();
    }
}

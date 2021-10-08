import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCart extends PageObject{

    @FindBy(xpath = "//div[@class='inventory_item_name']")
    private WebElement product_name;

    public ShoppingCart(WebDriver driver){
        super(driver);
    }

    public String getProductName(){
        return this.product_name.getText();
    }
}

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends PageObject{

    @FindBy(xpath = "//span[contains(text(),'Products')]")
    private WebElement products_label;

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    private WebElement addToCart_SauceBackpack;

    @FindBy(xpath = "//span[@class='shopping_cart_badge']")
    private WebElement cart_badge;

    @FindBy(id = "react-burger-menu-btn")
    private WebElement menu_button;

    @FindBy(id = "logout_sidebar_link")
    private WebElement logout_button;

    @FindBy(id = "shopping_cart_container")
    private WebElement shopping_cart;

    public ProductsPage(WebDriver driver){
        super(driver);
    }

    public String getTitle(){
        return this.products_label.getText();
    }

    public void addToCartBackpack(){
        this.addToCart_SauceBackpack.click();
    }

    public String getCartBadge(){
        return this.cart_badge.getText();
    }

    public void openSidebarMenu(){
        this.menu_button.click();
    }

    public void pressLogoutButton(){
        this.logout_button.click();
    }

    public void enterShoppingCart(){
        this.shopping_cart.click();
    }
}

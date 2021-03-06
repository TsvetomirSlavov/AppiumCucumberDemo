package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.testng.Assert;


public class ProductPage extends BasePage{


    public ProductPage(AndroidDriver driver) {
        super(driver);
    }

    public ProductPage addToCart(String keyword) {
        driver.findElement(By.id(app_package_name+"product_page_bottom_bar_cart_button")).click();
        return new ProductPage(driver);
    }

    public void verifyCartShowsTheCount(){
        String count = driver.findElement(By.id(app_package_name + "cart_count")).getText();
        Assert.assertEquals(count,"1".toString());
    }

}

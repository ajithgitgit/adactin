
package com.pageObjectModel;

import com.baseclass.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LoginPage extends BaseClass {

    // WebElements
    @FindBy(id = "username")
    private WebElement username;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(name = "login")
    private WebElement login_Btn;

    @FindBy(id = "location")
    private WebElement dd_location;

    // Constructor
    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    // Getters
    public WebElement getUsername() {
        return username;
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getLogin_Btn() {
        return login_Btn;
    }

    public WebElement getDd_location() {
        return dd_location;
    }

    // Setters
    public void setUsername(String user) {
        getUsername().sendKeys(user);
    }

    public void setPassword(String pass) {
        getPassword().sendKeys(pass);
    }

    public void setLogin_Btn() {
        getLogin_Btn().click();
    }

    public void setDd_location(int index) {
        Select select = new Select(getDd_location());
        select.selectByIndex(index);
    }
}

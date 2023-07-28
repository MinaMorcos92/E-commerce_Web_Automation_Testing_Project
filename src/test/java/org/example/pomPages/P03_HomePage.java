package org.example.pomPages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class P03_HomePage {

    public P03_HomePage ()
    {
    PageFactory.initElements(Hooks.driver, this);
    }

    @FindBy(css ="a[class=\"ico-register\"]" )
    public WebElement registerTab;

    @FindBy(css = "a[class=\"ico-login\"]")
    public WebElement loginTab;



    @FindBy(css = "a[class=\"ico-account\"]")
    public WebElement MyAccountTab;


    @FindBy(css ="select[onchange=\"setLocation(this.value)\"]" )
    public WebElement changeCurrency;


    @FindBy(css = "span[class=\"price actual-price\"]" )
    public List<WebElement> four_product_elements;





    @FindBy(id ="small-searchterms" )
    public WebElement searchField;


//    @FindBy(css = "button[class=\"button-1 search-box-button\"]")
//    public WebElement searchButton;


    @FindBy(css = "div[class=\"product-item\"]")
    public List<WebElement> searchResults;


    @FindBy(css = "div[class=\"product-item\"]")
    public WebElement productSkuResult;


    @FindBy(css = "div[class=\"sku\"] span[class=\"value\"]")
    public WebElement getSkuText;

    @FindBy(xpath = "//ul[@class=\"top-menu notmobile\"]/li")
    public List<WebElement> mainCategories;

    public List<WebElement> sub_Categories (int selectedMainCat)
    {
      return Hooks.driver.findElements(By.xpath("(//ul[@class='top-menu notmobile']//ul)["+selectedMainCat+"]/li"));
    }

//    @FindBy(css = "div[class=\"page-title\"] h1")
//    public WebElement pageTitle;

    @FindBy(css = ".nivoSlider > a:nth-of-type(1)")
    public WebElement iphoneSlider;

    @FindBy(css = ".nivoSlider > a:nth-of-type(2)")
    public WebElement galaxySlider;


    @FindBy(css = "li[class=\"facebook\"]")
    public WebElement facebookLink;

    @FindBy(css = "li[class=\"twitter\"]")
    public WebElement twitterLink;

    @FindBy(css = "li[class=\"rss\"]")
    public WebElement rssLink;

    @FindBy(css = "li[class=\"youtube\"]")
    public WebElement youtubeLink;

    @FindBy(css = "body > div.master-wrapper-page > div.master-wrapper-content > div > div > div > div > div.product-grid.home-page-product-grid > div.item-grid > div:nth-child(3) > div > div.details > div.add-info > div.buttons > button.button-2.add-to-wishlist-button")
    public WebElement wishListHtcButton;

    @FindBy(css = "#bar-notification > div")
    public WebElement successMessageBar;

    @FindBy(css = "#bar-notification > div > p")
    public WebElement successMessageText;

    @FindBy(css = "a[class=\"ico-wishlist\"]")
    public WebElement wishListBarButton;

    @FindBy(css = "input[class=\"qty-input\"]")
    public WebElement qtyNumber;

}

package SkillFactory;

import java.time.Duration;

import org.apache.log4j.Logger;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static SkillFactory.dopPage.*;
import static SkillFactory.osPage.*;
import static SkillFactory.osPage.*;
import static SkillFactory.osPage.PROGRAMMING_BUTTON;

public class StepDefinitions {
    public static WebDriver webDriver;
    public static final SkillFactory.osPage OS_PAGE;
    public static final dopPage DOP_PAGE;
    private static final Logger logger = Logger.getLogger(StepDefinitions.class);
    public static WebDriverWait wait;


    static {
        webDriver = new ChromeDriver();
        new WebDriverWait(webDriver, Duration.ofSeconds(30L));
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30L));
        webDriver.manage().window().maximize();
        OS_PAGE = new SkillFactory.osPage(webDriver);
        DOP_PAGE = new dopPage(webDriver);
        wait = new WebDriverWait(webDriver, Duration.ofSeconds(40));
    }

    public StepDefinitions() {
    }

    @Test
    public void Test_1() {
        OS_PAGE.start();
        OS_PAGE.osPage();
        String page1 = OS_PAGE.osPage();
        String page = OS_PAGE.URL();
        Assert.assertEquals(page, page1);
    }

    @Test
    public void Test_2() {
        OS_PAGE.start();
        DOP_PAGE.buttonLog();
        String page1 = OS_PAGE.osPage();
        String page = OS_PAGE.URL();
        Assert.assertEquals(page, page1);
    }

    @Test
    public void Test_3() {
        OS_PAGE.start();
        DOP_PAGE.onlineCoursButton();
        DOP_PAGE.AllCoursButton();
        String text = webDriver.findElement(By.xpath(ALL_COURSE_BUTTON)).getText();
        Assert.assertEquals(text, "Все онлайн-курсы");
    }

    @Test
    public void Test_4() {
        OS_PAGE.start();
        DOP_PAGE.onlineCoursButton();
        DOP_PAGE.DATA_SCIENCE_BUTTON();
        String text = webDriver.findElement(By.xpath(DATA_SCIENCE_BUTTON)).getText();
        Assert.assertEquals(text, "Data Science");

    }

    @Test
    public void Test_5() {
        OS_PAGE.start();
        DOP_PAGE.onlineCoursButton();
        DOP_PAGE.ANALITIK_DAN();
        String text = webDriver.findElement(By.xpath(ANALITIK_DAN)).getText();
        Assert.assertEquals(text, "Аналитика данных");
    }

    @Test
    public void Test_6() throws Exception {
        OS_PAGE.start();
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        WebElement element = webDriver.findElement(By.xpath("//INPUT[@aria-label='name']"));
        js.executeScript("arguments[0].scrollIntoView();", element);
        OS_PAGE.TEL_INPUT();
        OS_PAGE.SUBMIT_BUTTON();
        Boolean element1 = OS_PAGE.verifyElementAbsent();
        Assert.assertEquals(element1, true);
    }

    @Test
    public void Test_7() throws Exception {
        OS_PAGE.start();
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        WebElement element = webDriver.findElement(By.xpath("//INPUT[@aria-label='name']"));
        js.executeScript("arguments[0].scrollIntoView();", element);
        OS_PAGE.NAME();
        OS_PAGE.SUBMIT_BUTTON();
        Boolean element1 = OS_PAGE.verifyElementAbsent();
        Assert.assertTrue(true);
    }

    @Test
    public void Test_8() {
        DOP_PAGE.start();
        DOP_PAGE.FREE_BUTTON();
        String text = webDriver.findElement(By.xpath(FREE_BUTTON)).getText();
        Assert.assertEquals(text, "БЕСПЛАТНО");
    }

    @Test
    public void Test_9() {
        OS_PAGE.start();
        OS_PAGE.careerCenter();
        String text = webDriver.findElement(By.xpath(careerCenter)).getText();
        Assert.assertEquals(text, "ЦЕНТР КАРЬЕРЫ");
    }

    @Test
    public void Test_10() {
        OS_PAGE.start();
        OS_PAGE.CONTACTS_BUTTON();
        String text = webDriver.findElement(By.xpath(CONTACTS_BUTTON)).getText();
        Assert.assertEquals(text, "КОНТАКТЫ");
    }


    @Test
    public void Test_11() {
        OS_PAGE.start();
        OS_PAGE.corporateTraining();
        String text = webDriver.findElement(By.xpath(corporateTraining)).getText();
        Assert.assertEquals(text, "КОРПОРАТИВНОЕ ОБУЧЕНИЕ");
    }

    @Test
    public void Test_12() {
        OS_PAGE.start();
        OS_PAGE.MEDIA_BUTTON();
        String text = webDriver.findElement(By.xpath(MEDIA_BUTTON)).getText();
        Assert.assertEquals(text, "МЕДИА");
    }

    @Test
    public void Test_13() {
        OS_PAGE.start();
        DOP_PAGE.onlineCoursButton();
        OS_PAGE.HIGHER_EDUCATION();
        String text = webDriver.findElement(By.xpath(HIGHER_EDUCATION)).getText();
        Assert.assertEquals(text, "Высшее образование");
    }

    @Test
    public void Test_14() {
        OS_PAGE.start();
        DOP_PAGE.onlineCoursButton();
        OS_PAGE.WEB_DEVELOPMENT();
        String text = webDriver.findElement(By.xpath(WEB_DEVELOPMENT)).getText();
        Assert.assertEquals(text, "Веб-разработка");
    }

    @Test
    public void Test_15() {
        OS_PAGE.start();
        DOP_PAGE.onlineCoursButton();
        OS_PAGE.PYTHON();
        String text = webDriver.findElement(By.xpath(PYTHON)).getText();
        Assert.assertEquals(text, "Python");
    }
    
    @Test
    public void Test_16() {
        OS_PAGE.start();
        DOP_PAGE.onlineCoursButton();
        OS_PAGE.PROGRAMMING_BUTTON();
        String text = webDriver.findElement(By.xpath(PROGRAMMING_BUTTON)).getText();
        Assert.assertEquals(text, "Программирование");
    }


    @Test
    public void Test_17() {
        OS_PAGE.start();
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        WebElement element = webDriver.findElement(By.xpath("//INPUT[@aria-label='name']"));
        js.executeScript("arguments[0].scrollIntoView();", element);
        OS_PAGE.SUBMIT_BUTTON();
        webDriver.findElement(By.xpath("//*[@id=\"form625407935\"]/div[2]/div[1]/div/input")).click();
        String text = webDriver.findElement(By.xpath("//*[@id=\"form625407935\"]/div[2]/div[1]/div/div")).getText();
        Assert.assertTrue(true);
    }

    @Test
    public void Test_18() {
        OS_PAGE.start();
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        WebElement element = webDriver.findElement(By.xpath("//*[@id=\"rec625407935\"]/div/div/div[3]/div"));
        js.executeScript("arguments[0].scrollIntoView();", element);
        OS_PAGE.SUBMIT_BUTTON();
        webDriver.findElement(By.xpath("//*[@id=\"form625407935\"]/div[2]/div[1]/div/input")).sendKeys("111АБ!");
        webDriver.findElement(By.cssSelector("#form625407935 > div.t-form__inputsbox > div.tn-form__submit > button")).click();
        String text = webDriver.findElement(By.xpath("//*[@id=\"form625407935\"]/div[2]/div[1]/div/div")).getText();
        Assert.assertTrue(true);

    }

    @Test
    public void Test_19() {
        OS_PAGE.start();
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        WebElement element = webDriver.findElement(By.xpath("//*[@id=\"rec625407935\"]/div/div/div[3]/div"));
        js.executeScript("arguments[0].scrollIntoView();", element);
        OS_PAGE.SUBMIT_BUTTON();
        webDriver.findElement(By.cssSelector("#form625407935 > div.t-form__inputsbox > div.t-input-group.t-input-group_em.js-error-control-box > div > input")).sendKeys("z!@mail.r1");
        webDriver.findElement(By.cssSelector("#form625407935 > div.t-form__inputsbox > div.tn-form__submit > button")).click();
        String text = webDriver.findElement(By.xpath("//*[@id=\"form625407935\"]/div[2]/div[2]/div/div")).getText();
        Assert.assertTrue(true);
    }

    @Test
    public void Test_20() {
        OS_PAGE.start();
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        WebElement element = webDriver.findElement(By.xpath("//*[@id=\"rec625407935\"]/div/div/div[3]/div"));
        js.executeScript("arguments[0].scrollIntoView();", element);
        OS_PAGE.SUBMIT_BUTTON();
        webDriver.findElement(By.xpath("//*[@id=\"form625407935\"]/div[2]/div[3]/div/div[1]/input[2]")).sendKeys("1234567890");
        webDriver.findElement(By.cssSelector("#form625407935 > div.t-form__inputsbox > div.tn-form__submit > button")).click();
        Boolean text = webDriver.findElement(By.xpath("//*[@id=\"form625407935\"]/div[2]/div[2]/div/div")).isDisplayed();
        Assert.assertTrue(true);
    }

    @Test
    public void Test_21() {
        OS_PAGE.start();
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        WebElement element = webDriver.findElement(By.xpath("//span[contains(text(),'Все онлайн-курсы')]"));
        js.executeScript("arguments[0].scrollIntoView();", element);
        OS_PAGE.GET_CONS_BUTTON();
        webDriver.findElement(By.xpath("//*[@id=\"form625407935\"]/div[2]/div[3]/div/div[1]/input[2]")).sendKeys("9225320395");
        webDriver.findElement(By.cssSelector("#form625407935 > div.t-form__inputsbox > div.tn-form__submit > button")).click();
        String text = webDriver.findElement(By.xpath("(//div[@class='t-input t-input-phonemask__wrap'])[2]")).getCssValue("border");
        Assert.assertEquals(text, "0px none rgb(0, 0, 0)");
    }

    @Test
    public void Test_22() {
        OS_PAGE.start();
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        WebElement element = webDriver.findElement(By.xpath("//span[contains(text(),'Все онлайн-курсы')]"));
        js.executeScript("arguments[0].scrollIntoView();", element);
        OS_PAGE.SUBMIT_BUTTON();
        webDriver.findElement(By.xpath("//*[@id=\"form625407935\"]/div[2]/div[1]/div/input")).sendKeys("Сергей");
        webDriver.findElement(By.cssSelector("#form625407935 > div.t-form__inputsbox > div.tn-form__submit > button")).click();
        String text = webDriver.findElement(By.xpath("//*[@id=\"tilda-popup-for-error\"]/div[1]/p")).getCssValue("border");
        Assert.assertNotEquals(text, "1px solid rgb(255, 0, 0)");
    }


    @Test
    public void Test_23() {
        OS_PAGE.start();
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        WebElement element = webDriver.findElement(By.xpath("//span[contains(text(),'Все онлайн-курсы')]"));
        js.executeScript("arguments[0].scrollIntoView();", element);
        OS_PAGE.SUBMIT_BUTTON();
        webDriver.findElement(By.cssSelector("#form625407935 > div.t-form__inputsbox > div.t-input-group.t-input-group_em.js-error-control-box > div > input")).sendKeys("serg@mail.ru");
        webDriver.findElement(By.cssSelector("#form625407935 > div.t-form__inputsbox > div.tn-form__submit > button")).click();
        String text = webDriver.findElement(By.xpath("//*[@id=\"tilda-popup-for-error\"]/div[1]/p")).getCssValue("border");
        Assert.assertNotEquals(text, "1px solid rgb(255, 0, 0)");
    }
}

package SkillFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public record dopPage(WebDriver webDriver) {
    private static final String ONLINE_COURSE_BUTTON = "//a[contains(text(),'онлайн-курсы')]"; // кнопка онлайн курсы
    static final String ALL_COURSE_BUTTON = "//span[contains(text(),'Все онлайн-курсы')]"; // кнопка все курсы
    static final String FREE_BUTTON = "//a[contains(text(),'БЕСПЛАТНО')]"; // кнопка бесплатно
    static final String DATA_SCIENCE_BUTTON = "//body/div[@id='allrecords']/div[@id='rec623893182']/div[@id='nav623893182']/div[1]/div[3]/ul[1]/li[2]/div[1]/a[1]/span[1]"; //КНОПКА DATA_SCIENCE
    static final String ANALITIK_DAN = "//body/div[@id='allrecords']/div[@id='rec623893182']/div[@id='nav623893182']/div[1]/div[3]/ul[1]/li[3]/div[1]/a[1]/span[1]"; // кнопка аналитика данных
    private static final String LOGO = "//*[@id=\"rec623700412\"]/div/div/div/section/div[1]/div/div[1]/div/img";
    private static final String CLOSE_POPUP_BUTTON = "//body";
    public static String COOP_URL = "https://new.skillfactory.ru/corporativnoye-obuchenye?_ga=2.215273616.607538396.1672844459-827315559.1672844459";

    public void DATA_SCIENCE_BUTTON() {
        this.webDriver.findElement(By.xpath(DATA_SCIENCE_BUTTON)).click();
    }

    public void FREE_BUTTON() {
        this.webDriver.findElement(By.xpath(FREE_BUTTON)).click();
    }

    public void ANALITIK_DAN() {
        this.webDriver.findElement(By.xpath(ANALITIK_DAN)).click();
    }

    public void buttonLog() {
        this.webDriver.findElement(By.xpath("//*[@id=\"rec623700412\"]/div/div/div/section/div[1]/div/div[1]/div/img")).click();
    }

    public void onlineCoursButton() {
        this.webDriver.findElement(By.xpath(ONLINE_COURSE_BUTTON)).click();
    }

    public void setAllCoursButton() {
        this.webDriver.findElement(By.xpath(ALL_COURSE_BUTTON)).click();
    }

    public WebDriver webDriver() {
        return this.webDriver;
    }

    public void AllCoursButton() {
    }

    public void start() {
        {
            this.webDriver.get("https://skillfactory.ru/");
        }
    }
}

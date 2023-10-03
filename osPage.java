package SkillFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public record osPage(WebDriver webDriver) {


    private static final String SUBMIT_BUTTON = "//body[1]/div[2]/div[7]/div[1]/div[1]/div[6]/div[1]/form[1]/div[2]/div[6]/button[1]"; //кнопка отправки
    private static final String NAME_INPUT_BUTTON = "//*[@id=\"form625407935\"]/div[2]/div[1]/div/input"; // поле ввода имя
    private static final String URL = "https://skillfactory.ru/"; // сайт
    private static final String EMAIL_INPUT = "//*[@id=/'form625407935/']/div[2]/div[2]/div/input"; //  поле е_mail
    private static final String TEL_INPUT = "//body[1]/div[2]/div[7]/div[1]/div[1]/div[6]/div[1]/form[1]/div[2]/div[3]/div[1]/div[1]/input[2]"; // поле телефона
    static final String CONTACTS_BUTTON = "//a[contains(text(),'контакты')]"; //  кнопка контакты
    static final String startTraining = "//*[@id=\"rec618804078\"]/div/div/div[13]/a";  // начать тренировку
    static final String careerCenter = "//*[@id=\"rec623700412\"]/div/div/div/section/div[1]/div/div[1]/ul/li[3]/a"; //  центр карьеры
    static final String TO_LEARN_MORE = "//*[@id=/'rec425993788/']/div/div/div[5]/a";
    public static final String HIGHER_EDUCATION = "//*[@id=\"nav623893182\"]/div/div[3]/ul/li[17]/div/a/span";  //  высшее образование
    public static final String WEB_DEVELOPMENT = "//*[@id=\"nav623893182\"]/div/div[3]/ul/li[7]/div/a/span";
    public static final String SELECT_A_PROGRAM = "#rec617154141 > div > div > div.t396__elem.tn-elem.tn-elem__6171541411689594433393 > a";// выберите программу
    static final String COOP_BUTTON = "//body[1]/div[2]/div[4]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[8]/a[1]";
    static final String PROGRAMMING_BUTTON = "//*[@id=\"nav623893182\"]/div/div[3]/ul/li[4]/div/a/span"; // программирование
    static final String JAVA_BUTTON = "#rec569086576 > div > div > div.t396__elem.tn-elem.tn-elem__5690865761678946499402 > a"; // java кнопка
    static final String LEARN_MORE_BUTTON = "//*[@id=\"rec617154141\"]/div/div/div[6]/a";  //  узнать подробнее
    static final String  corporateTraining = "//*[@id=\"rec623700412\"]/div/div/div/section/div[1]/div/div[1]/ul/li[6]/a"; // корпоративное обучение
    static final String GET_CONS_BUTTON = "//*[@id=\"rec625407935\"]/div/div/div[3]/div"; // получить консультацию
    private static final String NAME = "//*[@id=\"form625407935\"]/div[2]/div[1]/div/input";
    public static final String JAVA_SCRIPT_BUTTON = "//body/div[@id='allrecords']/div[@id='rec569086576']/div[1]/div[1]/div[4]/a[1]"; // кнопка java script
    public static final String responses = "//*[@id=\"nav617167915\"]/div/div[3]/nav/ul/li[2]/a"; //  ответить-кнопка
    static final String MEDIA_BUTTON = "//*[@id=\"rec623700412\"]/div/div/div/section/div[1]/div/div[1]/ul/li[5]/a"; // кнопка-медиа
    public static final String PYTHON = "//*[@id=\"nav623893182\"]/div/div[3]/ul/li[5]/div/a/span"; //кнопка-Python
    public osPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void start() {
        this.webDriver.get("https://skillfactory.ru/");
    }

    public WebElement GET_CONS_BUTTON() { this.webDriver.findElement(By.xpath(GET_CONS_BUTTON)).click();
        return null;
    }
    public void TO_LEARN_MORE() {
        this.webDriver.findElement(By.xpath(TO_LEARN_MORE)).click();
    }
    public void COOP_BUTTON() {
        this.webDriver.findElement(By.xpath(COOP_BUTTON)).click();
    }
    public void HIGHER_EDUCATION() { this.webDriver.findElement(By.xpath(HIGHER_EDUCATION)).click();} //высшее образование
    public void JAVA_BUTTON() { this.webDriver.findElement(By.cssSelector(JAVA_BUTTON)).click();}
    public void corporateTraining () {
        this.webDriver.findElement(By.xpath(corporateTraining)).click();
    }
    public void careerCenter() {this.webDriver.findElement(By.xpath("//*[@id=\"rec623700412\"]/div/div/div/section/div[1]/div/div[1]/ul/li[3]/a")).click();}
    public void SELECT_A_PROGRAM() { this.webDriver.findElement(By.cssSelector(SELECT_A_PROGRAM)).click();}
    public void CAPTHA_FEEDBACK() {this.webDriver.findElement(By.className("\\/\\/div\\[\\@role\\=\\'presentation\\'\\]")).click();}
    public void SUBMIT_BUTTON() {
        this.webDriver.findElement(By.xpath(SUBMIT_BUTTON)).click();
    }
    public void PROGRAMMING_BUTTON() { this.webDriver.findElement(By.xpath(PROGRAMMING_BUTTON)).click(); }
    public void JAVA_SCRIPT_BUTTON() { this.webDriver.findElement(By.xpath(JAVA_SCRIPT_BUTTON)).click();}
    public void LEARN_MORE_BUTTON () { this.webDriver.findElement(By.xpath(LEARN_MORE_BUTTON)).click(); }
    public void responses() { this.webDriver.findElement(By.xpath(responses)).click(); }
    public void WEB_DEVELOPMENT() { this.webDriver.findElement(By.xpath(WEB_DEVELOPMENT)).click();}
    void MEDIA_BUTTON() { this.webDriver.findElement(By.xpath(MEDIA_BUTTON)).click();}
    public void PYTHON() { this.webDriver.findElement(By.xpath(PYTHON)).click();}

    public void NAME() {this.webDriver.findElement(By.xpath(NAME)).sendKeys("Сергей");}
    public void NAME_INPUT_BUTTON() {this.webDriver.findElement(By.xpath(NAME_INPUT_BUTTON)).sendKeys("СергейХ");}
    public void TEL_INPUT() { this.webDriver.findElement(By.xpath(TEL_INPUT)).sendKeys("1234567890");}
    public void EMAIL_INPUT() {this.webDriver.findElement(By.xpath(EMAIL_INPUT)).sendKeys("serg@mail.ru");}
    public void CONTACTS_BUTTON() {this.webDriver.findElement(By.xpath(CONTACTS_BUTTON)).click();}
    public void startTraining() {this.webDriver.findElement(By.xpath(startTraining)).click();}

    public String osPage() {return this.webDriver.getCurrentUrl();}

    public String URL() {return "https://skillfactory.ru/";}

    public boolean verifyElementAbsent() throws Exception {
        boolean visible = this.webDriver.findElement(By.xpath("(//DIV[@class='t-input-error'][text()='Обязательное поле'])[1]")).isDisplayed();
        boolean result = !visible;
        return result;
    }

    public boolean verifyElementAbsent1() throws Exception {
        boolean visible = this.webDriver.findElement(By.xpath("(//INPUT[@type='text'])[5]")).isDisplayed();
        boolean result = !visible;
        return result;
    }

    public WebDriver webDriver() {
        return this.webDriver;
    }


    //public void FREE_BUTTON() {
    //}
}

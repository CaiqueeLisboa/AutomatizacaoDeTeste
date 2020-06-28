import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MinhaPrimeiraAutomacao {

    @Test
    public void realizarCompra(){

        //seto o webDriver
        System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");
        //abre o webDriver
        WebDriver driver = new ChromeDriver();

        //seta a url do webDriver
        driver.get("http://automationpractice.com/index.php");

        //procuro o elemento a que tenha o data de id product = 1 com o xpath e clico nele
        driver.findElement(By.xpath("//a[@data-id-product='1']")).click();

        //Próximo passso aponta um erro.

        //procuro o elemento a que tenha o titulo Proceed to checkout com xpath e clico nele
        //driver.findElement(By.xpath("//a[@title='Proceed to checkout']")).click();

    }
}
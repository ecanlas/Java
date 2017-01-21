public class SeleniumPractice {


    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        String initialURL = "https://www.google.com/";
        String googleTitle = "Google";
        String title = "";

        driver.get(initialURL);

        WebElement searchBar = driver.findElement(By.id("id"));

        searchBar.sendKeys("facebook");
        searchBar.submit();
    }

}


package pages

import org.jbehave.web.selenium.WebDriverProvider
import org.openqa.selenium.By
import org.jbehave.web.selenium.LazyWebDriver

class Buy extends BasePage{

  def Buy(WebDriverProvider webDriverProvider) {
    super(webDriverProvider)
  }


  def selectTreasury() {
    findElement(By.id("treasury-panel-button")).click()
  }
}

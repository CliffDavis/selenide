package integration.customcommands;

import com.codeborne.selenide.Command;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.impl.WebElementSource;

import java.io.IOException;

import static integration.customcommands.MyFramework.tripleClickCounter;

class TripleClick implements Command<MySelenideElement> {
  @Override
  public MySelenideElement execute(SelenideElement proxy, WebElementSource locator, Object[] args) throws IOException {
    tripleClickCounter.incrementAndGet();
    return (MySelenideElement) proxy;
  }
}

import org.junit.jupiter.api.Test;
import tests.TestBase;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SearchTest extends TestBase {
    @Test
    void findJUnit5() {
        open("https://github.com/");

        $("[placeholder='Search or jump to...']").click();
        $("#query-builder-test").setValue("selenide").pressEnter();
        $$x("//div[@data-testid='results-list']/div//span[text()='selenide/']").get(0).click();
        $("#wiki-tab").click();
        $("#wiki-pages-filter").setValue("SoftAssertions");
        $x("//span/a[text()='SoftAssertions']").shouldHave(text("SoftAssertions"));
        $x("//span/a[text()='SoftAssertions']").click();
        $("#user-content-3-using-junit5-extend-test-class")
                .shouldHave(text("3. Using JUnit5 extend test class:"));
    }
}

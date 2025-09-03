import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class SelenideSearchTest {

    @BeforeAll
    static void settings(){
        Configuration.baseUrl = "https://github.com/";
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void softAssertionsShouldHaveExampleJUnit5Code() {

        open("/selenide/selenide");
        $("#wiki-tab").click();
        $("button.js-wiki-more-pages-link").click();
        $("#wiki-pages-box").shouldHave(text("SoftAssertions"));
        $$("#wiki-pages-box li a").findBy(text("SoftAssertions")).click();
        $("#wiki-body").shouldHave(text("JUnit5"));

    }

}

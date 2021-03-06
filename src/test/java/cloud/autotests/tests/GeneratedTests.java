package cloud.autotests.tests;

import cloud.autotests.helpers.DriverUtils;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class GeneratedTests extends TestBase {
    @Test
    @Description("Soon to be implemented by you (or QA.GURU engineers)")
    @DisplayName("Search by application name on the website")
    void generatedTest() {
        step("Open \"https://catalog.cft.ru/\"", () -> {
            step("// todo: just add selenium action");
        });

        step("Input in the search box the name of the application \"SWIFT-сообщения свободного формата МТ799, МТ999\"", () -> {
            step("// todo: just add selenium action");
        });

        step("Perform a search query", () -> {
            step("// todo: just add selenium action");
        });

        step("Check the search results", () -> {
            step("// todo: just add selenium action");
        });
    }

    @Test
    @Description("Autogenerated test")
    @DisplayName("Page title should have header text")
    void titleTest() {
        step("Open url 'https://catalog.cft.ru/'", () ->
            open("https://catalog.cft.ru/"));

        step("Page title should have text 'Каталоги Решений и Продуктов'", () -> {
            String expectedTitle = "Каталоги Решений и Продуктов";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @Description("Autogenerated test")
    @DisplayName("Page console log should not have errors")
    void consoleShouldNotHaveErrorsTest() {
        step("Open url 'https://catalog.cft.ru/'", () ->
            open("https://catalog.cft.ru/"));

        step("Console logs should not contain text 'SEVERE'", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            String errorText = "SEVERE";

            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }
}
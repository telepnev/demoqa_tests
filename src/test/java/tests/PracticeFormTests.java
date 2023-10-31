package tests;

import helper.FormPageHelper;
import org.junit.jupiter.api.Test;
import pages.PracticeFormPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class PracticeFormTests extends TestBase {
    PracticeFormPage practiceFormPage = new PracticeFormPage();
    FormPageHelper helper = new FormPageHelper();

    @Test
    public void openSite() {
        String firstName = helper.getFirstName();
        String lastName = helper.getLastName();
        String email = helper.getEmail();
        String gender = helper.getRandomGender();
        String mobile = helper.getMobilePhone();
        String month = helper.setRandomMonth();
        String year = helper.setRandomYear();
        String day = helper.setRandomDay();

        open("/automation-practice-form");
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");

        practiceFormPage.setFirstName(firstName);
        practiceFormPage.setLastName(lastName);
        practiceFormPage.setUserEmail(email);
        practiceFormPage.setRandomGender(gender);
        practiceFormPage.setMobilePhone(mobile);

        practiceFormPage.initCreateDateOfBirth.click();
        practiceFormPage.setMonth(month);
        practiceFormPage.setYear(year);
        practiceFormPage.setDay(day);

        practiceFormPage.setSubject("Arts");
        practiceFormPage.setRandomHobbies();
        practiceFormPage.picture.uploadFromClasspath("Locators.pdf");
        practiceFormPage.currentAddress.setValue(helper.getCurrentAddress());
        practiceFormPage.setState("Uttar Pradesh");
        practiceFormPage.setCity("Agra");
        practiceFormPage.submitButton();

        $(".table-responsive")
                .shouldHave(text(firstName))
                .shouldHave(text(lastName))
                .shouldHave(text(email))
                .shouldHave(text(gender))
                .shouldHave(text(mobile))
                .shouldHave(text(month))
                .shouldHave(text(year))
                .shouldHave(text(day))
                .shouldHave(text("Uttar Pradesh"))
                .shouldHave(text("Agra"));

    }


}

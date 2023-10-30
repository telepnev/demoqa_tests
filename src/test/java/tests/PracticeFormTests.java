package tests;

import com.github.javafaker.Faker;
import helper.FormPageHelper;
import org.junit.jupiter.api.Test;
import pages.PracticeFormPage;

import static com.codeborne.selenide.Selenide.*;

public class PracticeFormTests extends TestBase {
    PracticeFormPage practiceFormPage = new PracticeFormPage();
    FormPageHelper helper = new FormPageHelper();

    Faker faker = new Faker();
    @Test
    public void openSite() {
        open("/automation-practice-form");

        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");

        practiceFormPage.firstName.setValue(helper.getFirstName());
        practiceFormPage.lastName.setValue(helper.getLastName());
        practiceFormPage.userEmail.setValue(helper.getEmail());
        practiceFormPage.setRandomGender();
        practiceFormPage.mobile.setValue(helper.getMobilePhone());

        practiceFormPage.initCreateDateOfBirth.click();
        practiceFormPage.setRandomMonth();
        practiceFormPage.setRandomYear();
        practiceFormPage.setRandomDay();
        $("#subjectsInput").setValue("Arts").pressEnter();
        $(".custom-control custom-checkbox custom-control-inline")
                .selectOptionByValue("1");


        $("#currentAddress").setValue("sdfsdfsdfsdfsdfsdf");


    }


}

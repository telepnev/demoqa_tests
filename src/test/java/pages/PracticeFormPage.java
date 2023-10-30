package pages;

import com.codeborne.selenide.SelenideElement;
import helper.FormPageHelper;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class PracticeFormPage {
    FormPageHelper helper = new FormPageHelper();
    public SelenideElement firstName = $("#firstName");
    public SelenideElement lastName = $("#lastName");
    public SelenideElement userEmail = $("#userEmail");
    //---Gender
    public SelenideElement gender = $(By.name("gender"));
    // --Mobile
    public SelenideElement mobile = $("#userNumber");
    // --Date of Birth
    public SelenideElement initCreateDateOfBirth = $("#dateOfBirthInput");
    public SelenideElement month = $(".react-datepicker__month-select");
    public SelenideElement year = $(".react-datepicker__year-select");
    // ---Subjects
    public SelenideElement subjects = $("#subjectsInput");

    //----Hobbies
    public SelenideElement sportsCheckBox = $("#hobbies-checkbox-1");
    public SelenideElement readingCheckBox = $("#hobbies-checkbox-2");
    public SelenideElement musicCheckBox = $("#hobbies-checkbox-3");
    //

    public SelenideElement picture = $("#uploadPicture");
    public SelenideElement currentAddress = $("#currentAddress");

    public void setRandomGender() {
        $("#genterWrapper").$(byText(helper.getRandomGender())).click();
    }

    public void setRandomDay() {
        String datepickerDayXpath = String.format("//div[not(contains(@class,'day--outside-month'))][text()='%s']",
                helper.setRandomDay());
        $x(datepickerDayXpath).click();
    }

    public void setRandomMonth() {
        month.selectOptionByValue(helper.setRandomMonth());
    }
    public void setRandomYear() {
        year.selectOptionByValue(helper.setRandomYear()); // 1900 -2023
    }


}

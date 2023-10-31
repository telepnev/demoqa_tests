package pages;

import com.codeborne.selenide.SelenideElement;
import helper.FormPageHelper;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class PracticeFormPage {
    FormPageHelper helper = new FormPageHelper();
    public SelenideElement firstName = $("#firstName");
    public SelenideElement lastName = $("#lastName");
    public SelenideElement userEmail = $("#userEmail");
    //---Gender
    public SelenideElement genderWrapper = $("#genterWrapper");
    // --Mobile
    public SelenideElement mobile = $("#userNumber");
    // --Date of Birth
    public SelenideElement initCreateDateOfBirth = $("#dateOfBirthInput");
    public SelenideElement month = $(".react-datepicker__month-select");
    public SelenideElement year = $(".react-datepicker__year-select");
    // ---Subjects
    public SelenideElement subjects = $("#subjectsInput");

    //----Hobbies
    public SelenideElement hobbiesWrapper = $("#hobbiesWrapper");

    // --Picture
    public SelenideElement picture = $("#uploadPicture");
    // --CurrentAddress
    public SelenideElement currentAddress = $("#currentAddress");
    // --State and City
    public SelenideElement state = $("#state");
    public SelenideElement city = $("#city");
    // --Submit
    public SelenideElement submit = $("#submit");


    public void setRandomGender(String str) {
        genderWrapper.$(byText(str)).click();
    }

    public void setRandomHobbies() {
        hobbiesWrapper.$(byText(helper.getRandomHobbies())).click();
    }

    public void setDay(String str) {
        String datepickerDayXpath = String.format("//div[not(contains(@class,'day--outside-month'))][text()='%s']",
                str);
        $x(datepickerDayXpath).click();
    }
    public void setMobilePhone(String str) {
        mobile.setValue(str);
    }


    public void setSubject(String subject) {
        subjects.setValue(subject).pressEnter();
    }

    public void setMonth(String str) {
        month.selectOptionByValue(str);
    }

    public void setYear(String str) {
        year.selectOptionByValue(str); // 1900 -2023
    }


    public void setState(String str) {
        state.click();
        state.$(byText(str)).click();
    }

    public void setCity(String str) {
        city.click();
        city.$(byText(str)).click();
    }
    public void submitButton() {
        submit.click();
    }

    public void setFirstName(String str) {
        firstName.setValue(str);
    }

    public void setLastName(String str) {
        lastName.setValue(str);
    }

    public void setUserEmail(String str) {
        userEmail.setValue(str);
    }
}

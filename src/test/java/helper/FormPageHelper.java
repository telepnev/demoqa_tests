package helper;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FormPageHelper {
    Faker faker = new Faker();
    String firstName =  faker.name().firstName();
    String lastName = faker.name().lastName();
    String email = faker.internet().emailAddress();
    String mobilePhone = faker.phoneNumber().subscriberNumber(9);

    public Faker getFaker() {
        return faker;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getMobilePhone() {
        return  mobilePhone;
    }



     public String getRandomGender() {
        final Random random = new Random();
        List<String> str = new ArrayList<>(List.of("Male", "Female", "Other"));
        int min = 0;
        int max = 2;
        int diff = max - min;
        int i = random.nextInt(diff + 1);
        return str.get(i += min);

    }

    public String setRandomMonth() {
        final Random random = new Random();
        List<String> str = new ArrayList<>(List.of("January", "February", "March",
                "April", "May", "June", "July", "August", "September",
                 "October", "November", "December"));
        int i = random.nextInt(0, 11);
        String num = Integer.toString(i);
        return  num;
    }

    public String setRandomYear() {
        final Random random = new Random();
        int i = random.nextInt(1900, 2023);
        String num = Integer.toString(i);
        return  num;
    }
    public String setRandomDay() {
        final Random random = new Random();
        int i = random.nextInt(1, 28);
        String num = Integer.toString(i);
        return  num;
    }
}

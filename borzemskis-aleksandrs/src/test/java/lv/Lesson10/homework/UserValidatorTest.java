package lv.Lesson10.homework;

import lv.lesson10.homework.User;
import lv.lesson10.homework.UserValidator;
import org.assertj.core.api.SoftAssertions;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class UserValidatorTest {
    User[] tabOfUsers;
    UserValidator userValidator;

    @Before
    public void setUp(){
        userValidator = new UserValidator();
        tabOfUsers = new User[10];
        tabOfUsers[0] = new User("Aleksandrs", "Borzemskis", 45);
        tabOfUsers[1] = new User("Sergejs", "Golans", 101);
        tabOfUsers[2] = new User("Irina", "Golovina", 0);
        tabOfUsers[3] = new User("Janis", "Bērziņš", 120);
        tabOfUsers[4] = new User("Juris", "Ozols", 121);
        tabOfUsers[5] = new User("Jana", "Plauda", -5);
        tabOfUsers[6] = new User("Janis", "Bērziņš", 120);
        tabOfUsers[7] = new User("Janisjanisjabishjgjhgjh", "Bērziņš", 120);
        tabOfUsers[8] = new User("Janis", "BērziņšBērziņšBērziņšBērziņšBērziņš", 120);
        tabOfUsers[9] = new User("Janis Bērziņš", "Bērziņš", 120);
    }
    @After
    public void tearDown(){
        tabOfUsers = null;
    }

    @Test
    public void usersNameFrom3To15Characters(){
        SoftAssertions softly = new SoftAssertions();
        softly.assertThat(userValidator.hasInvalidLength("Grisha")).isFalse();
        softly.assertThat(userValidator.hasInvalidLength(tabOfUsers[0].getName())).isFalse();
        softly.assertThat(userValidator.hasInvalidLength("Df")).isTrue();
        softly.assertThat(userValidator.hasInvalidLength("F234567890123456")).isTrue();//16 characters
        softly.assertAll();
    }

    @Test
    public void usersNameFrom3To15CharactersArray(){
        SoftAssertions softly = new SoftAssertions();
        softly.assertThat(userValidator.hasInvalidLength(tabOfUsers[0].getName())).isFalse();
        softly.assertThat(userValidator.hasInvalidLength(tabOfUsers[1].getName())).isFalse();
        softly.assertThat(userValidator.hasInvalidLength(tabOfUsers[2].getName())).isFalse();
        softly.assertThat(userValidator.hasInvalidLength(tabOfUsers[3].getName())).isFalse();
        softly.assertThat(userValidator.hasInvalidLength(tabOfUsers[4].getName())).isFalse();
        softly.assertThat(userValidator.hasInvalidLength(tabOfUsers[5].getName())).isFalse();
        softly.assertThat(userValidator.hasInvalidLength(tabOfUsers[6].getName())).isFalse();
        softly.assertThat(userValidator.hasInvalidLength(tabOfUsers[7].getName())).isTrue();
        softly.assertThat(userValidator.hasInvalidLength(tabOfUsers[8].getName())).isFalse();
        softly.assertThat(userValidator.hasInvalidLength(tabOfUsers[9].getName())).isFalse();

        softly.assertAll();
    }

    @Test
    public void usersAgeFrom0T120(){
        SoftAssertions softly = new SoftAssertions();
        softly.assertThat(userValidator.ageCheck(5)).isFalse();
        softly.assertThat(userValidator.ageCheck(0)).isFalse();
        softly.assertThat(userValidator.ageCheck(120)).isFalse();
        softly.assertThat(userValidator.ageCheck(-1)).isTrue();
        softly.assertThat(userValidator.ageCheck(121)).isTrue();
        softly.assertAll();
    }


}


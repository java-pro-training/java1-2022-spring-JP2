package lv.lu.training.lesson11.homework.uzdevums2;

import lv.lu.training.lesson10.uzdevums1.ValidationException;
import lv.lu.training.lesson10.uzdevums2.UserValidator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class UserMainTest {

    private UserValidator userValidator;

    @BeforeEach
    public void setUp(){
        userValidator = new UserValidator();

    }

    @Test
    public void shouldNotThrowValidation() {
        Executable executable = new Executable() {
            @Override
            public void execute() throws Throwable {
                userValidator.validateAge(25);
            }
        };

        Assertions.assertDoesNotThrow(executable);
    }


    @Test
    public void shouldThrowValidationExceptionAgeTooOld(){
        Executable executable = new Executable() {
            @Override
            public void execute() throws Throwable {
                userValidator.validateAge(452);
            }
        };
        Assertions.assertThrows(ValidationException.class, executable);

    }

    @Test
    public void shouldThrowValidationExceptionAgeTooYoung(){
        Executable executable = new Executable() {
            @Override
            public void execute() throws Throwable {
                userValidator.validateAge(-1);
            }
        };
        Assertions.assertThrows(ValidationException.class, executable);
    }



    @Test
    public void shouldThrowValidationExceptionNameTooShort(){
        Executable executable = new Executable() {
            @Override
            public void execute() throws Throwable {
                userValidator.validateName("Kj");
            }
        };
        Assertions.assertThrows(ValidationException.class, executable);
    }

    @Test
    public void shouldThrowValidationExceptionNameTooLong(){
        Executable executable = new Executable() {
            @Override
            public void execute() throws Throwable {
                userValidator.validateName("Abcdefgh ijklmnopr");
            }
        };
        Assertions.assertThrows(ValidationException.class, executable);
    }


    @Test
    public void shouldThrowValidationExceptionNameIsNumber(){
        Executable executable = new Executable() {
            @Override
            public void execute() throws Throwable {
                userValidator.validateName("5555");
            }
        };
        Assertions.assertThrows(ValidationException.class, executable);
    }


    @Test
    public void shouldThrowValidationExceptionNameHasNumber(){
        Executable executable = new Executable() {
            @Override
            public void execute() throws Throwable {
                userValidator.validateName("Lelde5");
            }
        };
        Assertions.assertThrows(ValidationException.class, executable);
    }





}

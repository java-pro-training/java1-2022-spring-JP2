package lv.lu.training.lesson10;

public class UserValidator {

        private static final int MIN_TEXT_LENGTH = 3;
        private static final int MAX_TEXT_LENGTH = 15;
        private static final int MIN_AGE_LENGTH = 0;
        private static final int MAX_AGE_LENGTH = 120;

        public void validate(User user){
            validate(user.getFirstName());
            validate(user.getLastName());
            validate(user.getAge());
        }

    public void validate(String name){
            if(name.length() <3 || name.length()>15) {
                throw new ValidationException("Name and surname has to be 3 to 15 characters long");
            }
    }
    private void validate(int age) {
            if(age<0 ||age>120){
                throw new ValidationException("Age must be within human possibility : 0 - 120");
            }
    }

}

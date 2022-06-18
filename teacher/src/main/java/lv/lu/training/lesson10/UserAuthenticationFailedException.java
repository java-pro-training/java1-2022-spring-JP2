package lv.lu.training.lesson10;

public class UserAuthenticationFailedException extends RuntimeException {

    UserAuthenticationFailedException() {
        super("Nekorekta parole ievadīta 3 reizes. Lietotājs ir bloķēts.");
    }


}

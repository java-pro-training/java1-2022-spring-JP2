package lv.lu.training.lesson12;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    public void shouldReturnAddress() {
        Person person = new Person("Jānis Bērziņs", 30, "Latvia", "Riga", "Terbatas", "88", "64");
        Assertions.assertEquals("Latvia, Riga, Terbatas, 88 64", person.getFullAddress());
    }


}
package lv.lu.training.lesson7;

//Izveidojam jaunu klasi ar nosaukumu ArrayUtils

public class ArrayUtils {

    //pievienojam statisku metodi reverse(int arr)
    public static int[] reverse(int[] array) {
        int[] result = new int[array.length];


        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
        // šeit i ir vienāds ar masīva lielāko pēdējā elementa indeksu (i = array.length - 1)
        // Iterējam līdz nonākam līdz masīva sākumam (i >= 0)
        // Pie katras iterācijas skaitītāju samazinām par vienu (i--)
        // Lai saglabātu vērtības citā masīvā mums ir nepieciešams jauns indeks skaitītājs “j”
        // Nodefinēsim to skaitīsim uz priekšu ar katru cikla interāciju
        result[j] = array[i];
        }

        return result;

    }
}

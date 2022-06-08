package lv.lu.training.lesson7;

public class Palindroms {

    public static boolean isPalindrom(String text){
       var burtuVirkne = text.toLowerCase().toCharArray();  //pārveido burtu virkni uz mazajiem burtiem un ieliek Arrayā
        for (int i=0, j =  burtuVirkne.length - 1; i< burtuVirkne.length ;i++, j--){
            if (burtuVirkne[i] != burtuVirkne[j]){
                return  false;
            }
        }
        return true;
    }
 public static void main (String[] args){
     System.out.println(isPalindrom("raCecar"));
     System.out.println(isPalindrom("Mamma"));
     System.out.println(isPalindrom("soS"));
 }
}

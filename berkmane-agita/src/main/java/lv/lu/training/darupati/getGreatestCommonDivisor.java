package lv.lu.training.darupati;

public class getGreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println("LIELĀKAIS KOPĪGAIS DALĪTĀJS");
        System.out.println(getGreatestCommonDivisor(2, 333));
        System.out.println(getGreatestCommonDivisor(12, 31));
        System.out.println(getGreatestCommonDivisor(12, 120));
    }

    public static  int getGreatestCommonDivisor(int first, int second) {
        if ((first < 10) || (second < 10)) { return -1;}
        int LKD = 1;
        int dalitajs;
        for (int i = 2; i <= first; i++) {
            int dalijumaAtlikums = first % i;
            if (dalijumaAtlikums == 0) {
               dalitajs = i;
                if ((second % i == 0) && (dalitajs >= LKD)) {
                    LKD = dalitajs;
                }
            }
        }
        return LKD;
    }
}

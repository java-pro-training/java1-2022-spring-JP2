package lv.lu.training.lesson11;


public class Perimetrs {

    public int TrijsturaPerimetrs(int mala1, int mala2, int mala3) {
        return (mala1 + mala2 + mala3);
    }

    public boolean Nevienadiba (int mala1, int mala2, int mala3) {
        if (((mala1 + mala2) > mala3) && ((mala2 + mala3) > mala1) && ((mala1 + mala3) > mala2)) {
            return true;
        } else {
            return false;
        }
    }
}



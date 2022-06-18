package lv.lu.training.lesson9.homework.lesson;

import java.util.Comparator;
import java.util.Map;

public class EntryComparator implements Comparator<Map.Entry<String, Integer>> {

    @Override
    public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
        return o2.getValue().compareTo(o1.getValue());
    }

}

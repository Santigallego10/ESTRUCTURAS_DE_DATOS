package co.edu.cue.ed.collections.map;


import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class StringComparator implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        return s1.length() == s2.length() ? s1.compareTo(s2) : s1.length() - s2.length();
    }

    public static void main(String[] args) {
        Map<String, String> map = new TreeMap<>(new StringComparator());
        map.put("IBARAKI", "MitoCity");
        map.put("TOCHIGI", "UtunomiyaCity");
        map.put("GUNMA", "MaehashiCity");
        map.put("SAITAMA", "SaitamaCity");
        map.put("CHIBA", "ChibaCity");
        map.put("TOKYO", "Sinjyuku");
        map.put("KANAGAWA", "YokohamaCity");

        System.out.println(map);
    }

}

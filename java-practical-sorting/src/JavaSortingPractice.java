import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class JavaSortingPractice {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(4);

        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                Integer result = 0;
                if (o1 > o2) {
                    result = 1;
                } else if ( o2 > o1) {
                    result = -1;
                }
                return result;
            }
        });

        System.out.println(list);
    }
}

package co.edu.cue.algortimosModuloSubasta;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class RelativelyPrimePredicate implements UnaryPredicate<Integer> {

    public RelativelyPrimePredicate(Collection<Integer> c) {
        this.c = c;
    }

    public boolean test(Integer x) {
        for (Integer i : c)
            if (Algorithm.gcd(x, i) != 1)
                return false;

        return c.size() > 0;
    }

    private Collection<Integer> c;
}

public class Test {
    public static void main(String[] args) throws Exception {

        List<Integer> li = Arrays.asList(3, 4, 6, 8, 11, 15, 28, 32);
        Collection<Integer> c = Arrays.asList(7, 18, 19, 25);
        UnaryPredicate<Integer> p = new RelativelyPrimePredicate(c);

        int i = Algorithm.findFirst(li, 0, li.size(), p);

        if (i != -1) {
            System.out.print(li.get(i) + " is relatively prime to ");
            for (Integer k : c)
                System.out.print(k + " ");
            System.out.println();
        }
    }
}






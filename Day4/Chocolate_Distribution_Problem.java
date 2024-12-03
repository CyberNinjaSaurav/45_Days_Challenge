package Day4;

import java.util.ArrayList;
import java.util.Collections;

public class Chocolate_Distribution_Problem {
      public int findMinDiff(ArrayList<Integer> a, int m) {
        
        int n = a.size();
        Collections.sort(a);

        int start = 0, end = 0;

        int mind = Integer.MAX_VALUE;

       
        for (int i = 0; i + m - 1 < n; i++) {
            int diff = a.get(i + m - 1) - a.get(i);
            if (mind > diff) {
                mind = diff;
                start = i;
                end = i + m - 1;
            }
        }
        return a.get(end) - a.get(start);
    }
}

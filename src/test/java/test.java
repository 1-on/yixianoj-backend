import io.swagger.models.auth.In;
import org.junit.jupiter.api.Test;

import java.util.*;

public class test {
    public int minimumSeconds(List<Integer> nums) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        int n = nums.size();
        for (int i = 0; i < n; i++) {
            map.computeIfAbsent(nums.get(i), key -> new ArrayList<>()).add(i);
        }
        int ans = n;
        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            int key = entry.getKey();
            List<Integer> value = entry.getValue();
            value.add(value.get(0) + n);
            int max = 0;
            for (int i = 1; i < value.size(); i++) {
                max = Math.max(max, value.get(i) - value.get(i - 1));
            }
            ans = Math.min(max, ans);
//            System.out.println("key: " + key + ", value: " + value);

        }
//        System.out.println(ans);


        return ans / 2;
    }

    @Test
    public void test() {
        List<Integer> nums = Arrays.asList(1, 2, 1, 2);
        minimumSeconds(nums);
    }
}

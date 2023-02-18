package Stack;

import java.util.Stack;

public class Daily_Temperatures {

    public int[] dailyTemperatures(int[] temperatures) {
        int[] days = new int[temperatures.length];
        Stack<Integer> temp = new Stack<>();
        Stack<Integer> index = new Stack<>();

        for (int i = 0; i < temperatures.length; i++) {
            while (!temp.empty() && temperatures[i] > temperatures[index.peek()]) {
                temp.pop();
                int ind = index.pop();
                days[ind] = i - ind;
            }
            temp.push(temperatures[i]);
            index.push(i);
        }

        for (int i = 0; i < days.length; i++) {
            System.out.print(days[i] + " ");
        }
        System.out.println();

        return days;
    }
}

import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 3, 4 };
		System.out.println(calculateSpan(a, 4));

	}

	public static int[] calculateSpan(int price[], int n) {
		Stack<Integer> st = new Stack<>();

		int ans[] = new int[n];

		for (int i = 0; i < n; i++) {
			while (st.isEmpty() == false && price[st.peek()] <= price[i]) {
				st.pop();
			}
			if (st.isEmpty()) {
				ans[i] = i + 1;
			} else {
				ans[i] = i - st.peek();
			}

			st.push(i);
		}

		return ans;
	}

}

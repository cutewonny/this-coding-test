package greedy.programmers;

public class 숫자변환하기2 {
//	https://school.programmers.co.kr/learn/courses/30/lessons/154538

	public static int[] cache = new int[1000001];

	public static int solution(int x, int y, int n) {

//		int remainNum = y - x;
//		int portion = remainNum / n;
		if (x > y || n >= y || x < 1) {
			return -1;
		}
		if (x == y) {
			return 0;
		}

		int i = x;

		while (i <= y) {

			// 현재의 수가 2로 곱해지는 경우
			if (i * 2 <= y) {
				int temp = i * 2;
				if (cache[temp] == 0) {
					cache[temp] = cache[i] + 1;
				}
				cache[temp] = Math.min(cache[temp], cache[i] + 1);
			}
			// 현재의 수가 3으로 곱해지는 경우
			if (i * 3 <= y) {
				int temp = i * 3;
				if (cache[temp] == 0) {
					cache[temp] = cache[i] + 1;
				}
				cache[temp] = Math.min(cache[temp], cache[i] + 1);
			}
			// 현재의 수가 n로 더해지는 경우
			if (i + n <= y) {
				int temp = i + n;
				if (cache[temp] == 0) {
					cache[temp] = cache[i] + 1;
				}
				cache[temp] = Math.min(cache[temp], cache[i] + 1);
			}

			if (i * 2 < n) {
				i *= 2;
			} else {
				i += n;
			}

		}

		return (cache[y] == 0) ? -1 : cache[y];
	}


	public static void main(String[] args) {
		int x = 2;
		int y = 40;
		int n = 20;
		int result = solution(x, y, n);
		System.out.println(result);
	}

}

package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_10448 {


// 1번째 삼각수를 구현해라. 그리고 입력받은 숫자를 먼저 다 더해봐라.

    // 규칙이 있을 것이다.x
    // for문을 돌면서 방법이 있을 것이다.
    // 3으로 나눴을 떄 규칙이 있을 것이다 x
    // n^2 / 2  + n / 2
// 50 + 5 = 55
    // 11 = 10 + 1 or 6 + 3 + 1 + 1
    // 3개의 합으로 될 수 없음. 판단을 어떻게 했을까?
    // 5 = T1 + T1 + T2  1 2
    // 7 = T1 + T2 + T2  2 1
    // 8 = T1 + T1 + T3  2 2
    // 9 = T2 + T2 + T2  3 0
    // 10 = T1 + T2 + T3  3
    // 11 = X 뭔가 3으로 나눴은ㄹ 떄2

    //규칙 존재 x


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.int));

        int num = Integer.parseInt(br.readLine());
        int[] triNum = new int[45];
        for(int i = 0 ; i < 45; i++) {
            triNum[i] = i * (i * 1) / 2;
        }

        for(int i =0; i < num; i++) {
            int n = Integer.parseInt(br.readLine());
            int reuslt = ureaka(n, triNum);
            System.out.println(reuslt);
        }
    }

    public static int ureaka(int N, int[] triNum) {
        for(int j = 1; j < 45; j++) {
            for(int k = 1; k < 45; k++) {
                for(int z = 1; z < 45; z++) {
                    int sum = triNum[j] + triNum[k] + triNum[z];
                    if (sum == N) {
                        return 1;
                    }
                }
            }
        }
        return 0;
    }




}

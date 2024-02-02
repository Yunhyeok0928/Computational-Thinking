package baekjoon;
import java.io.*;

public class Polyomino {


    public static void main(String[] arg) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        // 입력받기
        String ss = br.readLine();
        String[] xs = ss.split("\\.");


        for(int i = 0; i < xs.length; i++) {

            String str = xs[i];

            // 그리디 알고리즘으로 인해 가장 큰 것 부터 삭제해야됨.
            if ( str.length() % 2 != 0 ) {
                sb.append("-1");
                break;
            }else if ( str.length() % 4 == 0 ) {
                sb.append("AAAA".repeat(str.length() / 4));
            }else {
                sb.append("AAAA".repeat(str.length() / 4));
                sb.append("BB");
            }

            // 여기서 점을 찍어줘야돼.
            if( i != xs.length-1) {
                sb.append(".");
            }
        }



        String answer = sb.toString();
            if (!answer.equals("-1")) {
               sb.append(".".repeat(ss.length()-sb.toString().length()));
            }
            System.out.println(sb);
        }
    }


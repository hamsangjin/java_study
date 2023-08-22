package java2.Java_Flow_Control;

public class LoopArray {
    public static void main(String[] args) {

        /* 이런 식의 html문 출력이 필요
         * <li>egoing</li>
         * <li>jinhuck</li>
         * <li>youbin</li>
         */

        // egoing, jinhuck, youbin
        int N = 3;
        String[] users = new String[N];
        users[0] = "egoing";
        users[1] = "jinhuck";
        users[2] = "youbin";


        // for문을 통해 위의 html문 출력
        // N을 이용하거나 users.length 이용
        for(int i = 0; i < N; i++){
            System.out.println("<li>" + users[i] + "</li>");
        }


    }
}

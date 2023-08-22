package java2.Java_Flow_Control;

// ID와 비밀번호를 저장해 비교하는 클래스
public class AuthApp4 {
    public static void main(String[] args) {
        String[][] users = {
                {"egoing", "1111"},
                {"jinhuck", "2222"},
                {"youbin", "3333"}
        };

        String inputId = args[0];
        String inputPass = args[1];

        boolean isLogined = false;

        // users 배열의 길이만큼 반복
        for(int i = 0; i < users.length; i++){
            // 현재 인덱스의 user 저장
            String[] current = users[i];
            // 입력한 ID와 Password가 현재 인덱스의 user 정보와 동일하냐?
            if (current[0].equals(inputId) && current[1].equals(inputPass)){
                // 그렇다면 로그인 상태로 변경하고 for문을 벗어나라
                isLogined = true;
                break;
            }
        }

        // 기본 출력
        System.out.print("Hey, ");

        // 로그인된 상태냐 ?
        if (isLogined){
            // 그렇다면 "Master !!" 출력
            System.out.print("Master !!");
            // 로그인되지 않은 상태냐 ?
        } else{
            // 그렇다면 "Who are you ?" 출력
            System.out.print("Who are you ?");
        }
    }
}

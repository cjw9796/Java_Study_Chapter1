package Practice;
import java.util.Scanner;

public class Practice6 {  //조건문과 반복문 종합문제 (실습문제 6번)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String playerName;
        String playerChoice;
        String computerChoice;
        int totalGames = 0;
        int winCount = 0;
        int drawCount = 0;
        int loseCount = 0;

        System.out.print("당신의 이름을 입력해주세요: ");
        playerName = scanner.nextLine();

        while (true) {
            System.out.print("가위바위보: ");
            playerChoice = scanner.nextLine();
            if (playerChoice.equalsIgnoreCase("exit")) {
                break;
            }

            int computerRandom = (int) (Math.random() * 3);
            switch (computerRandom) {
                case 0:
                    computerChoice = "가위";
                    break;
                case 1:
                    computerChoice = "바위";
                    break;
                default:
                    computerChoice = "보";
                    break;
            }

            System.out.println("컴퓨터: " + computerChoice);
            System.out.println(playerName + ": " + playerChoice);

            // 가위바위보 승부 결정
            if (playerChoice.equals(computerChoice)) {
                System.out.println("비겼습니다.");
                drawCount++;
            } else if ((playerChoice.equals("가위") && computerChoice.equals("보"))
                    || (playerChoice.equals("바위") && computerChoice.equals("가위"))
                    || (playerChoice.equals("보") && computerChoice.equals("바위"))) {
                System.out.println("이겼습니다!");
                winCount++;
            } else {
                System.out.println("졌습니다ㅠㅠ");
                loseCount++;
            }

            totalGames++;
        }

        // 결과 출력
       
        System.out.print(totalGames + "전");
        System.out.print(winCount + "승");
        System.out.print(drawCount + "무");
        System.out.print(loseCount + "패");
    }
}
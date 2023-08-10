package Practice;
import java.util.Scanner;

public class Practice9 {
    public static void main(String[] args) {
        String[] chickenMenu = {"양념치킨", "후라이드치킨", "간장치킨", "마늘치킨", "파닭치킨"};

        Scanner scanner = new Scanner(System.in);

        System.out.print("치킨 이름을 입력하세요: ");
        String input = scanner.nextLine();

        boolean found = false;

        // 배열에서 입력받은 값이 있는지 검색
        for (String menu : chickenMenu) {
            if (menu.equals(input)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(input + " 배달 가능");
        } else {
            System.out.println(input + "은(는) 없는 메뉴입니다.");
        }

        scanner.close();
    }
}

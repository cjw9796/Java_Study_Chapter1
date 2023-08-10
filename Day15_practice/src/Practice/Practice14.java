package Practice;

import java.util.Arrays;
import java.util.Random;

public class Practice14 {

	public static void main(String[] args) {
		// 로또 번호 개수
        int lottoNumberCount = 6;

        // 로또 번호를 저장할 배열 선언 및 할당
        int[] lottoNumbers = new int[lottoNumberCount];

        Random random = new Random();

        // 중복된 값이 없는 로또 번호 생성
        for (int i = 0; i < lottoNumbers.length; i++) {
            int randomNumber;
            boolean isDuplicate;
            do {
                isDuplicate = false;
                randomNumber = random.nextInt(45) + 1;
                for (int j = 0; j < i; j++) {
                    if (lottoNumbers[j] == randomNumber) {
                        isDuplicate = true;
                        break;
                    }
                }
            } while (isDuplicate);
            lottoNumbers[i] = randomNumber;
        }

        // 로또 번호 오름차순 정렬
        Arrays.sort(lottoNumbers);

        // 로또 번호 출력
        System.out.print("로또 번호 : ");
        for (int i = 0; i < lottoNumbers.length; i++) {
            System.out.print(lottoNumbers[i] + " ");
        }

	}

}

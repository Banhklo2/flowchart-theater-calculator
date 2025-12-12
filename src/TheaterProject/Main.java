package TheaterProject;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int totalPrice = 0;
        int totalPoint = 0;

        while (true) {

            System.out.println("결제 금액을 입력하세요!");
            int price = sc.nextInt();

            if (price == -1) {
                System.out.println("입력을 종료합니다!");
                System.out.println("totalPrice = " + totalPrice);
                System.out.println("totalPoint = " + totalPoint);
                break;
            }

            if (price <= 0) {
                System.out.println("잘못된 입력입니다!");
                continue;
            }

            int point = price * 7/100;
            totalPrice += price;
            totalPoint += price * 7/100;

            System.out.println("이번 결제 금액: " + price);
            System.out.println("이번 적립 포인트: " + point);
            System.out.println("총 결제 금액: " + totalPrice);
            System.out.println("총 적립 포인트: " + totalPoint);
        }
    }
}

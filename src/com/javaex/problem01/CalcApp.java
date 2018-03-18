package com.javaex.problem01;

import java.util.Scanner;

public class CalcApp {

    public static void main(String[] args) {
        Add add = new Add();
        Div div = new Div();
        Sub sub = new Sub();
        Mul mul = new Mul();

        boolean run = true;
        int result;
        Scanner scanner = new Scanner(System.in);

        while (run) {

            System.out.print(">> ");
            String num = scanner.nextLine();
            if (num.equals("/q")) {
                System.out.println("종료합니다.");
                run = false;
            } else {
                String[] numArray = num.split(" ");
                int num00 = Integer.parseInt(numArray[0]);
                int num02 = Integer.parseInt(numArray[2]);


                if (numArray[1].equals("+")) {
                    result = add.calculate(num00, num02);
                    System.out.println(result);
                } else if (numArray[1].equals("/")) {
                    result = div.calculate(num00, num02);
                    System.out.println(result);

                } else if (numArray[1].equals("*")) {
                    result = mul.calculate(num00, num02);
                    System.out.println(result);

                } else if (numArray[1].equals("-")) {
                    result = sub.calculate(num00, num02);
                    System.out.println(result);
                } else {
                    System.out.println("알 수 없는 연산자 입니다.");
                }

            }

            //nextLine으로 입력 받고  공백으로 숫자 연산자 숫자 분리후 배열저장하고 두번째 배열에 연산자를 if문 돌려서 메소드 호출
        }
        scanner.close();
    }
}

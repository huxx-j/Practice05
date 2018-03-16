package com.javaex.problem01;

import java.util.Scanner;

public class CalcApp {

    public static void main(String[] args) {
        Add add = new Add();
        Div div = new Div();
        Sub sub = new Sub();
        Mul mul = new Mul();

        Scanner scanner = new Scanner(System.in);
        System.out.print(">> ");
        String num = scanner.nextLine();

        //nextLine으로 입력 받고  공백으로 숫자 연산자 숫자 분리후 배열저장하고 두번째 배열에 연산자를 if문 돌려서 메소드 호출
    }
}

package com.javaex.problem03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoodsApp {

    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        List<Goods> goodsArrayList = new ArrayList<>();

        System.out.println("상품 3개를 입력하세요");

        for (int i = 0; i < 3; i++) {
            String goodsInfo = scanner.nextLine();
            String[] goodsInfoList = goodsInfo.split(" ");
            int price = Integer.parseInt(goodsInfoList[1]);
            int count = Integer.parseInt(goodsInfoList[2]);
            Goods goods = new Goods(goodsInfoList[0],price,count);
            goodsArrayList.add(goods);
            sum += count;
        }
        for (Goods gAR : goodsArrayList) {
            gAR.showInfo();
        }
        System.out.println("모든 상품의 갯수는 " + sum + "개 입니다.");
        scanner.close();
    }
}

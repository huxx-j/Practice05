package com.javaex.problem02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Friend> friendArrayList = new ArrayList<>();

        System.out.println("친구 3명을 등록해 주세요");

        for (int i = 0; i < 3; i++) {
            String friendInfo = scanner.nextLine();
            String[] friendInfoList = friendInfo.split(" ");
            Friend friend = new Friend(friendInfoList[0], friendInfoList[1], friendInfoList[2]);
            friendArrayList.add(friend);
        }
        for (Friend fAR : friendArrayList) {
            fAR.showInfo();
        }
        scanner.close();
    }
}

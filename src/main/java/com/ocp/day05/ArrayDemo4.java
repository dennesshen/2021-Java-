package com.ocp.day05;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class ArrayDemo4 {

    public static void main(String[] args) {
        int[] scores1 = {80, 40, 70, 60, 86, 30};

        int Max = 0;
        int min = 0;
        //找出最高分及最低分
        //java7算法              
        for (int x : scores1) {
            if (Max < x) {
                Max = x;
            }

            if (min == 0) {
                min = Max;
            } else {
                if (min > x) {
                    min = x;
                }
            }

        }

        System.out.printf("最高分為%d，最低分為%d\n", Max, min);

        //java8算法
        int Max2 = IntStream.of(scores1).max().getAsInt();
        int min2 = IntStream.of(scores1).min().getAsInt();
        System.out.printf("最高分為%d，最低分為%d\n", Max2, min2);

        //java8 統計用法
        IntSummaryStatistics stat = IntStream.of(scores1).summaryStatistics();

        System.out.print(stat);

    }

}

package leetcode.intersection;

import java.util.Arrays;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/4/12 19:46
 */
public class Solution {
    public double[] intersection(int[] start1, int[] end1, int[] start2, int[] end2) {
        //计算斜率K和B

        Point pointStart1 = new Point(start1);
        Point pointEnd1 = new Point(end1);
        Point pointStart2 = new Point(start2);
        Point pointEnd2 = new Point(end2);
        Line line1 = new Line(pointStart1, pointEnd1);
        Line line2 = new Line(pointStart2, pointEnd2);
        if(line1.k==Integer.MAX_VALUE || line2.k==Integer.MAX_VALUE){
            //都在y轴
            if(line1.k==Integer.MAX_VALUE && line2.k==Integer.MAX_VALUE){
                if(isBetween(pointStart2, pointStart1, pointEnd2) ){
                        return new double[]{0, pointStart1.y};
                }
                if(isBetween(pointStart1, pointStart2, pointEnd1) ){
                        return new double[]{0, pointStart2.y};
                }
            }

        }
        Point intersection=new Point(0, 0);
        double epslion=1e-6f;
        if (line1.k == Integer.MAX_VALUE) {
            intersection = new Point(line1.b, line1.b * line2.k + line2.b);
        } else if(line2.k == Integer.MAX_VALUE){
            intersection = new Point(line2.b, line2.b * line1.k + line1.b);
        }else if (Math.abs(line1.k - line2.k) <= epslion) {
            // 情况 2：（特殊情况）斜率相等的情况下，如果在 y 轴上的截距相等，就表示两条直线重合
            if (Math.abs(line1.b - line2.b) <= epslion && isBetween(pointStart1, pointStart2, pointEnd1)) {
                return new double[]{pointStart2.x, pointStart2.y};
            }
            return new double[0];
        }else {
            //交点
            double x = (line2.b - line1.b) / (line1.k - line2.k);
            double y = x * line1.k + line1.b;
            intersection = new Point(x, y);
        }
        if (isBetween(pointStart1, intersection, pointEnd1) && isBetween(pointStart2, intersection, pointEnd2)) {
            return new double[]{intersection.x, intersection.y};
        }
        return new double[0];
    }

    private boolean isBetween(double start, double middle, double end) {
        if (start > end) {
            // 逆序
            return end <= middle && middle <= start;
        } else {
            // 顺序
            return start <= middle && middle <= end;
        }

    }

    private boolean isBetween(Point start1, Point intersection, Point end1) {
        return isBetween(start1.x, intersection.x, end1.x) && isBetween(start1.y, intersection.y, end1.y);
    }

    private class Line {
        /**
         * 斜率
         */
        private double k;

        /**
         * 在 y 轴上的截距
         */
        private double b;

        public Line(Point start, Point end) {
            double y = end.y - start.y;
            double x = end.x - start.x;
            // 注意：当 deltaX = 0 的时候，设置斜率为正无穷
            if ( x== 0) {
                k = Integer.MAX_VALUE;
                // 此时截距为直线在 x 轴上的截距，这里是特殊的做法
                b = end.x;
            } else {
                k = y /x ;
                b = end.y - k * end.x;
            }
        }
    }


    private class Point {
        private double x;
        private double y;

        public Point(int[] start) {
            this.x = start[0];
            this.y = start[1];
        }

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }
    }



}



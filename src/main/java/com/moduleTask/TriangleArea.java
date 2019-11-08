package com.moduleTask;

public class TriangleArea {

        public static double TriangleArea(int[][] points) {

            double triangleArea = 0;
            for (int i = 0; i < points.length; ++i)
                for (int j = i + 1; j < points.length; ++j)
                    for (int k = j + 1; k < points.length; ++k)
                        triangleArea = Math.max(triangleArea, area(points[i], points[j], points[k]));
            return triangleArea;
        }

        public static double area(int[] pointA, int[] pointB, int[] pointC) {
            return 0.5 * Math.abs(pointA[0] * pointB[1] + pointB[0] * pointC[1] + pointC[0] * pointA[1]
                    - pointA[1] * pointB[0] - pointB[1] * pointC[0] - pointC[1] * pointA[0]);
        }

    public static void main(String[] args) {
        int[][] arrayTest = new int[][]{{1, 1}, {1, 4}, {4, 3}};
        System.out.println(TriangleArea(arrayTest));
    }
}



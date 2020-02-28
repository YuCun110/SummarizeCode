package com.caihua.arithmetic;

/**
 * @author XiLinShiShan
 * @version 0.0.1
 * 二分查找算法：要求检索的数组本身有序（正序）；
 */
public class BinarySearch {
    public static void main(String[] args) {
        //1.定义数组
        int[] arr = {1,2,3,5,7,8,9,12};

        //2.查找元素
        System.out.println(binarySearch(arr,11));
    }

    public static int binarySearch(int[] arr, int searchElem) {
        //1.获取数组的长度
        int length = arr.length;

        //2.计算特殊位置元素的下标
        int leftIndex = 0;
        int rightIndex = length - 1;
        int medIndex = (leftIndex + rightIndex) / 2;

        //3.查找元素的下标
        while (leftIndex <= rightIndex) {
            if (arr[medIndex] < searchElem) {
                //待查找的元素在数组右侧，改变左边界
                leftIndex = medIndex + 1;
            } else if (arr[medIndex] > searchElem) {
                //待查找的元素在数组左侧，改变有边界
                rightIndex = medIndex - 1;
            } else {
                //找到待查找元素的下标，返回下标并退出循环
                return medIndex;
            }
            //暂时没有找到元素，更新中间元素的下标
            medIndex = (leftIndex + rightIndex) / 2;
        }

        //4.没有找到该元素，返回-1
        return -1;
    }
}

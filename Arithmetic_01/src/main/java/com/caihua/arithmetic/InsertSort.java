package com.caihua.arithmetic;

import java.util.Arrays;

/**
 * @author XiLinShiShan
 * @version 0.0.1
 * 插入排序算法：
 * 基本思想是：
 * ① 把n个待排序的元素看成为一个有序表和一个无序表，开始时有序表中只包含一个元素，无序表中包含有n-1个元素；
 * ② 排序过程中每次从无序表中取出第一个元素，把它的排序码依次与有序表元素的排序码进行比较，将它插入到有序表中的适当位置，使之成为新的有序表。
 */
public class InsertSort {
    public static void main(String[] args) {
        //1.定义数组
        int[] arr = {1, 4, 3, 2, 5, 7, 6, 8, 9, 5, 4, 8};
        System.out.println("原始数组为：" + Arrays.toString(arr));
        //2.排序
        int[] newArr = insertSort(arr);
        System.out.println("排序后结果为：" + Arrays.toString(newArr));
    }

    public static int[] insertSort(int[] arr) {
        //1.获取数组的长度
        int length = arr.length;
        //2.遍历数组
        for (int i = 1; i < length; i++) {
            //① 将当前元素设置为待插入的元素
            int insertValue = arr[i];
            //② 将前一个元素的下标设置为要插入的位置
            int insertIndex = i - 1;
            //④ 判断当前元素是否大于前一个元素
            //如果当前元素小于前一个元素，并且待插入的下标大于等于0
            while (insertValue < arr[insertIndex] && insertIndex >= 0) {
                //将插入的位置更新为前一个元素的前一个，并且将前一个元素后移
                arr[insertIndex + 1] = arr[insertIndex];
                insertIndex--;
            }
            //找到了插入的位置，将当前元素插入该位置
            arr[insertIndex + 1] = insertValue;

        }

        //3.返回排序后的数组
        return arr;
    }
}

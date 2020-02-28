package com.caihua.arithmetic;

import java.util.Arrays;

/**
 * @author XiLinShiShan
 * @version 0.0.1
 * 3.选择排序
 * 第一次从R[0]~R[n-1]中选取最小值，与R[0]交换，
 * 第二次从R[1]~R[n-1]中选取最小值，与R[1]交换，
 * 第三次从R[2]~R[n-1]中选取最小值，与R[2]交换，
 * …，
 * 第i次从R[i-1]~R[n-1]中选取最小值，与R[i-1]交换，
 * …,
 * 第n-1次从R[n-2]~R[n-1]中选取最小值，与R[n-2]交换，
 * 总共通过n-1次，得到一个按排序码从小到大排列的有序序列。
 */
public class SelectSort {
    public static void main(String[] args) {
        //1.定义数组
        int[] arr = {1, 4, 3, 2, 5, 7, 6, 8, 9, 5, 4, 8};
        System.out.println("原始数组为：" + Arrays.toString(arr));

        //2.排序
        int[] newArr = selectSort(arr);
        System.out.println("排序后结果为：" + Arrays.toString(newArr));
    }

    public static int[] selectSort(int[] arr) {
        //1.获取数组的长度
        int length = arr.length;

        //2.遍历数组，进行排序
        for (int i = 0; i < length - 1; i++) {
            //① 本轮初始最小元素的下标
            int minIndex = i;
            //② 本轮初始最小元素
            int minElem = arr[i];
            //③ 循环查找最小值
            for (int j = i + 1; j < length; j++) {
                if (minElem > arr[j]) {
                    //如果当前元素比预设最小值小，则更新最小值
                    minElem = arr[j];
                    minIndex = j;
                }
            }
            //④ 判断本轮的预设最小值是否变化
            if (i != minIndex) {
                //交换位置
                arr[minIndex] = arr[i];
                arr[i] = minElem;
            }
        }

        //3.返回排序后的数组
        return arr;
    }
}

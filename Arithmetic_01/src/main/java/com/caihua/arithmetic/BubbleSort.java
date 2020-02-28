package com.caihua.arithmetic;

import java.util.Arrays;

/**
 * @author XiLinShiShan
 * @version 0.0.1
 * 1.冒泡排序算法：
 * 通过对待
 * 排序序列从后向前（从下标较大的元素开始）,依次比较
 * 相邻元素的排序码，若发现逆序则交换，使排序码较小
 * 的元素逐渐从后部移向前部（从下标较大的单元移向下
 * 标较小的单元），就象水底下的气泡一样逐渐向上冒。
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,3,5,2,4};
        System.out.println("排序前，数组为：" + Arrays.toString(arr));
        int[] newArr = bubbleSort(arr);
        System.out.println("排序后，结果为：" + Arrays.toString(newArr));

    }

    public static int[] bubbleSort(int[] arr) {
        System.out.println("冒泡排序开始执行！");
        //1.获取数组的长度
        int length = arr.length;

        //2.循环遍历数组，进行排序(顺序：从小到大)
        for (int i = 0; i < length - 1; i++)
            for (int j = 0; j < length - 1 - i; j++) {
                //如果前一个元素的值大于当前元素的值，则进行交换
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }

        //3.返回排序后的结果
        return arr;
    }
}

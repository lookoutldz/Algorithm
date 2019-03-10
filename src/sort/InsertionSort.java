package sort;

import java.util.List;

public class InsertionSort {

    //直接插入排序
    public static List<Integer> sort(List<Integer> list){

        for (int i = 1; i < list.size(); i++){
            int j = i - 1;
            int key = list.get(i);
            while (j >= 0 && key < list.get(j)) {
                list.set(j+1,list.get(j));
                j--;
            }
            list.set(j+1,key);
        }
        return list;
    }

    public static int[] sort(int[] arr) {
        int length = arr.length;
        for (int i = 1; i < length; i++) {
            int j = i - 1;
            int key = arr[i];
            while (j >= 0 && arr[j] > key) { // 前一个大于后一个，前一个（大的）往后移动一位
                arr[j + 1] = arr[j];
                j--; // 指针向前移一位
            }
            arr[j + 1] = key;
        }
        return arr;
    }
}

package sort;

import java.util.List;

public class InsertionSort {

    //直接插入排序
    public static List<Integer> sort(List<Integer> list){

        for (int i = 1; i < list.size(); i++){
            int j = i - 1;
            int key = list.get(i);
            while (j >= 0 && key < list.get(j)){
                list.set(j+1,list.get(j));
                j--;
            }
            list.set(j+1,key);
        }
        return list;
    }
}

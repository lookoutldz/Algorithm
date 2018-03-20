import sort.InsertionSort;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Launcher {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("输入要排序的数字个数：");
        int num = sc.nextInt();
        if (num > 0){
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < num; i++){
                System.out.print("请输入第"+(i+1)+"个数的值：");
                list.add(sc.nextInt());
            }

            System.out.println("输入的数组为：");
            show(list);

            list = InsertionSort.sort(list);

            System.out.println("\n排序后的数组为：");
            show(list);
        }
    }

    public static void show(List<Integer> list){

        for (int i = 0; i < list.size(); i++){
            System.out.print(list.get(i)+"\t");
        }
    }
}

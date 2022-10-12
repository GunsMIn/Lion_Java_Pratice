package com.company.Programmers.sort.online;


import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

class MyData implements Comparable<MyData>{
    int v;

    public MyData(int v) {
        this.v = v;
    }

    @Override
    public String toString() {
        return "MyData{" +
                "v=" + v +
                '}';
    }

    @Override
    public int compareTo(MyData o) {
       // return v-o.v;
        return Integer.compare(v, o.v);
    }
}

public class Main2 {

    public static void main(String[] args) {
            //직접만든 comparator
           List<MyData> list = new LinkedList<>();

           Random r = new Random();
           for (int i = 0; i < 20; i++){
               list.add(new MyData(r.nextInt(50)));
           }

           //클래스에 comparable인터페이스를 지정안했을때 직접 하는 정렬
           list.sort(new Comparator<MyData>() {
               @Override//오름차순정렬
               public int compare(MyData o1, MyData o2) {
                   return o1.v-o2.v;
               }
           });
            System.out.println(list);

           list.sort(Comparator.reverseOrder()); //참조형 클래스에 comparable을 지정받아서 메소드를 재정의
                                            // 해주었더니 인터페이스도 사용이사능하다

            System.out.println(list);






       }


}


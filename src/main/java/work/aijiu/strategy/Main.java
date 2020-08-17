package work.aijiu.strategy;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Comparable[] a ={9,2,3,5,7,1,4};

        Dog[] d = {new Dog(3),new Dog(5),new Dog(1)};
        Sorter<Dog> dogSorter = new Sorter<>();
        DogComparator dogComparator = new DogComparator();
        dogSorter.sort(d,dogComparator);
        System.out.println(Arrays.toString(d));

        /**
         * 定义一个旅游方法的函数时接口
         * 定义一个乘火车旅游类实现函数式接口
         * 定义一个乘飞机旅游类实现函数式接口
         * main 方法就可以调用了
         */
        TrainStratrgy trainStratrgy = new TrainStratrgy();
        trainStratrgy.travelMethod();

    }
}

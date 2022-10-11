import java.util.*;

public class Traversal {
    public static void main(String[] args){
        Integer[] array = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        System.out.println("数组遍历：");
        for(int i = 0; i < array.length; i++){
            System.out.printf("%d\t", array[i]);
        }
        System.out.println();

        Iterator<Integer> it = Arrays.stream(array).iterator();
        while(it.hasNext()){
            System.out.printf("%d\t", it.next());
        }
        System.out.println();

        for(Integer i : array){
            System.out.printf("%d\t", i);
        }
        System.out.println();

        List<Integer> list = new LinkedList<Integer>(){{
            add(1);
            add(2);
            add(3);
            add(4);
            add(5);
            add(6);
            add(7);
            add(8);
            add(9);
            add(0);
        }};
        System.out.println("List遍历：");
        for(int i = 0; i < list.size(); i++){
            System.out.printf("%d\t", list.get(i));
        }
        System.out.println();

        it = list.iterator();
        while(it.hasNext()){
            System.out.printf("%d\t", it.next());
        }
        System.out.println();

        for(Integer i : list){
            System.out.printf("%d\t", i);
        }
        System.out.println();

        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < 10; i++){
            map.put(i, i+1);
        }
        System.out.println("map遍历：");
        for(int i = 0;i < map.size(); i++){
            System.out.printf("%d\t", map.get(i));
        }
        System.out.println();

        it = map.keySet().iterator();
        while(it.hasNext()){
            System.out.printf("%d\t", map.get(it.next()));
        }
        System.out.println();

        for(Integer i : map.keySet()){
            System.out.printf("%d\t", map.get(i));
        }
        System.out.println();
    }

}
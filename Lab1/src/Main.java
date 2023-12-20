import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        int N = 100000;
        int insertN = 1000;

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        Fill(arrayList, N, "ArrayList");
        Fill(arrayList, N, "LinkedList");
        randomAc(arrayList, N, "ArrayList");
        randomAc(arrayList, N, "LinkedList");
        sequentialAc(arrayList, "ArrayList");
        sequentialAc(arrayList, "LinkedList");
        insAtStart(arrayList,insertN, "ArrayList");
        insAtStart(linkedList,insertN, "LinkedList");
        insAtEnd(arrayList,insertN, "ArrayList");
        insAtEnd(linkedList,insertN, "LinkedList");
        insInMiddle(arrayList,insertN, "ArrayList");
        insInMiddle(linkedList,insertN, "LinkedList");
    }
    private static void Fill(List<Integer> list, int count, String listType){
        long time = System.currentTimeMillis();
        Random random = new Random();
        for(int i = 0; i < count; i++){
            list.add(random.nextInt(count));
        }
        System.out.printf("Fill %s: %s\n", listType, System.currentTimeMillis() - time);
    }

    private static void randomAc(List<Integer> list, int count, String listType){
        long time = System.currentTimeMillis();
        Random random = new Random();

        for(int i = 0; i < count; i++){
            int index = random.nextInt(count);
            int element = list.get(index);
        }
        System.out.printf("Random access in %s: %s\n", listType, System.currentTimeMillis() - time);
    }

    private static void sequentialAc(List<Integer> list, String listType) {
        long time = System.currentTimeMillis();
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer element = iterator.next();
        }
        System.out.printf("Sequential access in %s: %s\n", listType, System.currentTimeMillis() - time);
    }

    private static void insAtStart(List<Integer> list, int count, String listType){
        long time = System.currentTimeMillis();
        Random random = new Random();
        for (int i = 0; i < count; i++){
            list.add(0, random.nextInt(count*100));
        }
        System.out.printf("Insert at start %s: %s\n", listType, System.currentTimeMillis() - time);
    }

    private static void insAtEnd(List<Integer> list, int count, String listType){
        long time = System.currentTimeMillis();
        Random random = new Random();
        for (int i = 0; i < count; i++){
            list.add(random.nextInt(count*100));
        }
        System.out.printf("Insert at end %s: %s\n", listType, System.currentTimeMillis() - time);
    }

    private static void insInMiddle(List<Integer> list, int count, String listType){
        long time = System.currentTimeMillis();
        Random random = new Random();
        int indexMid = list.size() / 2;
        for (int i = 0; i < count; i++){
            list.add(indexMid, random.nextInt(count*100));
        }
        System.out.printf("Insert in middle %s: %s\n", listType, System.currentTimeMillis() - time);
    }

}

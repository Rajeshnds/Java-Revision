import java.util.ArrayList;
// import java.util.Comparator;

class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        // numbers.add(1);  // 0
        // numbers.add(2);  // 1
        // numbers.add(3);  // 2
        // numbers.add(4);  // 3
        // numbers.add(5);  // 4



        numbers.add(5);  // 4
        numbers.add(3);  // 2
        numbers.add(1);  // 0
        numbers.add(4);  // 3
        numbers.add(2);  // 1

        // numbers.sort(Comparator.naturalOrder());
        // numbers.sort(Comparator.reverseOrder());

        // numbers.remove(2); // delete by index
        // numbers.remove(Integer.valueOf(4)); // delete by index

        // System.out.println(numbers.get(2));

        // numbers.clear();

        // numbers.set(2, Integer.valueOf(30));

        // System.out.println(numbers.toString());
        // System.out.println(numbers.size());
        // System.out.println(numbers.contains(Integer.valueOf(10)));
        // numbers.clear();

        System.out.println("before: " + numbers.toString());


        numbers.forEach(number -> {
            numbers.set(numbers.indexOf(number), number * 2);
            // System.out.println(number * 2);
        });

        System.out.println("after: "+ numbers.toString());


        // System.out.println(numbers.isEmpty());

    }
}

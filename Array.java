import java.util.Arrays;

class Array {
    public static void main(String[] args){
        // char vowels[] = new char[5];
        // char vowels[] = {'e', 'u', 'a', 'o', 'i'};

        // vowels[2]='x';

        // a e i o u
        // vowels[0] = 'a';
        // vowels[1] = 'e';
        // vowels[2] = 'i';
        // vowels[3] = 'o';
        // vowels[4] = 'u';
        // vowels[5] = 'x';

        // System.out.println(vowels[2]); 
        // System.out.println(vowels.length);
        
        // Arrays.sort(vowels);

        // char key = 'b';

        // int foundItemIndex = Arrays.binarySearch(vowels, key);

        // int startingIndex = 1;
        // int endingIndex = 4;

        // int foundItemIndex = Arrays.binarySearch(vowels, startingIndex, endingIndex, key);


        // Arrays.sort(vowels, startingIndex, endingIndex);

        // Arrays.fill(vowels, startingIndex, endingIndex, 'x');

        // System.out.println(Arrays.toString(vowels)); 
        // System.out.println(foundItemIndex); 

        int numbers[] = {1, 2, 3, 4, 5};

        // int copyOfNumbers[] = numbers;
        // int copyOfNumbers[] = Arrays.copyOf(numbers, 2);

        // int startingIndex = 1;
        // int endingIndex = 10;

        // int copyOfNumbers[] = Arrays.copyOfRange(numbers, startingIndex, endingIndex);

        int copyOfNumbers[] = Arrays.copyOf(numbers, numbers.length);


        // Arrays.fill(numbers,0);

        // System.out.println(Arrays.toString(numbers));
        // System.out.println(Arrays.toString(copyOfNumbers));

        // System.out.println(numbers == copyOfNumbers);

        System.out.println(Arrays.equals(numbers, copyOfNumbers));

    }
}

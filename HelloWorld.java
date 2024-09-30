import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name? ");
        String name = scanner.nextLine();

        System.out.printf("Hello %s. How old are you? ", name);
        // int age = scanner.nextInt();

        int age = Integer.parseInt(scanner.nextLine());
        // double gpa = Double.parseDouble(scanner.nextLine());

        // 26 will be taken by age but <enter> key press will be left in input buffer. So, when nextline() method come it will not take new input istead it will take previous <enter> key press input from input buffer.
        // to avoid this we have to put extra nextline() after nextInt or nextFloat or nextDouble except nextLine();

        // scanner.nextLine();

        // another way to use nextInt is we can use just nextLine for all the input and we will convert it accordingly using parsing method.

        System.out.printf("%d is an excellent age to start programming. What language do you preger? ", age);

        String language = scanner.nextLine();

        System.out.printf("%s is a very popular programming language.", language);

        scanner.close();

    }
}
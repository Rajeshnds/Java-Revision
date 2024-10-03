import java.time.LocalDate;

class ObjectOriented {
    public static void main(String[] args) {
        // User youngerUser = new User();

        // youngerUser.name = "Rajesh Kumar";
        // youngerUser.birthDay = LocalDate.parse("2001-01-01");

        // System.out.printf("%s was born back in %s and he is now %d years old. \n", youngerUser.name, youngerUser.birthDay.toString(), youngerUser.age());


        // User user = new User();
        // User user = new User("Rajesh Kumar", "2001-01-01");

        // user.name = "Rajesh Kumar";
        // user.birthDay = LocalDate.parse("2001-01-01");


        // Book book  = new Book("Carmilla", "Sheridan Le Fanu", 270);

        Book carmilla  = new Book("Carmilla", "Sheridan Le Fanu", 270);

        AudioBook dracula = new AudioBook("Dracula", "Bram Stoker", 30000);

        Ebook jeeves = new Ebook("Carry On Jeeves", "P.G. Wodehouse", 280, "PDF");


        // System.out.println(dracula.toString());

        System.out.println(jeeves.toString());


        // book.title = "Carmilla";
        // book.author = "Sheridan Le Fanu";

        // user.borrow(book);
        // user.borrow(carmilla);

        // System.out.printf("%s was born back in %s and he is now %d years old. \n", user.name, user.birthDay.toString(), user.age());

        // System.out.printf("%s was born back in %s and he is now %d years old. \n", user.getName(), user.getBirthDay(), user.age());

        // System.out.printf("%s has borrowed these books: %s. \n", user.getName(), user.books.toString());

        // System.out.printf("%s has borrowed these books: %s. \n", user.getName(), user.borroweddBooks());

        // User olderUser = new User();

        // olderUser.name = "Rajesh Chaudhary";
        // olderUser.birthDay = LocalDate.parse("2002-02-02");

        // System.out.printf("%s was born back in %s and he is now %d years old.", olderUser.name, olderUser.birthDay.toString(), olderUser.age());        

    }    
}

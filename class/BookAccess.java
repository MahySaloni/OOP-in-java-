public class BookAccess {
    public static void main(String[] args) {
        book book1 = new book();
        book1.setTitle("Atomic Habits");
        book1.setAuthor("James Clear");
        book1.setPrice(30.00f);

        book book2 = new book();
        book2.setTitle("Sapiens");
        book2.setAuthor("Yuval Noah Harari");
        book2.setPrice(25.00f);

        System.out.println("The first book object is ");
        System.out.println(book1);

        System.out.println("The second book object is ");
        System.out.println(book2);
    }
}

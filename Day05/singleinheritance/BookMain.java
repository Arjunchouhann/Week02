//Parent class Book
class Book {
    //Attributes of class Book
    private String title;
    private int publicationYear;

    //Constructor making
    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    //Creating method to Print result
    public void displayInfo(){
        System.out.println("Book title : "+title+" | Publication Year : "+publicationYear);
    }
}

//child class Author
class Author extends Book {
    private String name;
    private String bio;

    //Creating construtor using super method to use parent attributes and its unique attributes too
    public Author(String title, int publicationYear , String name ,String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    //Creating method displayresult and use super keyword to use parent method

    @Override
    public void displayInfo() {
        System.out.println("Author Name : "+name);
        System.out.println("Author Bio : "+bio);
        super.displayInfo();
    }
}

//Driver Method
public class BookMain{
    public static void main(String[] args) {
        
        //Creating object of class Author
        Author author1 = new Author("To kill a Mocking Bird",1960,"Harper Lee","To Kill a Mockingbird is a novel by the American author Harper Lee. It was published in July 1960 and became instantly successful");
        
        //Calling method by object
        author1.displayInfo();
    }
}
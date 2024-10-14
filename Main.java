import java.util.Scanner;

class PrintInfo {
    static void print() {
        System.out.println("Name: Kavya Singh");
        System.out.println("USN: 1BM23CS146");
    }
}

class Books {
    String name;
    String author;
    int price;
    int numPages;

Books(String name, String author, int price, int numPages) {
this.name = name; this.author = author; this.price = price;this.numPages = numPages;
}


public String toString(){
String name, author, price, numPages;

name = "Book name: " + this.name + "\n";
author = "Author name: " + this.author + "\n";
price = "Price: " + this.price + "\n";
numPages = "Number of pages: " + this.numPages + "\n";

return name + author + price + numPages;
}
}

class Main{
public static void main(String args[]){

Scanner s = new Scanner(System.in);
int n;
String name;
String author; 
int price; 
int numPages;

n = s.nextInt(); //read no. of books
Books b[];
b = new Books[n];

for(int i=0;i<n;i++){

System.out.println("Book "+(i+1)+":");

System.out.println("Enter name of book: ");
name = s.next();
System.out.println("Enter author of book: ");
author = s.next();
System.out.println("Enter price of book: ");
price = s.nextInt();
System.out.println("Enter no of pages in the book: ");
numPages = s.nextInt();

b[i] = new Books(name,author,price,numPages); 
}

for(int i=0;i<n;i++){
System.out.println("Book Details: ");
System.out.println(b[i].toString());
}
 PrintInfo.print();
s.close();
}
}

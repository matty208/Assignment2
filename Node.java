package edu.monmouth.hw2;

import edu.monmouth.book.Book; 

public class Node {

    private Book book; 
    private Node next;


    public Node(Book book) {
        this.book = book;
        next = null;
    }


    public void setBook(Book book) {
        this.book = book;
    }

    public Book getBook() {
        return book;
    }

    public void setNext(Node link) {
        this.next = link;
    }

    public Node getNext() {
        return next;
    }

    @Override
    public String toString() {
        return book.toString();
    }
}

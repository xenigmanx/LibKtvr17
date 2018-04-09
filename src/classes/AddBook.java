/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import entity.Book;
import interfaces.Insertable;
import java.util.Scanner;
import libproptvr16.ConsoleInsertable;

/**
 *
 * @author Melnikov
 */
public class AddBook {
    private Insertable ins;
    public void add(){
        ins = new ConsoleInsertable();
        Book book = new Book();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Новая книга:");
        System.out.println("Название книги:");
        book.setName(scanner.nextLine());
        System.out.println("Автрор: ");
        book.setAuthor(scanner.nextLine());
        System.out.println("ISBN:");
        book.setIsbn(scanner.nextLine());
        ins.addBooks();
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libproptvr16;


import classes.AddBook;
import classes.AddReader;
import classes.BackBook;
import classes.TakeBook;
import entity.Book;
import entity.History;
import entity.Reader;
import interfaces.Insertable;
import java.util.List;

/**
 *
 * @author Melnikov
 */
public class ConsoleInsert implements Insertable{

    @Override
    public Book addBook() {
        AddBook addBook = new AddBook();
        return addBook.add();
    }

    @Override
    public Reader addReader() {
        AddReader addReader = new AddReader();
        return addReader.add();
    }

    @Override
    public History takeBook(List<Book> books, List<Reader> readers) {
        TakeBook takeBook = new TakeBook();
        return takeBook.add(books, readers);
    }

    @Override
    public History backBook(List<History> histories) {
        BackBook backBook = new BackBook();
        return backBook.add(histories);
    }

    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import entity.Book;
import entity.History;
import entity.Reader;
import java.util.List;

/**
 *
 * @author Melnikov
 */
public interface Insertable {
    public List<Book> addBooks();
    public List<Reader> addReaders();
    public List<History> addHistories();
}

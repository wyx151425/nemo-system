package com.rumofuture.nemo.model.dao;

import com.rumofuture.nemo.model.domain.Book;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by WangZhenqi on 2017/10/24.
 */

@Repository
public interface BookDao {
    int saveBook(Book book) throws SQLException;
    int updateBook(Book book) throws SQLException;
    int deleteBook(Serializable id) throws SQLException;
    Book getBookById(Serializable id) throws SQLException;
    List<Book> getBookListByAuthor(Serializable id, int pageCode) throws SQLException;
}

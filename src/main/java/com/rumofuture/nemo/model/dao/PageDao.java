package com.rumofuture.nemo.model.dao;

import com.rumofuture.nemo.model.domain.Page;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by WangZhenqi on 2017/10/24.
 */

@Repository
public interface PageDao {
    int savePage(Page page) throws SQLException;
    int updatePage(Page page) throws SQLException;
    int deletePage(Page page) throws SQLException;
    Page getPageById(Serializable id) throws SQLException;
    List<Page> getPageListByBook(Serializable id, int pageCode) throws SQLException;
}

package com.rumofuture.nemo.controller;

import com.rumofuture.nemo.model.domain.Book;
import com.rumofuture.nemo.model.domain.User;
import com.rumofuture.nemo.service.BookService;
import com.rumofuture.nemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

/**
 * Created by WangZhenqi on 2017/8/11.
 */

@RestController
@RequestMapping(value = "/books")
public class BookController {

    private final UserService userService;
    private final BookService bookService;

    @Autowired
    public BookController(UserService userService, BookService bookService) {
        this.userService = userService;
        this.bookService = bookService;
    }

//    /**
//     * 漫画册创建方法，逻辑如下：
//     * 1. 首先检查除漫画册封面文件对象（MultipartFile类型）以外的数据，任何一项为空则创建操作停止，返回“请完善漫画册信息”错误信息；
//     * 2. 如果漫画册封面文件对象（MultipartFile类型）不为空，则根据漫画册数据信息创建漫画册并保存漫画册；
//     * 如果漫画册封面文件对象（MultipartFile类型）为空，则返回“文件上传失败”错误信息；
//     * 3. 如果漫画册保存成功，则获取漫画册封面保存路径并验证路径是否已经存在，进行漫画册封面文件的保存；
//     * 如果漫画册保存失败，则返回“漫画侧创建失败”错误信息；
//     * 4. 如果漫画册封面文件保存成功，则为漫画册对象设置封面，进行漫画册信息的更新；
//     * 如果漫画册封面文件保存失败，则返回“漫画册创建失败”错误信息，并删除已保存的漫画册对象；
//     * 5. 如果漫画册信息更新成功，则返回“漫画册创建成功”信息；
//     * 如果漫画册信息更新失败，则删除已经保存的漫画册对象并删除漫画册封面文件，返回“漫画册创建失败”错误信息；
//     *
//     * @param userId       漫画册所属用户id
//     * @param name         漫画册名称
//     * @param cover        漫画册封面文件对象
//     * @param style        漫画册风格
//     * @param introduction 漫画册简介
//     * @return json对象
//     */
//    @PostMapping(value = "/create")
//    public Book bookCreate(
//            @RequestParam("userId") Integer userId,
//            @RequestParam("name") String name,
//            @RequestParam("cover") MultipartFile cover,
//            @RequestParam("style") String style,
//            @RequestParam("introduction") String introduction
//    ) {
//        // 检查客户端提交的数据
//        if (DataUtils.isIdEmpty(userId)) {
//            return new ResponseBook(false, PromptUtils.DATA_TRANSMISSION_FAILED, null);
//        }
//
//        if (DataUtils.isStringDataEmpty(name, style, introduction)) {
//            return new ResponseBook(false, PromptUtils.BOOK_INFORMATION_IMPROVE_REQUEST, null);
//        }
//
//        if (!cover.isEmpty()) {
//            // 创建漫画册对象并完善漫画册对象信息
//            User targetUser = userService.findUserById(userId);
//            Book book = new Book();
//            book.setName(name);
//            book.setAuthor(targetUser);
//            book.setCoverUrl("");
//            book.setStyle(style);
//            book.setIntroduction(introduction);
//            book.setPageTotal(0);
//            book.setFavorTotal(0);
//            book.setCreateTime(LocalDateTime.now().withNano(0));
//            book.setUpdateTime(LocalDateTime.now().withNano(0));
//
//            int saveResult = bookService.saveBook(book);  // 保存漫画册对象
//
//            // 如果漫画册保存成功则执行如下操作
//            if (1 == saveResult) {
//                String coverPath = FilePathUtils.getBookCoverPath(book.getId());  // 获取漫画册封面文件保存目录
//                String coverName = cover.getOriginalFilename();  // 获取漫画册封面文件名称
//                File filePath = new File(coverPath, coverName);  // 根据漫画册封面文件保存目录创建文件对象
//
//                // 判断目录是否存在，如果不存在则创建目录
//                if (!filePath.getParentFile().exists()) {
//                    filePath.getParentFile().mkdirs();
//                }
//
//                try {
//                    File coverFile = new File(coverPath + coverName);  // 创建用于保存的漫画册封面文件对象（File类型）
//                    cover.transferTo(coverFile);  // 保存漫画册封面文件
//                    book.setCoverUrl(coverPath + coverName);  // 为漫画册设置封面
//
//                    int updateResult = bookService.updateBookInformation(book);  // 更新漫画册信息
//
//                    // 漫画册信息更新成功则执行如下操作
//                    if (1 == updateResult) {
//                        return new ResponseBook(true, PromptUtils.BOOK_CREATE_SUCCESS, book);
//                    }
//
//                    // 漫画册信息更新失败则执行如下操作
//                    else {
//                        bookService.deleteBook(book.getId());  // 删除漫画册对象
//                        // 删除所有为漫画册封面文件创建的目录
//                        File grandParent = coverFile.getParentFile().getParentFile();
//                        File parent = coverFile.getParentFile();
//                        coverFile.delete();
//                        parent.delete();
//                        grandParent.delete();
//                        return new ResponseBook(false, PromptUtils.BOOK_CREATE_FAILED, null);
//                    }
//                }
//                // 如果漫画册封面文件保存失败则执行如下操作
//                catch (IOException e) {
//                    bookService.deleteBook(book.getId());
//                    return new ResponseBook(false, PromptUtils.BOOK_CREATE_FAILED, null);
//                }
//            }
//            // 如果漫画册保存失败则执行如下操作
//            else {
//                return new ResponseBook(false, PromptUtils.BOOK_CREATE_FAILED, null);
//            }
//        } else {
//            return new ResponseBook(false, PromptUtils.DATA_TRANSMISSION_FAILED, null);
//        }
//    }
//
//    /**
//     * 漫画册删除方法，逻辑如下：
//     * 1. 检查id是否为空，若不为空则从数据库获取具有完整漫画册信息的漫画册对象；
//     * 2. 删除数据库中的漫画册数据，如果删除成功，则根据获取的漫画册对象的cover保存路径创建文件对象，
//     * 将文件服务器中的漫画册封面文件也删除；如果漫画册数据删除失败，则返回删除失败的提示信息；
//     *
//     * @param id 漫画册id
//     * @return
//     */
//    @DeleteMapping(value = "/delete")
//    public ResponseBook bookDelete(
//            @RequestParam("id") Integer id
//    ) {
//        // 检查前端提交的漫画册id是否为空
//        if (DataUtils.isIdEmpty(id)) {
//            return new ResponseBook(false, PromptUtils.DATA_TRANSMISSION_FAILED, null);
//        }
//
//        // 从数据库中获取具有完整数据的漫画册对象
//        Book targetBook = bookService.findBookById(id);
//
//        // 如果漫画册数据获取陈功，则执行删除操作
//        if (targetBook != null) {
//            // 删除数据库中的漫画册数据，返回删除结果
//            int bookDeleteResult = bookService.deleteBook(id);
//            if (1 == bookDeleteResult) {
//                // 如果漫画册删除成功，则删除漫画册封面文件和上级目录
//                File bookCover = new File(targetBook.getCoverUrl());
//                File grandParent = bookCover.getParentFile().getParentFile();
//                File parent = bookCover.getParentFile();
//                bookCover.delete();
//                parent.delete();
//                grandParent.delete();
//                return new ResponseBook(true, PromptUtils.BOOK_DELETE_SUCCESS, null);
//            }
//            // 如果漫画册删除失败，则返回删除失败提示消息
//            else {
//                return new ResponseBook(false, PromptUtils.BOOK_DELETE_FAILED, null);
//            }
//        }
//        // 如果漫画册获取失败，则不执行操作，直接返回错误信息
//        else {
//            return new ResponseBook(false, PromptUtils.BOOK_DELETE_FAILED, null);
//        }
//    }
//
//    /**
//     * 漫画册信息更新方法，逻辑如下：
//     * 1. 检查漫画册id是否为null或0，漫画册信息是否为null，有一项为真则说明数据传输失败；
//     * 2. 根据id查询数据库，获取具有完整信息的漫画册对象，将前端提交的属性全部赋值到漫画册对象中；
//     * 3. 为漫画册对象设置更新日期，访问数据库，更新漫画册数据；
//     * 4. 如果漫画册数据更新成功，则返回更新成功的提示信息；
//     *
//     * @param id           漫画册id
//     * @param name         漫画册名称
//     * @param style        漫画册风格
//     * @param introduction 漫画册简介
//     * @return
//     */
//    @PutMapping(value = "/info/update")
//    public ResponseBook bookUpdate(
//            @RequestParam(value = "id", required = true) Integer id,
//            @RequestParam(value = "name", required = true) String name,
//            @RequestParam(value = "style", required = true) String style,
//            @RequestParam(value = "introduction", required = true) String introduction
//    ) {
//        // 检查漫画册id是否为0或null
//        if (DataUtils.isIdEmpty(id)) {
//            return new ResponseBook(false, PromptUtils.DATA_TRANSMISSION_FAILED, null);
//        }
//
//        // 检查前端提交的漫画册名称，分类，风格，简介是否为null
//        if (DataUtils.isDataNull(name, style, introduction)) {
//            return new ResponseBook(false, PromptUtils.DATA_TRANSMISSION_FAILED, null);
//        }
//
//        // 从数据库中获取具有完整信息的漫画册对象
//        Book targetBook = bookService.findBookById(id);
//        if (null != targetBook) {
//            targetBook.setName(name);
//            targetBook.setStyle(style);
//            targetBook.setIntroduction(introduction);
//            int result = bookService.updateBookInformation(targetBook);
//            if (1 == result) {
//                return new ResponseBook(true, PromptUtils.BOOK_INFORMATION_UPDATE_SUCCESS, targetBook);
//            } else {
//                return new ResponseBook(false, PromptUtils.BOOK_INFORMATION_UPDATE_FAILED, null);
//            }
//        } else {
//            return new ResponseBook(false, PromptUtils.BOOK_INFORMATION_UPDATE_FAILED, null);
//        }
//    }
}

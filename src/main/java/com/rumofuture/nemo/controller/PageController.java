package com.rumofuture.nemo.controller;

import com.rumofuture.nemo.model.domain.Page;
import com.rumofuture.nemo.model.dto.response.Response;
import com.rumofuture.nemo.service.BookService;
import com.rumofuture.nemo.service.PageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * Created by WangZhenqi on 2017/8/11.
 */

@RestController
@RequestMapping(value = "/pages")
public class PageController {

    @Autowired
    private BookService bookService;

    @Autowired
    private PageService pageService;

//    /**
//     * 漫画册分页上传方法，逻辑如下：
//     * 1.
//     *
//     * @param bookId 所属漫画册的id
//     * @param image  漫画分页图片
//     * @return 返回响应结果对象
//     */
//    @PostMapping(value = "/append")
//    public Response<Page> bookCoverUpload(
//            @RequestParam(value = "bookId", required = true) Integer bookId,
//            @RequestParam(value = "image", required = true) MultipartFile image
//    ) {
//        // 检查客户端提交的数据
//        if (DataUtils.isIdEmpty(bookId)) {
//            return new ResponsePage(false, "文件上传失败", null);
//        }
//
//        // 如果文件不为空，则将文件保存到制定路径中
//        if (!image.isEmpty()) {
//            // 上传文件路径
//            String path = FilePathUtils.getPageImagePath(bookId);
//            // 上传文件名
//            String fileName = image.getOriginalFilename();
//            File filePath = new File(path, fileName);
//            // 判断路径是否存在，如果不存在则创建路径
//            if (!filePath.getParentFile().exists()) {
//                filePath.getParentFile().mkdirs();
//            }
//            // 将上传文件保存到一个目标文件当中
//            try {
//                image.transferTo(new File(path + fileName));
//                Page page = new Page();
//                page.setImageUrl(path + fileName);
//                return new ResponsePage(true, "文件上传成功", page);
//            } catch (IOException e) {
//                return new ResponsePage(false, "文件保存失败", null);
//            }
//        } else {
//            return new ResponsePage(false, "文件上传失败", null);
//        }
//    }
}

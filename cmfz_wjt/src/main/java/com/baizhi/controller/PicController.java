package com.baizhi.controller;

import com.baizhi.entity.Picture;
import com.baizhi.service.PicService;
import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * Created by Administrator on 2018/8/29 0029.
 */
@Controller
@RequestMapping("/pic")
public class PicController {
    @Autowired
    private PicService picService;
    @RequestMapping("/showPic")
    @ResponseBody
    public Map<String, Object> showAll(Integer page, Integer rows){
        HashMap<String, Object> map = new HashMap<>();
        List<Picture> list = picService.showAll(page,rows);
        int total = picService.count();
        map.put("total",total);
        map.put("rows",list);
        return map;
    }
    @RequestMapping("/delete")
    @ResponseBody
    public void delete(Integer id){
        System.out.println("id="+id);
        picService.delete(id);
    }
    @RequestMapping("/add")
    @ResponseBody
    public void add(String title,
                    String description,
                    String status,
                    MultipartFile pic,
                    String uploadDate,
                    HttpServletRequest request){
        /**
         * 1.指定上传位置
         * 2.防止文件重名
         * 3.上传文件到指定文件夹
         *
         * 将图片暂存到项目webapp中   正规的存放位置：分布式文件存储系统
         */
        //项目的绝对路径：D:\source\final_project\cmfz_wjt\src\main\webapp\
        String realPath = request.getServletContext().getRealPath("/");
        //文件的存储位置
        String uploadFilePath = realPath+"upload";
        File file = new File(uploadFilePath);
        if (!file.exists()){
            file.mkdir();
        }
        //例如图片名为 001.jpg，获取其文件名：
        String originalFilename = pic.getOriginalFilename();
        //生成UUID
        String uuid = UUID.randomUUID().toString();
        //获取文件的后缀名
        String extension = FilenameUtils.getExtension(originalFilename);
        String newName = uuid+"."+extension;
        try {
            pic.transferTo(new File(uploadFilePath,newName));
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 入库 url  uuid.jpg
        Picture picture = new Picture();
        picture.setTitle(title);
        picture.setDescription(description);
        String path = "/upload/"+newName;
        picture.setImgPath(path);
        picture.setStatus(status);
        picture.setUploadDate(uploadDate);
        picService.add(picture);
    }
}

package com.baizhi.controller;

import com.baizhi.util.ImageUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2018/8/28 0028.
 */
@Controller
@RequestMapping("/img")
public class ImageController {
    @RequestMapping("/image")
    public void image(HttpServletResponse response,
                      HttpSession session)throws Exception{
        ImageUtil imageUtil = new ImageUtil();
        String code = imageUtil.getCode();
        session.setAttribute("code",code);
        ServletOutputStream outputStream = response.getOutputStream();
        ImageIO.write(imageUtil.getBuffImg(),"png",outputStream);
    }
}

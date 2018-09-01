import com.baizhi.dao.PicDAO;
import com.baizhi.entity.Picture;
import com.baizhi.service.PicService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Administrator on 2018/8/29 0029.
 */
public class PicTest extends BaseTest{
    @Autowired
    private PicService picService;
    @Autowired
    private PicDAO picDAO;
    @Test
    public void test1(){
        List<Picture> list = picService.showAll(1, 3);
        for (Picture picture : list) {
            System.out.println(picture);
        }
    }
    @Test
    public void test222(){
        List<Picture> list = picDAO.showAll(0, 3);
        for (Picture picture : list) {
            System.out.println(picture);
        }
    }
    @Test
    public void test444(){
        Picture picture = new Picture();
        picture.setUploadDate("2018-8-30");
        picture.setStatus("y");
        picture.setImgPath("/picture/013.jpg");
        picture.setDescription("空即是色");
        picture.setTitle("美十三");
        picService.add(picture);
    }
}

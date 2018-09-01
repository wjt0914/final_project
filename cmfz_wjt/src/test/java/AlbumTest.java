import com.baizhi.dao.AlbumDAO;
import com.baizhi.entity.Album;
import com.baizhi.service.AlbumService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Administrator on 2018/8/30 0030.
 */
public class AlbumTest extends BaseTest {
    @Autowired
    private AlbumDAO albumDAO;
    @Autowired
    private AlbumService albumService;
    @Test
    public void test1(){
        List<Album> list = albumDAO.showAll(0,2);
        for (Album album : list) {
            System.out.println(album);
        }
    }
    @Test
    public void test333(){
        int count = albumDAO.count();
        System.out.println(count);
    }
    @Test
    public void test555(){
        List<Album> list = albumService.showAll(1, 2);
        for (Album album : list) {
            System.out.println(album);
        }
    }
}

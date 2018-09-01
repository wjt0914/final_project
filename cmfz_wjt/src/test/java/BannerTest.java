import com.baizhi.entity.Banner;
import com.baizhi.service.BannerService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Administrator on 2018/8/29 0029.
 */
public class BannerTest extends BaseTest {
    @Autowired
    private BannerService bannerService;
    @Test
    public void test555(){
        List<Banner> list = bannerService.queryAll();
        for (Banner banner : list) {
            System.out.println(banner);
        }
    }
}

import com.baizhi.App;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Administrator on 2018/8/28 0028.
 */
@RunWith(value= SpringRunner.class)//启动springboot的环境
@SpringBootTest(classes = App.class)//指定入口类 指定service、controller、dao包
public class BaseTest {
}

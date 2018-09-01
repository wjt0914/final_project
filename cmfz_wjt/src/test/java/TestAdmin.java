import com.baizhi.dao.AdminDAO;
import com.baizhi.entity.Admin;
import com.baizhi.service.AdminService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Administrator on 2018/8/28 0028.
 */
public class TestAdmin extends BaseTest{
    @Autowired
    private AdminService adminService;
    @Autowired
    private AdminDAO adminDAO;

    @Test
    public void test1(){
        Admin admin = adminService.login("wjt", "123456");
        System.out.println(admin);
    }
    @Test
    public void test2(){
        Admin admin = adminDAO.login("wjt", "123456");
        System.out.println(admin);
    }
}

import com.rainbow.practice.mybatisplustest.MybatisPlusTest;
import com.rainbow.practice.mybatisplustest.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @Author: yzh
 * @Date: 2024/4/25
 * @Description:
 */
@RunWith(SpringRunner.class)
@Slf4j
@SpringBootTest(classes = MybatisPlusTest.class)
public class TestSave {

    @Resource
    private UserService userService;

    @Test
    public void test() {
        userService.testSaveBatch();
    }
}

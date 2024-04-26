import com.rainbow.practice.dbview.DbViewApplication;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: yzh
 * @Date: 2024/4/25
 * @Description:
 */
@RunWith(SpringRunner.class)
@Slf4j
@SpringBootTest(classes = DbViewApplication.class)
public class TestSave {


    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void test() {
    }
}

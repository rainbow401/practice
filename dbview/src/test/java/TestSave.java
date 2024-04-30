import com.rainbow.practice.dbview.DbViewApplication;
import com.rainbow.practice.dbview.constance.DbInfoSQL;
import com.rainbow.practice.dbview.model.TableColumn;
import lombok.extern.slf4j.Slf4j;
import org.jetbrains.annotations.NotNull;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

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

        List<String> tables = jdbcTemplate.queryForList(String.format(DbInfoSQL.GET_TABLES), String.class);
        System.out.println("tables = " + tables);

        for (String table : tables) {
            List<TableColumn> tableColumns = jdbcTemplate.query(String.format(DbInfoSQL.GET_COLUMNS, table), new RowMapper<TableColumn>() {
                @Override
                public TableColumn mapRow(ResultSet rs, int rowNum) throws SQLException {
                    TableColumn result = new TableColumn();
                    result.setField(rs.getString("Field"));
                    result.setType(rs.getString("Type"));
                    result.setCollation(rs.getString("Collation"));
                    result.setNullable(!Objects.equals(rs.getString("Null"), "NO"));
                    result.setKey(rs.getString("Key"));
                    result.setDefaultValue(rs.getString("Default"));
                    result.setExtra(rs.getString("Extra"));
                    result.setPrivileges(rs.getString("Privileges"));
                    result.setComment(rs.getString("Comment"));

                    jdbcTemplate.query(String.format(DbInfoSQL.GET_DDL, table), new RowMapper<Integer>() {
                        @Override
                        public Integer mapRow(@NotNull ResultSet rs, int rowNum) throws SQLException {
                            result.setDdl(rs.getString("Create Table"));
                            return rowNum;
                        }
                    });

                    return result;
                }
            });

            System.out.println("table = " + table);
            System.out.println("tableColumns = " + tableColumns);
        }
    }
}

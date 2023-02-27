package com.qicong.os;

import com.qicong.os.common.t2b.Table2BeanHelper;
import com.qicong.os.common.t2b.TableBean;
import com.qicong.os.common.t2b.TableBeanDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * User: 祁大聪
 */
@SpringBootTest
public class TableBeanDaoTest {

    @Autowired
    private TableBeanDao tableBeanDao;

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Test
    public void createTableBeans(){

        jdbcTemplate.execute("select * from dual");

        /*//换成你的项目目录
        String mainDir = "D:\\workspaceVideo\\onlineSchool\\src\\main";
        String packageName = "com.qicong.os";
        //换成开发者的数据库名称
        String database = "osdb";

        TableBean vo = new TableBean();
        vo.setTableSchema(database);
        //针对整个数据库反转，已经存在了的不会反转和覆盖
        List<String> tables = tableBeanDao.listTables(vo);
        for (String table : tables) {
            System.out.println("table = " + table);
            vo.setTableName(table);
            List<TableBean> cols = tableBeanDao.listTableCols(vo);
            Table2BeanHelper.convert(mainDir, packageName , table, cols);
        }*/

    }
}

package org.study.db;

import java.sql.Connection;

/**
 * <pre>
 *
 * jdbc基本操作
 * 基于mysql操作
 * User: dearfruit
 * Date: 2017/3/16
 *
 * </pre>
 */
public class JdbcBaseExample {

    public void testConnection() {
        Connection connection = null;
        String sql = null;
        String url = "";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("成功加载MySQL驱动程序");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();

        }
    }
}

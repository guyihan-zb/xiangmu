package utils;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * [description]
 *
 * @author： zhangbo
 * @date: 2021-04-08
 * @time: 16:38
 */
public class DBUtils {
    private static MysqlDataSource dataSource = null;

    /**
     * 得到 Connection 的通用方法
     * @return
     * @throws SQLException
     */
    public static Connection getConnection() throws SQLException {
        if (dataSource == null) {
            // 第一次调用
            dataSource = new MysqlDataSource();
            dataSource.setURL("jdbc:mysql://localhost:3306/java18blog?serverTimezone=GMT%2B8");
            dataSource.setUser("root");
            // [设置你自己的密码]
            //dataSource.setPassword("22458hijk");
            dataSource.setPassword("12345678");
        }
        return dataSource.getConnection();
    }

    /**
     * 通用的关闭方法
     * @param connection
     * @param statement
     * @param resultSet
     * @throws SQLException
     */
    public static void close(Connection connection,
                             PreparedStatement statement,
                             ResultSet resultSet) throws SQLException {
        if (resultSet != null) resultSet.close();
        if (statement != null) statement.close();
        if (connection != null) connection.close();
    }

}

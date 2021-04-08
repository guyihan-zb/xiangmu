package dao;

import utils.DBUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * [description]
 *
 * @author： zhangbo
 * @date: 2021-04-08
 * @time: 16:36
 */
public class UserInfoDao {
    /**
     * 用户添加【注册功能】
     */
    public int add(String username, String password) throws SQLException {
        int result = 0;
        Connection connection = DBUtils.getConnection();
        String sql = "insert into userinfo(username,password) values(?,?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, username);
        statement.setString(2, password);
        result = statement.executeUpdate();
        // 关闭数据库连接
        DBUtils.close(connection, statement, null);
        return result;
    }

}

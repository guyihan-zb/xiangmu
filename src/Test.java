import com.mysql.jdbc.Driver;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.*;


/**
 * [description]
 *
 * @author： zhangbo
 * @date: 2021-03-30
 * @time: 16:54
 */
public class Test {
    public static void main1(String[] args) throws ClassNotFoundException, SQLException {
        //1、加载驱动程序
        Class.forName("com.mysql.jdbc.Driver");

        //2、获取连接
        String url = "jdbc:mysql://127.0.0.1:3306/testjava18?useSSL=false";
        String username = "root";//数据库的用户名称
        String password = "22458hijk";//数据库的密码
        Connection connection = DriverManager.getConnection(url,username,password);

        //3、执行SQL语句

        String sql = "select * from user";

        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery(sql);

        if(resultSet.next()) {
            User user= new User();
            user.setId(resultSet.getInt(1));
            user.setName(resultSet.getString(2));
            user.setPassword(resultSet.getString(3));
            System.out.println(user);

        }

    }

    public static void main2(String[] args) throws ClassNotFoundException, SQLException {
        //1、加载驱动程序
        Class.forName("com.mysql.jdbc.Driver");

        //2、获取连接
        String url = "jdbc:mysql://127.0.0.1:3306/testjava18?useSSL=false";
        String username = "root";//数据库的用户名称
        String password = "22458hijk";//数据库的密码
        Connection connection = DriverManager.getConnection(url,username,password);

        //3、执行SQL语句
        String uname="bit";
        String upass="123";

        String sql = "select * from user where name ='"+uname+"' and password ='"+upass+"'";

        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery(sql);

        if(resultSet.next()) {
            User user= new User();
            user.setId(resultSet.getInt(1));
            user.setName(resultSet.getString(2));
            user.setPassword(resultSet.getString(3));
            System.out.println(user);

        }
    }
    public static void main3(String[] args) throws ClassNotFoundException, SQLException {
        //1、加载驱动程序
        Class.forName("com.mysql.jdbc.Driver");

        //2、获取连接
        String url = "jdbc:mysql://127.0.0.1:3306/testjava18?useSSL=false";
        String username = "root";//数据库的用户名称
        String password = "22458hijk";//数据库的密码
        Connection connection = DriverManager.getConnection(url,username,password);

        //3、执行SQL语句
        String uname= "bit";
        String upass= " 1' or '1' = '1";

        String sql = "select * from user where name ='"+uname+"' and password ='"+upass+"'";

        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery(sql);

        if(resultSet.next()) {
            User user= new User();
            user.setId(resultSet.getInt(1));
            user.setName(resultSet.getString(2));
            user.setPassword(resultSet.getString(3));
            System.out.println(user);

        }
    }
    public static void main4(String[] args) throws ClassNotFoundException, SQLException {
        //1、加载驱动程序
        Class.forName("com.mysql.jdbc.Driver");

        //2、获取连接
        String url = "jdbc:mysql://127.0.0.1:3306/testjava18?useSSL=false";
        String username = "root";//数据库的用户名称
        String password = "22458hijk";//数据库的密码
        //Connection connection = DriverManager.getConnection(url,username,password);

        // 数据源
        DataSource dataSource = new MysqlDataSource();
        ((MysqlDataSource)dataSource).setUrl(url);
        ((MysqlDataSource)dataSource).setUser(username);
        ((MysqlDataSource)dataSource).setPassword(password);

        Connection connection = dataSource.getConnection();


        //3、执行SQL语句
        String uname= "bit";
        String upass= " 1' or '1' = '1";

        String sql = "select * from user where name =? and password =?";

        // 预防sql注入，还有预编译的功能
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1,uname);
        preparedStatement.setString(2,upass);
        System.out.println("sql："+preparedStatement.toString());

        ResultSet resultSet = preparedStatement.executeQuery();

        if(resultSet.next()) {
            User user= new User();
            user.setId(resultSet.getInt(1));
            user.setName(resultSet.getString(2));
            user.setPassword(resultSet.getString(3));
            System.out.println(user);
        }
        resultSet.close();
        preparedStatement.close();
        connection.close();
    }

    public static void main5(String[] args) throws ClassNotFoundException, SQLException {
        //1、加载驱动程序
        Class.forName("com.mysql.jdbc.Driver");

        //2、获取连接
        String url = "jdbc:mysql://127.0.0.1:3306/testjava18?useSSL=false";
        String username = "root";//数据库的用户名称
        String password = "22458hijk";//数据库的密码
        //Connection connection = DriverManager.getConnection(url,username,password);

        // 数据源
        DataSource dataSource = new MysqlDataSource();
        ((MysqlDataSource)dataSource).setUrl(url);
        ((MysqlDataSource)dataSource).setUser(username);
        ((MysqlDataSource)dataSource).setPassword(password);

        Connection connection = dataSource.getConnection();


        //3、执行SQL语句

        String sql = "insert into user(id,name,password) values (?,?,?)";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1,2);
        preparedStatement.setString(2,"gaobo");
        preparedStatement.setString(3,"666");

        System.out.println("sql："+preparedStatement.toString());



        //除了查询其他都用executeUpdate 返回 是受影响的行数
        int ret= preparedStatement.executeUpdate();
        if(ret!=0){
            System.out.println("插入成功");
        }

        preparedStatement.close();
        connection.close();
    }


    public static void main6(String[] args) throws ClassNotFoundException, SQLException {
        //1、加载驱动程序
        Class.forName("com.mysql.jdbc.Driver");

        //2、获取连接
        String url = "jdbc:mysql://127.0.0.1:3306/testjava18?useSSL=false";
        String username = "root";//数据库的用户名称
        String password = "22458hijk";//数据库的密码
        //Connection connection = DriverManager.getConnection(url,username,password);

        // 数据源
        DataSource dataSource = new MysqlDataSource();
        ((MysqlDataSource)dataSource).setUrl(url);
        ((MysqlDataSource)dataSource).setUser(username);
        ((MysqlDataSource)dataSource).setPassword(password);

        Connection connection = dataSource.getConnection();


        //3、执行SQL语句

        String sql = "update user set name=? where id=?";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1,"gaobo2");
        preparedStatement.setString(2,"2");

        System.out.println("sql："+preparedStatement.toString());



        //除了查询其他都用executeUpdate 返回 是受影响的行数
        int ret= preparedStatement.executeUpdate();
        if(ret!=0){
            System.out.println("更新成功");
        }

        preparedStatement.close();
        connection.close();
    }
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //1、加载驱动程序
        Class.forName("com.mysql.jdbc.Driver");

        //2、获取连接
        String url = "jdbc:mysql://127.0.0.1:3306/testjava18?useSSL=false";
        String username = "root";//数据库的用户名称
        String password = "22458hijk";//数据库的密码
        //Connection connection = DriverManager.getConnection(url,username,password);

        // 数据源
        DataSource dataSource = new MysqlDataSource();
        ((MysqlDataSource)dataSource).setUrl(url);
        ((MysqlDataSource)dataSource).setUser(username);
        ((MysqlDataSource)dataSource).setPassword(password);

        Connection connection = dataSource.getConnection();


        //3、执行SQL语句

        String sql = "delete from user where id =?";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1,2);

        System.out.println("sql："+preparedStatement.toString());



        //除了查询其他都用executeUpdate 返回 是受影响的行数
        int ret= preparedStatement.executeUpdate();
        if(ret!=0){
            System.out.println("删除成功");
        }

        preparedStatement.close();
        connection.close();
    }
}

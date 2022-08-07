package com.example.my_application003;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;




public class DBOpenHelper {

    public static Connection conn = null;
    private static String diver = "com.mysql.jdbc.Driver";
    //加入utf-8是为了后面往表中输入中文，表中不会出现乱码的情况   useSSL=false&
//    jdbc:mysql://192.168.211.132:3306/changgou_content?useUnicode=true&useSSL=false&characterEncoding=UTF-8&serverTimezone=UTC
//    private static String url = "jdbc:mysql://localhost:3306/mytest?useSSL=false&serverTimezone=UTC&useUnicode=true&characterEncodeing=UTF-8&serverTimezone=GMT&allowPublicKeyRetrieval=true";
    private static String url = "jdbc:mysql://10.0.2.2:3306/mytest?useUnicode=true&characterEncoding=utf8";
    private static String user = "root1";//用户名
    private static String password = "111111";//密码
    /*
     * 连接数据库
     * */
    public static void getConn() {

//        Class.forName(diver).newInstance();
        System.out.println("0000000000000000.5");

        try {
            Class.forName(diver).newInstance();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("000044444440000000.5");
        try {
            conn = (Connection) DriverManager.getConnection(url,user,password);//获取连接
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        System.out.println("0qwqeqqrq000000.5");
    //    return conn;
    }






}

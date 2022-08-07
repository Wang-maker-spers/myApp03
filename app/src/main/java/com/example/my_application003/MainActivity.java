package com.example.my_application003;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Message;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView textView;
    private static final int TEST_USER_SELECT = 1;
    int i =0;
//    @SuppressLint("HandlerLeak")
//    private Handler handler = new Handler(){
//        @Override
//        public void handleMessage(Message msg) {
//            String user;
//            switch (msg.what){
//                case TEST_USER_SELECT:
//                    Test test = (Test) msg.obj;
//                    user = test.getName();
//                    System.out.println("***********");
//                    System.out.println("***********");
//                    System.out.println("user:"+user);
//                    textView.setText(user);
//                    break;
//            }
//        }
//    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("ning","MainActivity onCreate");
//        button = (Button) findViewById(R.id.bt_send);
//        textView = (TextView) findViewById(R.id.tv_response);

        System.out.println("111111111");
    }


//    @Override
//    protected void onStart() {
//        super.onStart();
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                System.out.println("111111111");
//                //执行查询操作
//                //通多点击buttoni自增长查询对应id的name
//                if (i<=2){//因为数据库我就添加了三个数据条数，所以进行判断使其可以循环查询
//                    i++;
//                }
//                else{
//                    i=1;
//                }
//                //连接数据库进行操作需要在主线程操作
//                new Thread(new Runnable() {
//                    @Override
//                    public void run() {
//                        System.out.println("2222222222222");
//                        Connection conn = null;
//                        conn =(Connection) DBOpenHelper.getConn();
//                        if(conn != null){
//                            System.out.println("wweweqAFSDFSFDFG");
//                        }
//                        String sql = "select userName from ts_user where userId='"+i+"'";
//                        Statement st;
//                        try {
//                            st = (Statement) conn.createStatement();
//                            ResultSet rs = st.executeQuery(sql);
//                            while (rs.next()){
//                                //因为查出来的数据试剂盒的形式，所以我们新建一个javabean存储
//                                Test test = new Test();
//                                test.setName(rs.getString(1));
//                                Message msg = new Message();
//                                msg.what =TEST_USER_SELECT;
//                                msg.obj = test;
//                                handler.sendMessage(msg);
//                            }
//                            st.close();
//                            conn.close();
//                        } catch (SQLException e) {
//                            e.printStackTrace();
//                        }
//                    }
//                }).start();
//            }
//        });
//    }



}














































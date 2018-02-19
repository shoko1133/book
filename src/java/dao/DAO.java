package dao;

import javax.naming.InitialContext;
import javax.sql.DataSource;
import java.sql.Connection;

public class DAO {

    //データソースに保存する変数ds
    static DataSource ds;

    //データソースへの接続を取得するためのメソッド
    public Connection getConnection() throws Exception {
        if (ds == null) {
            InitialContext ic = new InitialContext();
            ds = (DataSource) ic.lookup("java:comp/env/jdbc/book");
        }
        return ds.getConnection();
    }
}
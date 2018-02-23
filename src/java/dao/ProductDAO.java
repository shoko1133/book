package dao;

import bean.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;

public class ProductDAO extends DAO {

    //searchメソッド。
    public List<Product> search(String keyword) throws Exception {
        //ResultSetオブジェクトの中身をリストに詰め替えてから返す。
        //Productクラスに保存するのでProduct型。
        List<Product> list = new ArrayList<>();
        //DAOクラスのgetConnectionメソッドを使ってデータベースに接続。
        Connection con = getConnection();

        //keywordが含まれるnameをセレクト。
        PreparedStatement st = con.prepareStatement(
                "SELECT*from product where name like ?");
        st.setString(1, "%" + keyword + "%");
        ResultSet rs = st.executeQuery();

        //検索結果であるResultSetオブジェクトから１行ずつ取り出し、各列の値を新たに生成したProductオブジェクトのプロパティにセッタをつかって書き込む。
        while (rs.next()) {
            Product p = new Product();
            p.setId(rs.getInt("id"));
            p.setName(rs.getString("name"));
            p.setPrice(rs.getInt("price"));
            list.add(p);
        }

        st.close();
        con.close();

        return list;
    }

    //追加を行うinsertメソッド。
    public int insert(Product product) throws Exception {
        Connection con = getConnection();

        PreparedStatement st = con.prepareStatement(
                "insert into  product values(null,?,?)");
        st.setString(1, product.getName());
        st.setInt(2, product.getPrice());
        int line = st.executeUpdate();

        st.close();
        con.close();

        return line;
    }
}


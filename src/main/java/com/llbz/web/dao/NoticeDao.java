package com.llbz.web.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.llbz.web.model.Notice;

@Repository
public class NoticeDao implements NoticeDaoable {
    @Autowired
    private DataSource dataSource;

    @Override
    public Notice getById(int id) {
        // title regdate, writer_id, hit, file
        Notice notice = null;
        String[] columns = { "title", "regdate", "writer_id", "hit", "files" };
        String columns_ = String.join(", ", columns);
        String sql = "SELECT " + columns_ + " FROM NOTICE "
                + "WHERE id = " + id;
                System.out.println(sql);
        try {
            Connection con = dataSource.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                String title = rs.getString("title");
                Date regDate = rs.getDate("regdate");
                String writerId = rs.getString("writer_id");
                int hit = rs.getInt("hit");
                String files = rs.getString("files");

                notice = new Notice(

                        title,
                        writerId,

                        regDate,
                        hit,
                        files

                );

            }
            rs.close();
            st.close();
            con.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return notice;
    }

    @Override
    public ArrayList<Notice> getList(int rowCnt) {
        // 실제 DB 칼럼명: id, title, writer_id, regdate, hit
        ArrayList<Notice> noticeList = new ArrayList<Notice>();
        String[] columns = { "id", "title", "writer_id", "regdate", "hit" };
        String columns_ = String.join(", ", columns);

        String sql = "SELECT " + columns_ + " FROM ("
                + "SELECT ROWNUM NUM, N.* FROM ("
                + "SELECT * FROM NOTICE ORDER BY REGDATE DESC"
                + ") N"
                + ") WHERE NUM BETWEEN 1 AND ?";

        try {
            Connection con = dataSource.getConnection();
            PreparedStatement st = con.prepareStatement(sql);

            st.setInt(1, rowCnt);

            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String title = rs.getString("title");
                String writerId = rs.getString("writer_id");
                Date regDate = rs.getDate("regdate");
                int hit = rs.getInt("hit");

                System.out.println(id);
                Notice notice = new Notice(
                        id,
                        title,
                        writerId,
                        regDate,
                        hit);
                noticeList.add(notice);
            }

            rs.close();
            st.close();
            con.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return noticeList;
    }

}

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
        Notice notice = new Notice();
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
                
                notice.setTitle(title);
                notice.setRegDate(regDate);
                notice.setWriterId(writerId);
                notice.setHit(hit);
                notice.setFiles(files);
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
    public ArrayList<Notice> getList(int page, int rowCnt) {
        // 실제 DB 칼럼명: id, title, writer_id, regdate, hit
        ArrayList<Notice> noticeList = new ArrayList<Notice>();
        String[] columns = { "id", "title", "writer_id", "regdate", "hit" };
        String columns_ = String.join(", ", columns);

        String sql = "SELECT " + columns_ + " FROM ("
                + "SELECT ROWNUM NUM, N.* FROM ("
                + "SELECT * FROM NOTICE ORDER BY REGDATE DESC"
                + ") N"
                + ") WHERE NUM BETWEEN ? AND ?";

        try {
            Connection con = dataSource.getConnection();
            PreparedStatement st = con.prepareStatement(sql);

            int firstNum = rowCnt*(page-1) + 1;
            int lastNum = rowCnt*page;

            st.setInt(1, firstNum);
            st.setInt(2, lastNum);

            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String title = rs.getString("title");
                String writerId = rs.getString("writer_id");
                Date regDate = rs.getDate("regdate");
                int hit = rs.getInt("hit");

                Notice notice = new Notice();
                notice.setId(id);
                notice.setTitle(title);
                notice.setWriterId(writerId);
                notice.setRegDate(regDate);
                notice.setHit(hit);

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

    @Override
    public Notice getPrevById(int id) {
        Notice notice = new Notice();
        String sql = 
        "SELECT ID, TITLE FROM NOTICE_ORDERED_VIEW WHERE NUM = "
        +"(SELECT NUM FROM notice_ordered_view WHERE ID = " + id + ") - 1";
            try {
                Connection con = dataSource.getConnection();
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(sql);
    
                while (rs.next()) {
                    int prevId = rs.getInt("id");
                    String title = rs.getString("title");
                    
                    notice.setId(prevId);
                    notice.setTitle(title);
                    
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
    public Notice getNextById(int id) {
        Notice notice = new Notice();
        String sql = 
        "SELECT ID, TITLE FROM NOTICE_ORDERD_VIEW WHERE NUM = "
        +"(SELECT NUM FROM notice_orderd_view WHERE ID = " + id + ") + 1";
            try {
                Connection con = dataSource.getConnection();
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(sql);
    
                while (rs.next()) {
                    int nextId = rs.getInt("id");
                    String title = rs.getString("title");
                    
                    notice.setId(nextId);
                    notice.setTitle(title);
                    
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
    public int getCount() {
        int cnt = 0;
        String sql =
        "SELECT count(*) count FROM notice_ordered_view";
        try {
            Connection con = dataSource.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                cnt = rs.getInt("count");
                
            }
            rs.close();
            st.close();
            con.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return cnt;
    }
    

}

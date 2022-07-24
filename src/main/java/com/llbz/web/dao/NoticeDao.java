package com.llbz.web.dao;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.llbz.web.model.Notice;

@Component
public class NoticeDao implements NoticeDaoable{
    @Autowired
    private DataSource dataSource;

    @Override
    public ArrayList<Notice> getList(int postCnt) {
        //id, title, writer_id, regdate, hit
        ArrayList<Notice> noticeList = new ArrayList<Notice>();
        String sql = "SELECT * FROM (SELECT ROWNUM NUM, N.* FROM" 
        + " (SELECT ID, TITLE, WRITER_ID, REGDATE, HIT" 
        + " FROM NOTICE ORDER BY REGDATE DESC) N)" 
        + " WHERE NUM BETWEEN 1 AND ?";

        try {
            Connection con = dataSource.getConnection();
            PreparedStatement st = con.prepareStatement(sql);
			
            st.setInt(1, postCnt);
            
            ResultSet rs = st.executeQuery();

			while (rs.next()) {
				int id = rs.getInt("id");
				String title = rs.getString("title");
				String writerId = rs.getString("writer_id");
				Date regDate = rs.getDate("regdate");
				int hit = rs.getInt("hit");
				

				Notice notice = new Notice(
						id,
						title,
						writerId,
						regDate,
						hit
						);
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

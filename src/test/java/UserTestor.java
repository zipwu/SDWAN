import datasource.DataConnection;
import entity.User;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class UserTestor {
    public DataConnection dataConnection = new DataConnection();

    @Test
    public void UserSelectAll() throws IOException {
        SqlSession sqlSession = dataConnection.getSqlSession();
        List<User> userList = sqlSession.selectList("selectAllUser");
        for (int i = 0;i< userList.size(); i++) {
            User user = userList.get(i);
            System.out.println(user);
        }
        sqlSession.commit();
        sqlSession.close();
    }
}

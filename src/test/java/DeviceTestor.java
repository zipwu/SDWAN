import datasource.DataConnection;
import entity.Device;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import java.io.IOException;
import java.util.List;

public class DeviceTestor {
    public DataConnection dataConnection = new DataConnection();
    @Test
    public void DeviceSelectAll() throws IOException{
        SqlSession sqlSession = dataConnection.getSqlSession();
        List<Device> deviceList = sqlSession.selectList("findAllDevice");
        for (int i = 0;i< deviceList.size(); i++) {
            Device device = deviceList.get(i);
            System.out.println(device.toString());
        }
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void DeviceSelect() throws IOException{
        SqlSession sqlSession = dataConnection.getSqlSession();
        List<Device> deviceList = sqlSession.selectList("findDeviceById",1);
        for (int i = 0;i< deviceList.size(); i++) {
            Device device = deviceList.get(i);
            System.out.println(device.toString());
        }
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void DeviceInsert() throws IOException{
        Device device = new Device();
        device.setId(123443);
        device.setDev_serial("ctsd1234");
        device.setPassword("p#ssw0rd");
        device.setInuse(1);
        device.setUsed(0);
        device.setMemo("专用设备");

        SqlSession sqlSession = dataConnection.getSqlSession();
        sqlSession.insert("insertDevice",device);
        sqlSession.commit();
        sqlSession.close();
    }


}

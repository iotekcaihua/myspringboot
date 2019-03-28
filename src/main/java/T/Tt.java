package T;


import com.caihua.service.impl.EmpServiceImpl;

import javax.xml.ws.Endpoint;
import java.net.MalformedURLException;
import java.net.URL;

public class Tt {
    public static void main(String[] args) {
        Endpoint.publish("http://192.168.43.214:80/findEmp",new EmpServiceImpl());
        System.out.println("发布成功！");
    }
}

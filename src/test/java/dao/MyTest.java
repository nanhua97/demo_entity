package dao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Properties;
import java.util.UUID;

public class MyTest {
    public static void main(String[] args) throws URISyntaxException, IOException {
        /*URL resource = MyTest.class.getClassLoader().getResource("a.properties");
        FileOutputStream fileOutputStream = new FileOutputStream(new File(resource.toURI()));
        InputStream resourceAsStream = MyTest.class.getClassLoader().getResourceAsStream("a.properties");
        Properties properties = new Properties();
        properties.load(resourceAsStream);
        properties.setProperty("111","111");
        properties.store(fileOutputStream,"11");
        fileOutputStream.close();*/
        /*FileInputStream fileInputStream = new FileInputStream("D:\\ALL_Java\\IdeaProjects\\export\\mybatis_demo\\src\\main\\resources\\b.properties");

        Properties properties = new Properties();

        properties.load(fileInputStream);

        fileInputStream.close();

        //需要输入流关闭后操作
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\ALL_Java\\IdeaProjects\\export\\mybatis_demo\\src\\main\\resources\\b.properties");

        properties.setProperty("333","222");

        properties.store(fileOutputStream,"");

        fileOutputStream.close();*/

        System.out.println(UUID.randomUUID().toString().length());

    }
}

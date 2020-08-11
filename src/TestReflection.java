import com.nepka.bean.Hero;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class TestReflection {
    public static void main(String[] args) {
        try {
            //对配置文件Hero.config进行数据读取
            String configPath = "E:\\IDEA_project\\j2ee_JSP\\Hero.config";
            File heroConfigFile = new File(configPath);
            Properties heroConfig = new Properties();
            heroConfig.load(new FileInputStream(heroConfigFile));
            //使用properties类型读取键值class，method所对应的字符串
            String className = heroConfig.getProperty("class");
            String pre_methodName = heroConfig.getProperty("pre_method");
            String next_methodName = heroConfig.getProperty("next_method");

            Class pClass = Class.forName(className);
            Constructor c = pClass.getConstructor();
            Hero h1 = (Hero) c.newInstance();

            Method m = h1.getClass().getMethod(pre_methodName, String.class);
            m.invoke(h1, "test");
            m = h1.getClass().getMethod(next_methodName);
            System.out.println(m.invoke(h1));

        } catch (ClassNotFoundException | NoSuchMethodException | InvocationTargetException
                | InstantiationException | IllegalAccessException | IOException e) {
            e.printStackTrace();
        }
    }
}

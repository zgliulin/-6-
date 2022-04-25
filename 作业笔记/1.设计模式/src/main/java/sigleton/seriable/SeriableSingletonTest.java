package sigleton.seriable;

import java.io.*;

/**
 * Description:
 *序列化，把内存中对象的状态转为字节码的形式,把字节码通过IO输出流，写到磁盘上永久保存下来
 *反序列化，把持久化的字节码内容，通过IO输入流读到内存中来，转化成一个Java对象
 * @author LiuLin
 * @date Created on 2022/4/24
 */
public class SeriableSingletonTest {
    public static void main(String[] args) {
        SeriableSingleton s1 = null;
        SeriableSingleton s2 = SeriableSingleton.getInstance();

        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("SeriableSingleton.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s2);
            oos.flush();
            oos.close();

            FileInputStream fis = new FileInputStream("SeriableSingleton.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            s1 = (SeriableSingleton) ois.readObject();
            ois.close();

            System.out.println(s1 == s2);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

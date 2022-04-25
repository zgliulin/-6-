package prototype.deep;

import java.io.*;
import java.util.List;

/**
 * Description: 深克隆demo
 *
 * @author LiuLin
 * @date Created on 2022/4/24
 */
public class ConcretePrototype implements Cloneable,Serializable{
    private int age;
    private String name;
    private List<String> hobbies;

    @Override
    protected ConcretePrototype clone() throws CloneNotSupportedException {
        return (ConcretePrototype) super.clone();
    }

    public ConcretePrototype deepClone() {
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);

            return (ConcretePrototype)ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

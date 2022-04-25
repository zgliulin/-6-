package prototype.shallow;

import java.util.List;

/**
 * Description: 浅克隆demo
 *
 * @author LiuLin
 * @date Created on 2022/4/24
 */
public class ConcretePrototype implements Cloneable{
    private int age;
    private String name;
    private List<String> hobbies; // 克隆后List是复制了引用地址

    @Override
    protected ConcretePrototype clone() throws CloneNotSupportedException {
        return (ConcretePrototype) super.clone();
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

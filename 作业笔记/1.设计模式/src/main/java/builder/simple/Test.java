package builder.simple;

/**
 * Description:
 *
 * @author LiuLin
 * @date Created on 2022/4/24
 */
public class Test {
    public static void main(String[] args) {
        CourseBilder bilder = new CourseBilder();
        bilder.addName("测试").addNote("note");
        System.out.println(bilder.builder());
    }
}

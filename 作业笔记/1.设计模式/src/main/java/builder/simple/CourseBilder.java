package builder.simple;

/**
 * Description:
 *
 * @author LiuLin
 * @date Created on 2022/4/24
 */
public class CourseBilder {
    private Course course = new Course();

    public CourseBilder addName(String name) {
        course.setName(name);
        return this;
    }

    public CourseBilder addPpt(String ppt) {
        course.setPpt(ppt);
        return this;
    }

    public CourseBilder addNote(String note) {
        course.setNote(note);
        return this;
    }

    public CourseBilder addVideo(String video) {
        course.setVideo(video);
        return this;
    }

    public CourseBilder addHomeWork(String homeWork) {
        course.setHomeWork(homeWork);
        return this;
    }

    public Course builder() {
        return course;
    }
}

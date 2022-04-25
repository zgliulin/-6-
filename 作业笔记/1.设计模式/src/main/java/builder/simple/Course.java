package builder.simple;

/**
 * Description:
 *
 * @author LiuLin
 * @date Created on 2022/4/24
 */
public class Course {
    private String name;
    private String ppt;
    private String note;
    private String video;
    private String homeWork;

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", ppt='" + ppt + '\'' +
                ", note='" + note + '\'' +
                ", video='" + video + '\'' +
                ", homeWork='" + homeWork + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPpt() {
        return ppt;
    }

    public void setPpt(String ppt) {
        this.ppt = ppt;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public String getHomeWork() {
        return homeWork;
    }

    public void setHomeWork(String homeWork) {
        this.homeWork = homeWork;
    }
}

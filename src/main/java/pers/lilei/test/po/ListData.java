package pers.lilei.test.po;

/**
 * <h3>SpringTest</h3>
 * <p></p>
 *
 * @author : 李雷
 * @date : 2020-12-08 10:27
 **/
public class ListData {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ListData{" +
                "name='" + name + '\'' +
                '}';
    }
}

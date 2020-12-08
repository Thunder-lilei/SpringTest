package pers.lilei.test.po;

/**
 * <h3>SpringTest</h3>
 * <p>Book</p>
 *
 * @author : 李雷
 * @date : 2020-12-07 21:24
 **/
public class Book {
    private String bname;
    private String bauthor;

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public String getBauthor() {
        return bauthor;
    }

    public void setBauthor(String bauthor) {
        this.bauthor = bauthor;
    }

//    @Override
//    public String toString() {
//        return "Book{" +
//                "bname='" + bname + '\'' +
//                ", bauthor='" + bauthor + '\'' +
//                '}';
//    }
}

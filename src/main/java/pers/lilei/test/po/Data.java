package pers.lilei.test.po;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * <h3>SpringTest</h3>
 * <p></p>
 *
 * @author : 李雷
 * @date : 2020-12-08 10:06
 **/
public class Data {
    private String[] strings;
    private List<String> list;
    private List<ListData> listData;
    private Map<String,String> map;
    private Set<String> set;

    public void setListData(List<ListData> listData) {
        this.listData = listData;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public void setStrings(String[] strings) {
        this.strings = strings;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void test() {
        System.out.println(Arrays.toString(strings));
        System.out.println(list);
        System.out.println(listData);
        System.out.println(map);
        System.out.println(set);
    }
}

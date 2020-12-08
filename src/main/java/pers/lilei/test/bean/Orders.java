package pers.lilei.test.bean;

/**
 * <h3>SpringTest</h3>
 * <p></p>
 *
 * @author : 李雷
 * @date : 2020-12-08 11:44
 **/
public class Orders {
    private String name;

    public Orders() {
        System.out.println("第一步 执行无参构造 创建bean实例");
    }

    public void setName(String name) {
        System.out.println("第二步 调用set方法 设置属性值");
        this.name = name;
    }

    public void initMethod() {
        System.out.println("第三部 执行初始化");
    }

    public void destoryMethod() {
        System.out.println("第五步 执行销毁");
    }

}

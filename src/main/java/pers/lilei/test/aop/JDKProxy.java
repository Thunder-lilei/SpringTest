package pers.lilei.test.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * <h3>SpringTest</h3>
 * <p></p>
 *
 * @author : 李雷
 * @date : 2020-12-08 16:52
 **/
public class JDKProxy {
    public static void main(String[] args) {
        //创建接口实现类代理对象
        Class[] interfaces = {UserDao.class};
//        Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new InvocationHandler() {
//            @Override
//            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//                return null;
//            }
//        });
        UserDaoImpl userDao = new UserDaoImpl();
        UserDao dao = (UserDao) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new UserDaoProxy(userDao));
        System.out.println(dao.add(1,2));
    }
}

//创建代理对象代码
class UserDaoProxy implements InvocationHandler {

    //创建的是谁的代理对象就把谁传递过来
    //有参构造函数传递
    private Object object;
    public UserDaoProxy(Object object) {
        this.object = object;
    }

    //增强的逻辑
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        //方法之前
        System.out.println("方法之前执行:"+method.getName()+" 传递的参数："+ Arrays.toString(args));

        //被增强方法执行
        Object res = method.invoke(object,args);

        //方法执行之后
        System.out.println("方法之后执行:"+object);

        return res;
    }
}

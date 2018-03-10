package service.impl;

import config.RootConfig;
import domain.A;
import domain.Account;
import domain.Entity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import java.util.Date;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration( classes = RootConfig.class)
public class ProjectServiceImplTest {
    @Autowired
    private AccountServiceImpl accountService;
    @Test
    public void test(){
        int id=1234567890;
        System.out.println(accountService.account(id));
    }

    @Test
   public void test1() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
//       // Class c=java.util.List.class;
//      //  Class c=Class.forName("java.util.List");
//        Class c=new Date().getClass();
//        Method[] methods=c.getDeclaredMethods();
//        for(Method method : methods){
//            System.out.println(method);
//        }
//
//        Class<Integer> c1=int.class;
//        Class<? extends Number> c2=int.class;
//        Class<double[]> c3=double[].class;
//
//        System.out.printf(String.valueOf(c1 == c2));
//
//        Object date=Date.class.newInstance();



        int a=A.class.getModifiers();
        System.out.println(a);
        System.out.printf(Modifier.toString(a));

    }

    @Test
    public   void test3(){
        Class a=A.class;
    //  Method[] moehod=  a.getMethods();//访问方法共有的
//        for(Method mo : moehod){
//        System.out.println(String.valueOf(mo));
//    }
       // Field[] fi=  a.getFields();//访问字段共有的
//        Field[] fields=  a.getDeclaredFields();//访问所有字段
//        for(Field f : fields){
//            System.out.println(String.valueOf(f));
//        }
//        Constructor[] constructors=a.getConstructors();//公有的构造器
//        Constructor[] constructors1=a.getDeclaredConstructors();//访问所有的构造器
//        for (Constructor c : constructors1){
//            System.out.println(c);
//        }
            System.out.println(a.getSuperclass().getName());
            Class[] c=a.getInterfaces();
            for (Class cc : c ){
                System.out.println(cc.getName());
            }
    }

    @Test
    public  void test4() throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class a=A.class;
       Field c= a.getDeclaredField("b");
       c.setAccessible(true);

       A a1=new A();
       c.set(a1,1);

       System.out.println(c.get(a1));


        Method method=a.getDeclaredMethod("c",String.class);
        method.setAccessible(true);
        method.invoke(a1,"abc");



    }

    @Test
    public  void test5() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class c1=A.class;
        Annotation[] annotations = c1.getDeclaredAnnotations();
        for (Annotation annotation : annotations)
            System.out.println(annotation);



        Constructor<A> constructor=c1.getDeclaredConstructor();
        A newa=constructor.newInstance();
        newa.d("123");

    }

    @Test
    public void test6(){
        int [] numbers=(int[])Array.newInstance(int.class,10);
        numbers[1]=1;
    }
    @Test
    public void test7() throws ClassNotFoundException {
        //Class c=A.class;
       //Class c1=Class.forName("domain.A");
       //   Class c2=new A().getClass();

    }

    @Test
    public void test8() throws ClassNotFoundException {
       Class c=A.class;

       ClassLoader appClassLoader=c.getClassLoader();
       System.out.println(appClassLoader);

       ClassLoader extClassLoader=appClassLoader.getParent();
       System.out.println(extClassLoader);

       ClassLoader bootStropCLassLoader=extClassLoader.getParent();
       System.out.print(bootStropCLassLoader);
    }
}
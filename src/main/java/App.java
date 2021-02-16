import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld newBean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(newBean.getMessage());

        Cat CatBean =
                (Cat) applicationContext.getBean("cat");
        System.out.println(CatBean.getName());

        Cat newCatBean =
                (Cat) applicationContext.getBean("cat");
        System.out.println(newCatBean.getName());

        System.out.println(bean == newBean);
        System.out.println(CatBean == newCatBean);

    }
}
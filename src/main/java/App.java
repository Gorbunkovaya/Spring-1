import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean1.getMessage());

        Cat newCat1 = (Cat) applicationContext.getBean("cat");
        System.out.println(newCat1.getName());
        Cat newCat2 = (Cat) applicationContext.getBean("cat");
        System.out.println(newCat2.getName());

        boolean compareHW = bean == bean1;
        boolean compareCat = newCat1 == newCat2;
        System.out.println(compareHW);
        System.out.println(compareCat);
    }
}
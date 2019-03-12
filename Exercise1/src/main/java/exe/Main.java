package exe;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");

        /*System.out.println(applicationContext.getBean("database"));

        exe.Restaurant restaurant = (exe.Restaurant) applicationContext.getBean("teaRestaurant");
        restaurant.getHotDrink().preparedHotDrink();

        exe.Restaurant restaurant1 = (exe.Restaurant) applicationContext.getBean("expressRestaurant");
        HotDrink hotDrink = restaurant1.getHotDrink();
        hotDrink.preparedHotDrink();

        exe.Complex complex = applicationContext.getBean(exe.Complex.class);
        System.out.println(complex);

        exe.Restaurant restaurant2 = (exe.Restaurant) applicationContext.getBean("teaRes");
        restaurant2.getHotDrink().preparedHotDrink();*/

/*
        exe.Restaurant restaurant3 = (exe.Restaurant) applicationContext.getBean("byType");
        restaurant3.getHotDrink().preparedHotDrink();
*/
        /*exe.Restaurant restaurant4 = (exe.Restaurant) applicationContext.getBean("byCons");
        restaurant4.getHotDrink().preparedHotDrink();
*/
        Restaurant restaurant5 = (Restaurant) applicationContext.getBean("restaurant");
        restaurant5.getHotDrink().preparedHotDrink();
    }
}

package exe;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

interface HotDrink {
    void preparedHotDrink();
}
@Component("tea")
class Tea implements HotDrink {
    @Override
    public void preparedHotDrink() {
        System.out.println("Preparing hot tea....");
    }
}
@Component("expresstea")
class ExpressTea implements HotDrink {
    @Override
    public void preparedHotDrink() {
        System.out.println("preparing hot express tea");
    }
}

@Component("restaurant")
public class Restaurant {

    @Autowired
    @Qualifier("tea")
    private HotDrink hotDrink;

    public Restaurant() {
    }

    //    @Autowired
    public Restaurant(HotDrink hotDrink) {
        this.hotDrink = hotDrink;
    }

    /* // Question 7
     @Required
     public void setHotDrink(exe.HotDrink hotDrink) {
         this.hotDrink = hotDrink;
     }
 */
    // Question 8
    @Autowired
    public void setHotDrink(HotDrink hotDrink) {
        this.hotDrink = hotDrink;
    }
    @Autowired
    public HotDrink getHotDrink() {
        return hotDrink;
    }
}

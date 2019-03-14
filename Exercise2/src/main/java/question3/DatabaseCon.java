package question3;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

@Setter
@Getter
public class DatabaseCon implements ApplicationEventPublisherAware {

    private Integer port;
    private String name;

    ApplicationEventPublisher applicationEventPublisher;
    public void connect(){
        CustomEvent customEvent = new CustomEvent(this);
        applicationEventPublisher.publishEvent(customEvent);
        System.out.println("<<<<<<<<<<<<<connecting>>>>>>>>>>>>>>>>>");
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }
}

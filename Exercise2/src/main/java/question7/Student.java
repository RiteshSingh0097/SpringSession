package question7;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Student {

    private Integer id;
    private String name;
    private String branch;
    private Integer age;

    public void details(String result){
        System.out.println("Id :"+id+" Name :"+name+" Age :"+age+" Branch :"+branch+" Result :"+result);
    }
}

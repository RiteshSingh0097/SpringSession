package question8;

import lombok.Getter;
import lombok.Setter;
@Setter
@Getter

public class Employee {

    private Integer empId;
    private String empName;

    public void empDetail(){
        System.out.println("EmpId : "+empId +", EmpName : "+empName);
    }
}

package exe;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Setter
@Getter
@ToString
public class Complex {
    List<Integer> list;
    Set<String> set;
    Map<Integer,String> map;
}

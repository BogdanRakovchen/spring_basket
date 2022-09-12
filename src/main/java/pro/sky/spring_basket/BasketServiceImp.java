package pro.sky.spring_basket;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Service
@SessionScope
public class BasketServiceImp {

    List<Set> basketList = new ArrayList<>();
    public Boolean add(Set setList){
      return basketList.add(setList);
    };
    public List get() {
         return basketList;
    };
}

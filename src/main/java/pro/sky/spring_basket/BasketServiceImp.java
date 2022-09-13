package pro.sky.spring_basket;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Service
@SessionScope

public class BasketServiceImp {

    List<Integer> basketList = new ArrayList<>(List.of());
    public Boolean add(Integer id){
      return basketList.add(id);

    };
    public List get() {
         return basketList;
    };
}

package pro.sky.spring_basket;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Service
@SessionScope
public class BasketServiceImp implements BasketInterface {

    List<Set> basketList = new ArrayList<>();
    @Override
    public Boolean add(Set setList){
      return basketList.add(setList);
    };
    @Override
    public List get() {
         return basketList;
    };
}

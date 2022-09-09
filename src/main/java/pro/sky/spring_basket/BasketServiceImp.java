package pro.sky.spring_basket;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@Scope("prototype")
public class BasketServiceImp implements BasketInterface {

    //Set<String> basket = new HashSet();
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

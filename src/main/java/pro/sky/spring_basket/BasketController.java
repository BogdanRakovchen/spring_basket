package pro.sky.spring_basket;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
@RequestMapping(path = "/order")
@RestController
public class BasketController {

    private final BasketServiceImp basketServiceImp;

    public BasketController(BasketServiceImp basketServiceImp) {
        this.basketServiceImp = basketServiceImp;
    }

    @GetMapping("/add")
    public void add(
            @RequestParam("id") Integer id) {
        basketServiceImp.add(id);
    }

    @GetMapping(path = "/get")
    public List get() {

        return basketServiceImp.get();
    }
}

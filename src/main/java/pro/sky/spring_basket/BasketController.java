package pro.sky.spring_basket;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
            @RequestParam("id") String id1,
            @RequestParam(value = "id", required = false) String id2,
            @RequestParam(value = "id", required = false) String id3
    ) {
        Set<String> list = new HashSet<>(List.of(id1, id2, id3));
        basketServiceImp.add(list);
    }

    @GetMapping(path = "/get")
    public List get() {
        return basketServiceImp.get();
    }
}

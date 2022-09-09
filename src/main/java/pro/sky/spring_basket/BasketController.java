package pro.sky.spring_basket;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
// rest
@RequestMapping(path = "/order")
@RestController
public class BasketController {

    private final BasketServiceImp basketServiceImp;
    private final ObjectMapper objectMapper;


    public BasketController(BasketServiceImp basketServiceImp, ObjectMapper objectMapper) {
        this.basketServiceImp = basketServiceImp;
        this.objectMapper = objectMapper;
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
    public List get() throws JsonProcessingException {

        return Collections.singletonList(objectMapper.writeValueAsString(basketServiceImp.get()));
    }
}

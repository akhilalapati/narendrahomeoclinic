package com.narendrahomeoclinic.webapp.Controller.Shop;

import com.narendrahomeoclinic.webapp.Model.Shop.ShopPost;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/Shop")
@RestController
public class ShopResource {

    @GetMapping("/home")
    public String getHome() {
        return "We are in Shop Profile";
    }

    @PostMapping("/addPost")
    public void addPost(@RequestBody ShopPost postDTO) {

    }
}

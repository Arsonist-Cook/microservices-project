package io.github.arsonistcook.shopping.cart.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@RedisHash("cart")
public class Cart {
    @Id
    private Integer id;
    private List<Item> items;

    public Cart(Integer id) {
        this.id = id;
    }
    public List<Item> getItems(){
        if(this.items == null){
            this.items = new ArrayList<>();
        }
        return this.items;
    }
}

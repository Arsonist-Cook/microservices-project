package io.github.arsonistcook.shopping.cart.repository;

import io.github.arsonistcook.shopping.cart.model.Cart;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends CrudRepository<Cart,Integer> {
    Cart findByCustomerId(Integer customerId);
}

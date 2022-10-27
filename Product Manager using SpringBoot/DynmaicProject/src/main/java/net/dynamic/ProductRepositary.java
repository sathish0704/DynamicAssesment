package net.dynamic;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepositary  extends JpaRepository<Product, Long> {

}

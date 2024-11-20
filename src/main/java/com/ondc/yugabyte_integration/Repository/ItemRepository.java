package com.ondc.yugabyte_integration.Repository;

import com.ondc.yugabyte_integration.Entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}

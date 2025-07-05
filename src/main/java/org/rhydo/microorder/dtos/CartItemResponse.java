package org.rhydo.microorder.dtos;

import lombok.Data;
import java.math.BigDecimal;

@Data
public class CartItemResponse {
    private Long id;
    private Long productId;
    private Integer quantity;
    private BigDecimal price;

}

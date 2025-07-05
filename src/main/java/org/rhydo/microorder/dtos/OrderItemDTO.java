package org.rhydo.microorder.dtos;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class OrderItemDTO {
    private Long id;
    private Long productId;
    private Integer quantity;
    private BigDecimal price;
}

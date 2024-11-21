package com.example.springvnpay.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentDto {
    @NotNull(message = "Grand total is required")
    private long grandTotal;

    @NotNull(message = "Order ID is required")
    private int orderId;
}

package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.flink.shaded.jackson2.com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.flink.shaded.jackson2.com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.math.BigDecimal;
import java.util.Objects;

@JsonSerialize
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Total {
    @JsonProperty("event_time")
    String eventTime;

    @JsonProperty("product_id")
    String productId;

    @JsonProperty("quantity")
    Integer quantity;

    @JsonProperty("total_purchases")
    BigDecimal totalPurchases;
}
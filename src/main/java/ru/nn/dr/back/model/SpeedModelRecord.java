package ru.nn.dr.back.model;

import java.math.BigDecimal;

public record SpeedModelRecord(
        Long id,
        Long frame,
        Long count,
        BigDecimal sum,
        BigDecimal min,
        BigDecimal max,
        BigDecimal avr
) {
}

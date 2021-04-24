package ru.nn.dr.back.model;

import java.math.BigDecimal;

public record YoloV4Record(
        Long id,
        Long frame,
        Long count,
        BigDecimal sum,
        BigDecimal min,
        BigDecimal max,
        BigDecimal n1,
        BigDecimal n2,
        BigDecimal n3,
        BigDecimal n4,
        BigDecimal n5,
        BigDecimal b1,
        BigDecimal b2,
        BigDecimal b3,
        BigDecimal b4,
        BigDecimal b5,
        BigDecimal avr,
        String cameraId
) {
}

package ru.nn.dr.back.model;

import java.math.BigDecimal;

public record OpenCvRecord(
        Long id,
        BigDecimal angleMagQuantile050,
        BigDecimal angleMax,
        BigDecimal angleMean,
        BigDecimal angleQuantile010,
        BigDecimal angleQuantile025,
        BigDecimal angleQuantile070,
        Long frame,
        BigDecimal magnitudeMax,
        BigDecimal magnitudeMean,
        BigDecimal magnitudeQuantile010,
        BigDecimal magnitudeQuantile025,
        BigDecimal magnitudeQuantile050,
        BigDecimal magnitudeQuantile070
) {
}

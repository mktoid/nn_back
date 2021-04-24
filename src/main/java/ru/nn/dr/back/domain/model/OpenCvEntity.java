package ru.nn.dr.back.domain.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name = "open_cv")
public class OpenCvEntity extends BaseEntity<Long> {

    @Column(name = "angle_mag_quantile_050")
    private BigDecimal angleMagQuantile050;

    @Column(name = "angle_max")
    private BigDecimal angleMax;

    @Column(name = "angle_mean")
    private BigDecimal angleMean;

    @Column(name = "angle_quantile_010")
    private BigDecimal angleQuantile010;

    @Column(name = "angle_quantile_025")
    private BigDecimal angleQuantile025;

    @Column(name = "angle_quantile_070")
    private BigDecimal angleQuantile070;

    @Column(name = "frame")
    private Long frame;

    @Column(name = "magnitude_max")
    private BigDecimal magnitudeMax;

    @Column(name = "magnitude_mean")
    private BigDecimal magnitudeMean;

    @Column(name = "magnitude_quantile_010")
    private BigDecimal magnitudeQuantile010;

    @Column(name = "magnitude_quantile_025")
    private BigDecimal magnitudeQuantile025;

    @Column(name = "magnitude_quantile_050")
    private BigDecimal magnitudeQuantile050;

    @Column(name = "magnitude_quantile_070")
    private BigDecimal magnitudeQuantile070;

    @Column(name = "camera_id")
    private String cameraId;

}

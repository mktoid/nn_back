package ru.nn.dr.back.domain.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name = "yolo_v4")
public class YoloV4Entity extends BaseEntity<Long>{

    @Column(name = "frame")
    private Long frame;

    @Column(name = "count")
    private Long count;

    @Column(name = "sum")
    private BigDecimal sum;

    @Column(name = "min")
    private BigDecimal min;

    @Column(name = "max")
    private BigDecimal max;

    @Column(name = "n1")
    private BigDecimal n1;

    @Column(name = "n2")
    private BigDecimal n2;

    @Column(name = "n3")
    private BigDecimal n3;

    @Column(name = "n4")
    private BigDecimal n4;

    @Column(name = "n5")
    private BigDecimal n5;

    @Column(name = "b1")
    private BigDecimal b1;

    @Column(name = "b2")
    private BigDecimal b2;

    @Column(name = "b3")
    private BigDecimal b3;

    @Column(name = "b4")
    private BigDecimal b4;

    @Column(name = "b5")
    private BigDecimal b5;

    @Column(name = "avr")
    private BigDecimal avr;

    @Column(name = "camera_id", nullable = false)
    private String cameraId;

}

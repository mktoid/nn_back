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
@Table(name = "speed_model")
public class SpeedModelEntity extends BaseEntity<Long> {

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

    @Column(name = "avr")
    private BigDecimal avr;

    @Column(name = "camera_id")
    private String cameraId;
}

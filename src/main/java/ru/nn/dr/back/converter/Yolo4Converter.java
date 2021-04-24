package ru.nn.dr.back.converter;

import org.modelmapper.Converter;
import org.modelmapper.spi.MappingContext;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import ru.nn.dr.back.domain.model.YoloV4Entity;
import ru.nn.dr.back.model.YoloV4Record;

@Transactional
@Component
public class Yolo4Converter implements Converter<YoloV4Entity, YoloV4Record> {
    @Override
    public YoloV4Record convert(MappingContext<YoloV4Entity, YoloV4Record> mappingContext) {
        return new YoloV4Record(
                mappingContext.getSource().getId(),
                mappingContext.getSource().getFrame(),
                mappingContext.getSource().getCount(),
                mappingContext.getSource().getSum(),
                mappingContext.getSource().getMin(),
                mappingContext.getSource().getMax(),
                mappingContext.getSource().getN1(),
                mappingContext.getSource().getN2(),
                mappingContext.getSource().getN3(),
                mappingContext.getSource().getN4(),
                mappingContext.getSource().getN5(),
                mappingContext.getSource().getB1(),
                mappingContext.getSource().getB2(),
                mappingContext.getSource().getB3(),
                mappingContext.getSource().getB4(),
                mappingContext.getSource().getB5(),
                mappingContext.getSource().getAvr(),
                mappingContext.getSource().getCameraId()
        );
    }
}

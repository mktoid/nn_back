package ru.nn.dr.back.converter;

import org.modelmapper.Converter;
import org.modelmapper.spi.MappingContext;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import ru.nn.dr.back.domain.model.SpeedModelEntity;
import ru.nn.dr.back.model.SpeedModelRecord;

@Transactional
@Component
public class SpeedModelConverter implements Converter<SpeedModelEntity, SpeedModelRecord> {
    @Override
    public SpeedModelRecord convert(MappingContext<SpeedModelEntity, SpeedModelRecord> mappingContext) {
        return new SpeedModelRecord(
                mappingContext.getSource().getId(),
                mappingContext.getSource().getFrame(),
                mappingContext.getSource().getCount(),
                mappingContext.getSource().getSum(),
                mappingContext.getSource().getMin(),
                mappingContext.getSource().getMax(),
                mappingContext.getSource().getAvr()
        );
    }
}

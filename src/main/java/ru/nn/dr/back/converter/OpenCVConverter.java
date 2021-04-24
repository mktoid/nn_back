package ru.nn.dr.back.converter;

import org.modelmapper.Converter;
import org.modelmapper.spi.MappingContext;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import ru.nn.dr.back.domain.model.OpenCvEntity;
import ru.nn.dr.back.model.OpenCvRecord;

@Transactional
@Component
public class OpenCVConverter implements Converter<OpenCvEntity, OpenCvRecord> {
    @Override
    public OpenCvRecord convert(MappingContext<OpenCvEntity, OpenCvRecord> mappingContext) {
        return new OpenCvRecord(
                mappingContext.getSource().getId(),
                mappingContext.getSource().getAngleMagQuantile050(),
                mappingContext.getSource().getAngleMax(),
                mappingContext.getSource().getAngleMean(),
                mappingContext.getSource().getAngleQuantile010(),
                mappingContext.getSource().getAngleQuantile025(),
                mappingContext.getSource().getAngleQuantile070(),
                mappingContext.getSource().getFrame(),
                mappingContext.getSource().getMagnitudeMax(),
                mappingContext.getSource().getMagnitudeMean(),
                mappingContext.getSource().getMagnitudeQuantile010(),
                mappingContext.getSource().getMagnitudeQuantile025(),
                mappingContext.getSource().getMagnitudeQuantile050(),
                mappingContext.getSource().getMagnitudeQuantile070()
        );
    }
}

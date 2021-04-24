package ru.nn.dr.back.service;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.nn.dr.back.domain.repository.OpenCvRepository;
import ru.nn.dr.back.domain.repository.SpeedModelRepository;
import ru.nn.dr.back.domain.repository.YoloV4Repository;
import ru.nn.dr.back.model.OpenCvRecord;
import ru.nn.dr.back.model.SpeedModelRecord;
import ru.nn.dr.back.model.YoloV4Record;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Transactional
@Service
public class ModelResultService {

    private final ModelMapper modelMapper;
    private final SpeedModelRepository speedModelRepository;
    private final OpenCvRepository openCvRepository;
    private final YoloV4Repository yoloV4Repository;

    public List<SpeedModelRecord> getAllSpeedModelResult(String cameraId) {
        return speedModelRepository.findAllByCameraId(cameraId).stream()
                .map(speedModelEntity -> modelMapper.map(speedModelEntity, SpeedModelRecord.class))
                .collect(Collectors.toList());
    }

    public List<OpenCvRecord> getAllOpenCVModelResult(String cameraId) {
        return openCvRepository.findAllByCameraId(cameraId).stream()
                .map(openCvEntity -> modelMapper.map(openCvEntity, OpenCvRecord.class))
                .collect(Collectors.toList());
    }

    public List<YoloV4Record> getAllYolo4ModelResult(String cameraId) {
        return yoloV4Repository.findAllByCameraId(cameraId).stream()
                .map(yoloV4Entity -> modelMapper.map(yoloV4Entity, YoloV4Record.class))
                .collect(Collectors.toList());
    }
}

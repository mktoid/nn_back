package ru.nn.dr.back.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.nn.dr.back.domain.model.OpenCvEntity;
import ru.nn.dr.back.domain.model.SpeedModelEntity;
import ru.nn.dr.back.domain.model.YoloV4Entity;
import ru.nn.dr.back.domain.repository.OpenCvRepository;
import ru.nn.dr.back.domain.repository.SpeedModelRepository;
import ru.nn.dr.back.domain.repository.YoloV4Repository;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Transactional
@Service
public class InfoService {

    private final SpeedModelRepository speedModelRepository;
    private final OpenCvRepository openCvRepository;
    private final YoloV4Repository yoloV4Repository;

    public Set<String> camList() {
        Set<String> result = new HashSet<>();
        result.addAll(speedModelRepository.findAll().stream()
                .map(SpeedModelEntity::getCameraId).collect(Collectors.toSet()));
        result.addAll(openCvRepository.findAll().stream()
                .map(OpenCvEntity::getCameraId).collect(Collectors.toSet()));
        result.addAll(yoloV4Repository.findAll().stream()
                .map(YoloV4Entity::getCameraId).collect(Collectors.toSet()));
        return result;
    }

    public List<String> methods() {
        return Arrays.asList("speed_model", "open_cv", "yolo_v4");
    }
}

package ru.nn.dr.back.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.nn.dr.back.model.OpenCvRecord;
import ru.nn.dr.back.model.SpeedModelRecord;
import ru.nn.dr.back.model.YoloV4Record;
import ru.nn.dr.back.service.ModelResultService;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/models")
public class ModelResultController {

    private final ModelResultService modelResultService;

    @GetMapping("/speed_model/{cameraId}")
    public ResponseEntity<List<SpeedModelRecord>> speedListResponseEntity(@PathVariable String cameraId) {
        return ResponseEntity.ok(modelResultService.getAllSpeedModelResult(cameraId));
    }

    @GetMapping("/open_cv/{cameraId}")
    public ResponseEntity<List<OpenCvRecord>> openCvListResponseEntity(@PathVariable String cameraId) {
        return ResponseEntity.ok(modelResultService.getAllOpenCVModelResult(cameraId));
    }

    @GetMapping("/yolo_v4/{cameraId}")
    public ResponseEntity<List<YoloV4Record>> yoloV4ListResponseEntity(@PathVariable String cameraId) {
        return ResponseEntity.ok(modelResultService.getAllYolo4ModelResult(cameraId));
    }
}

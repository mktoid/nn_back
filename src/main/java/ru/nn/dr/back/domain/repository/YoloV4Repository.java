package ru.nn.dr.back.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import ru.nn.dr.back.domain.model.YoloV4Entity;

import java.util.List;

public interface YoloV4Repository extends JpaRepository<YoloV4Entity, Long>, JpaSpecificationExecutor<YoloV4Entity> {

    List<YoloV4Entity> findAllByCameraId(String cameraId);
}
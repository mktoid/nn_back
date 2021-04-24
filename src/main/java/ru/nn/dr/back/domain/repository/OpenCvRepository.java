package ru.nn.dr.back.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import ru.nn.dr.back.domain.model.OpenCvEntity;

import java.util.List;

public interface OpenCvRepository extends JpaRepository<OpenCvEntity, Void>, JpaSpecificationExecutor<OpenCvEntity> {

    List<OpenCvEntity> findAllByCameraId(String cameraId);
}
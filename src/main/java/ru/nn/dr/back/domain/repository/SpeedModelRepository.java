package ru.nn.dr.back.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import ru.nn.dr.back.domain.model.SpeedModelEntity;

import java.util.List;

public interface SpeedModelRepository extends JpaRepository<SpeedModelEntity, Void>, JpaSpecificationExecutor<SpeedModelEntity> {

    List<SpeedModelEntity> findAllByCameraId(String cameraId);

}
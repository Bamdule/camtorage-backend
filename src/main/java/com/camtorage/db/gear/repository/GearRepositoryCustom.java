package com.camtorage.db.gear.repository;

import com.camtorage.entity.gear.GearImageVO;
import com.camtorage.entity.gear.GearResponse;

import java.util.List;

public interface GearRepositoryCustom {

    public List<GearImageVO> getListGearImage(Integer gearId);

    public GearImageVO getGearImage(Integer gearId);

    public List<GearResponse> getListGear(Integer userId);

    public long getCountGear(Integer userId);

    GearResponse getGearById(Integer userId, Integer gearId);

}

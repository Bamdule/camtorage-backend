package com.camtorage.entity.gear;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class GearImageWrap {
    private List<GearImageTO> gearImages = new ArrayList<>();
}

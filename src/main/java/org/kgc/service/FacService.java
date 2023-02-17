package org.kgc.service;

import org.kgc.utils.FacBaseMapper;

import java.util.HashMap;
import java.util.List;

public class FacService {
    public List<HashMap> getFacs(){

        return FacBaseMapper.getMapper().getFacs();

    }
}

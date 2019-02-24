package com.caihua.service.impl;

import com.caihua.bean.Position;
import com.caihua.mapper.PositionMapper;
import com.caihua.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PositionServiceImpl implements PositionService {
    @Autowired
    private PositionMapper positionMapper;
    @Override
    public Position findPosition(int pid) {
        return positionMapper.findPosition(pid);
    }

    @Override
    public void addPosition(Position position) {
        positionMapper.addPosition(position);
    }
}

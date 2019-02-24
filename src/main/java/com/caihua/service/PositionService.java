package com.caihua.service;

import com.caihua.bean.Position;

public interface PositionService {
    public Position findPosition(int pid);

    public void addPosition(Position position);
}

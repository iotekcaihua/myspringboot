package com.caihua.service;

import com.caihua.bean.Position;

public interface PositionService {
    Position findPosition(int pid);

    void addPosition(Position position);
}

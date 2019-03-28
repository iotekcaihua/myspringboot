package com.caihua.mapper;

import com.caihua.bean.Position;
import org.springframework.stereotype.Repository;

@Repository
public interface PositionMapper {
    Position findPosition(int pid);

    void addPosition(Position position);
}

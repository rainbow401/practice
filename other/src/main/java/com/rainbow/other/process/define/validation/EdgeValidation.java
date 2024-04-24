package com.rainbow.other.process.define.validation;

import com.rainbow.other.process.define.element.Base;
import com.rainbow.other.process.define.element.BaseType;

import java.util.List;
import java.util.Objects;

/**
 * @Author: yzh
 * @Date: 2023/9/20
 * @Description:
 */
public class EdgeValidation implements ProcessValidation {

    @Override
    public void valid(List<Base> nodes) {
        int edgeCount = 0;
        for (Base node : nodes) {
            BaseType baseType = node.getBaseType();
            if (Objects.equals(baseType, BaseType.EDGE)) {
                edgeCount++;
            }
        }

        if (edgeCount == 0) {
            throw new IllegalStateException("The number of edges is 0");
        }
    }
}

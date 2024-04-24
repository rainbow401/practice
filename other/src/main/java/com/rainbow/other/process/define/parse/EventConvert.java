package com.rainbow.other.process.define.parse;

import com.fasterxml.jackson.databind.JsonNode;
import com.rainbow.other.process.define.element.Base;
import com.rainbow.other.process.define.element.BaseType;
import com.rainbow.other.process.define.element.BaseWithPosition;
import com.rainbow.other.process.define.element.Event;
import lombok.extern.slf4j.Slf4j;

/**
 * @Author: yzh
 * @Date: 2023/9/18
 * @Description:
 */
@Slf4j
public class EventConvert implements NodeConvert {

    @Override
    public Base parse(JsonNode node) {

        BaseWithPosition baseWithPosition = convertBaseWithPosition(node);
        return new Event(baseWithPosition);
    }

    @Override
    public String getSupportType() {
        return BaseType.EVENT.getShape();
    }
}

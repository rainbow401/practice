package com.rainbow.other.process.define;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.rainbow.other.process.define.element.Base;
import com.rainbow.other.process.define.parse.ProcessDefineParser;
import lombok.Data;

/**
 * @Author: yzh
 * @Date: 2023/9/20
 * @Description:
 */
@Data
public class ProcessDefine {

    private String key;

    private String name;

    private Base rootNode;

    private String description;

    public ProcessDefine() {
    }

    public ProcessDefine(String json) throws JsonProcessingException {
        ProcessDefineParser parser = ProcessDefineParser.createParser();
        this.rootNode = parser.parseDefine(json);
    }
}

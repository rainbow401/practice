package com.rainbow.other.process.define.element;

import com.rainbow.other.tree.Node;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @Author: yzh
 * @Date: 2023/9/19
 * @Description:
 */
@Getter
@Setter
public class BaseTreeNode implements Node<String, Base> {

    private String id;
    private String parentId;
    private List<Base> child;

}

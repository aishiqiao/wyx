package com.zkw.fedweb.dao.po;

import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@ToString
public class AttributeExt extends Attribute {
    List<AttributeExt> children;
}

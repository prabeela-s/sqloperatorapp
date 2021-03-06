package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Value;

import java.util.Map;
import java.util.Objects;

@Value
public class Insert {

    @JsonProperty(value = "table", required = true)
    Table table;

    @JsonProperty(value = "values", required = true)
    Map<String, Object> values;

    public String getIntoView() {
        return (Objects.isNull(table.getSchemaName()) || table.getSchemaName().isEmpty())
                ? table.getTableName() : table.getSchemaName() + "." + table.getTableName();
    }
}

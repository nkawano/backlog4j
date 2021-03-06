package com.nulabinc.backlog4j.internal.json.customFields;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.Arrays;
import java.util.List;

/**
 * @author nulab-inc
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CheckBoxCustomField extends CustomFieldJSONImpl {

    private int fieldTypeId = 7;
    private ListItem[] value;
    private String otherValue;

    @Override
    public int getFieldTypeId() {
        return fieldTypeId;
    }

    @Override
    public FieldType getFieldType() {
        return FieldType.valueOf(fieldTypeId);
    }

    public List<ListItem> getValue() {
        return Arrays.asList(value);
    }

    public String getOtherValue() {
        return otherValue;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != getClass()) {
            return false;
        }
        CheckBoxCustomField rhs = (CheckBoxCustomField) obj;
        return new EqualsBuilder()
                .append(getId(), rhs.getId())
                .append(getName(), rhs.getName())
                .append(this.fieldTypeId, rhs.fieldTypeId)
                .append(this.value, rhs.value)
                .append(this.otherValue, rhs.otherValue)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .append(getId())
                .append(getName())
                .append(fieldTypeId)
                .append(value)
                .append(otherValue)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", getId())
                .append("name", getName())
                .append("fieldTypeId", fieldTypeId)
                .append("value", value)
                .append("otherValue", otherValue)
                .toString();
    }


}

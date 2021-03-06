package com.nulabinc.backlog4j.api.option;

import com.nulabinc.backlog4j.internal.json.customFields.DateCustomFieldSetting;
import com.nulabinc.backlog4j.http.NameValuePair;

import java.util.List;

/**
 * Parameters for update date type custom field API.
 *
 * @author nulab-inc
 */
public class UpdateDateCustomFieldParams extends UpdateCustomFieldParams {

    public UpdateDateCustomFieldParams(Object projectIdOrKey, long customFiledId) {
        super(projectIdOrKey, customFiledId);
    }

    public UpdateDateCustomFieldParams min(String min) {
        parameters.add(new NameValuePair("min", min));
        return this;
    }

    public UpdateDateCustomFieldParams max(String max) {
        parameters.add(new NameValuePair("max", max));
        return this;
    }

    public UpdateDateCustomFieldParams initialValueType(DateCustomFieldSetting.InitialValueType initialValueType) {
        parameters.add(new NameValuePair("initialValueType", String.valueOf(initialValueType.getIntValue())));
        return this;
    }

    public UpdateDateCustomFieldParams initialDate(String initialDate) {
        parameters.add(new NameValuePair("initialDate", initialDate));
        return this;
    }

    public UpdateDateCustomFieldParams initialShift(int initialShift) {
        parameters.add(new NameValuePair("initialShift", String.valueOf(initialShift)));
        return this;
    }

    @Override
    public UpdateDateCustomFieldParams applicableIssueTypes(List<Long> applicableIssueTypes) {
        return (UpdateDateCustomFieldParams) super.applicableIssueTypes(applicableIssueTypes);
    }

    @Override
    public UpdateDateCustomFieldParams description(String description) {
        return (UpdateDateCustomFieldParams) super.description(description);
    }

    @Override
    public UpdateDateCustomFieldParams required(boolean required) {
        return (UpdateDateCustomFieldParams) super.required(required);
    }
}

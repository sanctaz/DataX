package com.alibaba.datax.plugin.writer.kuduwriter;

import com.alibaba.datax.common.spi.ErrorCode;

public enum KuduWriterErrorCode
        implements ErrorCode
{
    REQUIRED_VALUE("Kuduwriter-00", "You are missing a required parameter value."),
    ILLEGAL_VALUE("Kuduwriter-01", "You fill in the parameter values are not legitimate."),
    GET_KUDU_CONNECTION_ERROR("Kuduwriter-02", "Error getting Kudu connection."),
    GET_KUDU_TABLE_ERROR("Kuduwriter-03", "Error getting Kudu table."),
    CLOSE_KUDU_CONNECTION_ERROR("Kuduwriter-04", "Error closing Kudu connection."),
    CLOSE_KUDU_SESSION_ERROR("Kuduwriter-06", "Error closing Kudu table connection."),
    PUT_KUDU_ERROR("Kuduwriter-07", "IO exception occurred when writing to Kudu."),
    DELETE_KUDU_ERROR("Kuduwriter-08", "An exception occurred while delete Kudu table."),
    GREATE_KUDU_TABLE_ERROR("Kuduwriter-09", "Error creating Kudu table."),
    PARAMETER_NUM_ERROR("Kuduwriter-10", "The number of parameters does not match."),
    TABLE_NOT_EXISTS("Kuduwriter-11", "The table you specified does not exists yet");

    private final String code;
    private final String description;

    KuduWriterErrorCode(String code, String description)
    {
        this.code = code;
        this.description = description;
    }

    @Override
    public String getCode()
    {
        return code;
    }

    @Override
    public String getDescription()
    {
        return description;
    }
}

package com.factory.chain.ticket;

/**
 * @author chun zao
 * 2021/5/24 7:49 下午
 **/
public class EmployeeRequestTicket {

    /**
     * 姓名
     */
    private String name;
    /**
     * 天数
     */
    private int leaveDays;

    public EmployeeRequestTicket(final String name, final int leaveDays) {
        this.name = name;
        this.leaveDays = leaveDays;
    }

    public int getLeaveDays() {
        return leaveDays;
    }

    public void setLeaveDays(final int leaveDays) {
        this.leaveDays = leaveDays;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }
}

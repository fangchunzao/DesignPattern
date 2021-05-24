package com.factory.chain.ticket;

/**
 * @author chun zao
 * 2021/5/24 7:57 下午
 **/
public class DeptLeaderHandler extends AbstractTicketHandler {

    public DeptLeaderHandler(final String name) {
        this.handlerName = name;
    }

    @Override
    boolean handlerRequest(final EmployeeRequestTicket request) {
        if (request.getLeaveDays() > DIRECT_DAY && request.getLeaveDays() <= DEPT_DAY) {
            System.out.println("部门经理:" + handlerName + ",已经处理; 流程结束");
            return true;
        }
        return false;
    }
}

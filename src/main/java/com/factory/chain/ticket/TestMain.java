package com.factory.chain.ticket;

/**
 * @author chun zao
 * 2021/5/24 8:03 下午
 **/
public class TestMain {

    public static void main(final String[] args) {
        final EmployeeRequestTicket request = new EmployeeRequestTicket("小明", 99);

        final AbstractTicketHandler directHandler = new DirectLeaderHandler("A");
        final AbstractTicketHandler deptHandler = new DeptLeaderHandler("B");
        final AbstractTicketHandler managerHandler = new ManagerLeaderHandler("C");

        directHandler.setNextHandler(deptHandler);
        deptHandler.setNextHandler(managerHandler);

        directHandler.process(request);
    }

}

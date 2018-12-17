package javalessons5.gof23.demo15mediator;

public interface Department {
	void selfAction();// 做本部门的事

	void outAction();// 向总经理发出申请
}

package com.company;

public class Boss extends Human {
    private String department;

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        String human = super.toString();
        human = human.replace("Human", "Boss");
        human = human.replace("}", ", department='" + department + "\' }");
        return human;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}

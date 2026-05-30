package com.pratic;

public class Badge {
    public String print(Integer id, String name, String department) {

        if (department == null){
            department = "OWNER";
        }
        if (id == null){
            return String.format(name + " - " + department.toUpperCase());
        }
        String result = String.format( "["+id+"]" + " - "+ name + " - " + department.toUpperCase());

        return result;
    }
}


package com.example.hosein.pracrice9;

/**
 * Created by Hosein on 12/3/2016.
 */

public class Controler {

    public boolean controlstudent(Student student){

        if (student.name.equals("admin")&& student.family.equals("admin1")){

            return true;

        }
        else
            return false;

    }

    public boolean controlteacher(Teacher teacher){

        if (teacher.name.equals("admin")&& teacher.family.equals("admin1")){

            return true;

        }
        else
            return false;

    }

}

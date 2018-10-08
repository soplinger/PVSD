package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Student Winston = new Student(2.1, "Winston");
        Student Jake = new Student(1.2, "Jake");
        Student Bennett = new Student(3.2, "Bennett");
        Student Brian = new Student(3.4, "Brian");
        Student Pennebacker = new Student(10000, "Pennebacker");


        Vector<Student> st = new Vector<>();
        st.add(Winston);
        st.add(Jake);
        st.add(Bennett);
        st.add(Brian);
        st.add(Pennebacker);

        Vector<Student> TopStudents = new Vector<>();

        for (int i = 0; i < 3; i++) {
            double highestGPA = 0.0;
            Student highestStudent = null;

            for (int a = 0; a < st.size(); a++) {


                if (st.get(a).gpa > highestGPA) ;
                {
                    highestGPA = st.get(a).gpa;
                    highestStudent = st.get(a);

                }
            }
            TopStudents.add(highestStudent);
            st.remove(highestStudent);
        }

           for (Student hs : TopStudents){
               System.out.println(hs.name + " | " + hs.gpa);


        }


    }
}

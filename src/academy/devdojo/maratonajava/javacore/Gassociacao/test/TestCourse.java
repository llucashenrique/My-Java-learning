package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Course;

public class TestCourse {
    public static void main(String[] args) {
        Course[] courses = {
                new Course("JavaScript", "3 month", "intermediary"),
                new Course("HTML and CSS", "2 month", "Basic"),
                new Course( "React",  "4 month", "Advanced")
        };

        System.out.println("Which course with duration of 4 months? ");
        for (Course cours : courses) {
            if (cours.getDuration().equals("4 month")){
                System.out.println("The course that have duration of 4 months is: "+cours.getName());
                break;
            }
        }

        System.out.println("---------------------------------------------------");

        System.out.println("How is the level of course 'HTML and CSS'? ");
        for (Course cours : courses) {
            if (cours.getName().equals("HTML and CSS")){
                System.out.println("The level of HTML and CSS is: "+cours.getLevel());
                break;
            }
        }

        System.out.println("----------------------------------------------------------");

        System.out.println("How long is duration of course JavaScript? ");
        for (Course cours : courses) {
            if (cours.getName().equals("JavaScript")) {
                System.out.println("The duration is: "+cours.getDuration());
                break;
            }
        }


    }
}

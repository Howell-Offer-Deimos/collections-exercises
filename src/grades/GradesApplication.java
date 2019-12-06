package grades;

import util.Input;

import java.util.HashMap;

public class GradesApplication {

    static HashMap<String, Student> students = new HashMap<>();
    static Input input = new Input();

    public static void main(String[] args) {

        Student alyssa = new Student("Alyssa");
        alyssa.addGrade(100);
        alyssa.addGrade(98);
        alyssa.addGrade(100);
        alyssa.addGrade(99);

        Student William = new Student("Will");
        William.addGrade(100);
        William.addGrade(90);
        William.addGrade(95);
        William.addGrade(95);

        Student carson = new Student("Carson");
        carson.addGrade(100);
        carson.addGrade(85);
        carson.addGrade(90);
        carson.addGrade(85);

        Student holly = new Student("Holly");
        holly.addGrade(85);
        holly.addGrade(90);
        holly.addGrade(80);
        holly.addGrade(100);

        students.put("sufuninja", William);
        students.put("carsonblew", carson);
        students.put("dokuninja", holly);
        students.put("thebestwifeever", alyssa);

        System.out.println("Welcome to the student portal!\n");



        boolean cont = true;

        do{
            showStudents();

            String key = input.getString("Which student would you like to see more information on?");

            if(students.containsKey(key)){
                System.out.println("Name: "+ students.get(key).getName() +" - GitHub Username: " + key );
                System.out.println("Current Average: " + students.get(key).getGradeAverage());
            } else {
                System.out.println("Sorry, no student found with the GitHub username of " + key);
            }
            System.out.println("would you like to see another student?");
            cont = input.yesNo();

        }while(cont);

        System.out.println("Goodbye friend!\n");

    }

    public static void showStudents(){
        System.out.println("Here are the GitHub user names of our students:\n");
        for (String username : students.keySet()) {
            System.out.print(username + "\n");
        }
        System.out.println();
    }
}
public class runner {
        public static void main(String[] args){
            school berkeleyHigh= new school("Berkeley High");

            section math = new section("Math");
            section biology = new section("Biology");
            section computerScience = new section("Computer Science");

            teacher albinson = new teacher("Computer Science", "Albinson", 1);
            teacher goodrich = new teacher("Math", "Goodrich", 2);
            teacher wolkenfeld = new teacher("Biology", "Wolkenfeld", 3);

            student henry = new student("Dylan", 4, 12);
            student royce = new student("Royce", 5, 11);
            student phil = new student("Phil", 6, 9);
            student jack = new student("Jack", 7, 13);
            student dylan = new student("Anoosh", 8, 10);
            student noe = new student("Isaac", 9, 17);

            math.setTeacher(goodrich);
            math.addStudent(henry);
            math.addStudent(jack);
            math.addStudent(phil);
            math.toStr();

        }


    }

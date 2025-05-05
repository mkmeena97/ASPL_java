package collection;

import java.util.*;
class StringLegthComparator implements Comparator<String>{

    public int compare(String s1, String s2){

        return s2.length()-s1.length();
    }
}

class MyComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2-o1;
    }
    
}

class Student{
    private String name;
    private double cgpa;

    public Student(String name, double cgpa ){
        this.name=name;
        this.cgpa=cgpa;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getCgpa() {
        return cgpa;
    }
    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }
   
}

public class ComparatorExample {
    //Comparator comapares two object of same type

    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<>(25);
        list.add(2);
        list.add(1);
        list.add(3);
        list.sort(new MyComparator());
        System.out.println(list);  // decending order sorting

        System.out.println("------------------------------------");

        List<String> words = Arrays.asList("Banana","Apple","Pineapple");
        words.sort(null);   // (assending order)Here comparator is comparing 2 objects of same type
        System.out.println("assending order sorting"+words);
        words.sort(new StringLegthComparator());
        System.out.println("decending order sorting"+words);

        System.out.println("------------------------------------");
        //using lambda expression 
        words.sort((a,b)->a.length()-b.length());

        System.out.println("using lambda expression"+words);

        System.out.println("------------------------------------");

        List<Student> students = new ArrayList<>();

        students.add(new Student("shyaam",6.5));
        students.add(new Student("mahendra",6.5));
        students.add(new Student("gopal",8.2));
        students.add(new Student("ram",5.9));
        students.add(new Student("mahi",9.5));

        // //using Lambda function
        // students.sort((o1,o2)->{
        //     if(o2.getCgpa()-o1.getCgpa()>0){
        //         return 1;
        //     } else if(o2.getCgpa()-o1.getCgpa()<0){
        //         return -1;
        //     }else{
        //         return o1.getName().compareTo(o2.getName());
        //     }
        // });

        //Using method reference
        Comparator<Student> comparator = Comparator.comparing(Student::getCgpa)
                                            .reversed()
                                            .thenComparing(Student::getName);
        students.sort(comparator);

        for(Student s : students){
        System.out.println(s.getName()+" "+s.getCgpa());
        }
    }
}

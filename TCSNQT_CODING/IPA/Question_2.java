package TCSNQT_CODING.IPA;
import java.util.List ;
import java.util.ArrayList ;
import java.util.Arrays ;
import java.util.Scanner;
/*
create the class Course with the below Attributes.

courseId- int
courseName- String
courseAdmin- String
quiz- int
handson -int

The above methods should be private ,write getter and
setter and parametrized constructor as required.

create class courseProgram with main method.

implement two static methods-
   findAvgOfQuizByAdmin method:this method will take array
of Course objects and a String  value as input parameters.
This method will find out Average (as int) of Quiz questions
for given Course Admin (String parametre passed)
This method will return Average if found.if there is no course
that matches then the method should return 0.

sortCourseByHandsOn method:
This method will take an Array of Course Objects and int
value as input parameters.
This methods should return an Array of Course objects in an
ascending order of their  handson which are less than the
given handson(int parameter passed) value. if there is no
such course then the method should return null.

The above mentioned static methods should be called from
main methods.

for findAvgOfQuizByAdmin method: The main method
should print the average if the returned value is not 0.
if the returned value is 0 then it should print "No Course
found."


for sortCourseByHandsOn method:
                        the  main method should print the name
of the Course from the returned Course object Array if the
returned value is not null.if the returned value is null then
it should print "No Course found with mentioned attribute."

input1:
111
kubernetes
Nisha
40
10
321
cassandra
Roshini
30
15
457
Apache Spark
Nisha
30
12
987
site core
Tirth
50
20
Nisha
17

output1:
35
kubernetes
Apache Spark
cassandra

input2:
111
kubernetes
Nisha
40
10
321
cassandra
Roshini
30
15
457
Apache Spark
Nisha
30
12
987
site core
Tirth
50
20
Shubhamk
5

output 2:
No Course found
No Course found with mentioned attributes.
 */
public class Question_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;
        Course[] courses = new Course[n] ;
        for (int i = 0 ; i < n ; i ++){
            int courseId = sc.nextInt() ;
            sc.nextLine() ;
            String courseName = sc.nextLine() ;
            String courseAdmin = sc.nextLine() ;
            int quiz = sc.nextInt() ;
            sc.nextLine() ;
            int handsOn = sc.nextInt() ;
            sc.nextLine() ;
            courses[i] = new Course(courseId,courseName,courseAdmin,quiz,handsOn) ;
        }
        String requiredCourseAdmin = sc.nextLine() ;
        int requiredHandsOn = sc.nextInt() ;
        sc.nextLine() ;
        getAnswers(courses,requiredCourseAdmin,requiredHandsOn);
    }
    private static void getAnswers(Course[] courses,String givenCourseAdmin,int givenHandsOn){
        int requiredAvg = findAvgOfQuizByAdmin(courses,givenCourseAdmin) ;
        if (requiredAvg == 0)
            System.out.println("No Course found");
        else
            System.out.println(requiredAvg);
        int[] requiredCourses = sortCourseByHandsOn(courses,givenHandsOn) ;
        if (requiredCourses.length == 0)
            System.out.println("No Course found with mentioned attribute");
        else {
            for (int val : requiredCourses){
                System.out.println(getCourseName(courses,val));
            }
        }
    }
    private static String getCourseName(Course[] courses,int handsOn){
        for (int i = 0 ; i < courses.length ; i ++){
            if (handsOn == courses[i].getHandsOn())
                return courses[i].getCourseName() ;
        }
        return "" ;
    }
    private static int findAvgOfQuizByAdmin(Course[] courses,String givenCourseAdmin) {
        int sumOfQuiz = 0 ;
        int count = 0 ;
        givenCourseAdmin = givenCourseAdmin.toLowerCase().trim() ;
        for (int i = 0 ; i < courses.length ; i ++){
            int currentQuiz = courses[i].getQuiz() ;
            String currentCourseAdmin = courses[i].getCourseAdmin() ;
            currentCourseAdmin = currentCourseAdmin.toLowerCase().trim() ;
            if (givenCourseAdmin.equals(currentCourseAdmin)){
                sumOfQuiz += currentQuiz ;
                count ++ ;
            }
        }

        return (count == 0) ? 0 : (sumOfQuiz / count) ;
    }
    private static int[] sortCourseByHandsOn(Course[] courses,int givenHandsOn){
        List<Integer> list = new ArrayList<>() ;

        for (int i = 0 ; i < courses.length ; i ++){
            int currentHandsOn = courses[i].getHandsOn() ;
            if (currentHandsOn < givenHandsOn){
                list.add(currentHandsOn) ;
            }
        }

        int[] arr = new int[list.size()] ;
        for (int i = 0 ; i < list.size() ; i ++){
            arr[i] = list.get(i) ;
        }
        Arrays.sort(arr) ;
        return arr ;
    }
}
class Course {
    private int courseId ;
    private String courseName ;
    private String courseAdmin ;
    private int quiz ;
    private int handsOn ;

    public Course(int courseId, String courseName, String courseAdmin, int quiz, int handsOn) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseAdmin = courseAdmin;
        this.quiz = quiz;
        this.handsOn = handsOn;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseAdmin() {
        return courseAdmin;
    }

    public void setCourseAdmin(String courseAdmin) {
        this.courseAdmin = courseAdmin;
    }

    public int getQuiz() {
        return quiz;
    }

    public void setQuiz(int quiz) {
        this.quiz = quiz;
    }

    public int getHandsOn() {
        return handsOn;
    }

    public void setHandsOn(int handsOn) {
        this.handsOn = handsOn;
    }
}
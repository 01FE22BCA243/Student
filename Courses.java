import java.util.*;
public class Student{
    public static void main(String[] args) {
        Courses student01 = new Courses(&quot;Kapil&quot;, &quot;Computer Application&quot;,
&quot;BCA&quot;);
        student01.registerCourse(&quot;Cpp Programmong&quot;, 39);
        student01.registerCourse(&quot;Web Development&quot;, 20);
        student01.registerCourse(&quot;Computer Networking&quot;, 14);
        //System.out.println(student01.course_and_marks.get(&quot;Cpp&quot;));
        student01.display_details();
        Courses student02 = new Courses(&quot;Chinnu&quot;,&quot;B.Sc&quot;, &quot;B.sc.CS&quot;);
        student02.registerCourse(&quot;Java&quot;, 92);
        student02.registerCourse(&quot;Python&quot;, 86);

Couse code : 22EBCP205 Course :
DevOps Lab

KLE Tech, Hubli Department of Computer
Application
        student02.registerCourse(&quot;Skill Development&quot;, 96);
        student02.display_details();
        // Retrieve the courses and marks for which students scored less than
40
        Map&lt;String, Integer&gt; kapilCoursesMarksLessThan40 =
student01.getCoursesMarksLessThan40();
        Map&lt;String, Integer&gt; chinnuCoursesMarksLessThan40 =
student02.getCoursesMarksLessThan40();
        // Display courses and marks less than 40 for Kapil
        System.out.println(&quot;Courses and Marks Less Than 40 for Kapil if any : &quot;);
        for (Map.Entry&lt;String, Integer&gt; entry :
kapilCoursesMarksLessThan40.entrySet()) {
                System.out.println(entry.getKey() + &quot; - &quot; + entry.getValue());    
        }
        System.out.println(&quot;End&quot;);
       
        // Display courses and marks less than 40 for Chinnu
        System.out.println(&quot;\nCourses and Marks Less Than 40 for Chinnu if any
: &quot;);
        for (Map.Entry&lt;String, Integer&gt; entry :
chinnuCoursesMarksLessThan40.entrySet()) {
                System.out.println(entry.getKey() + &quot; - &quot; + entry.getValue());
        }
        System.out.println(&quot;End&quot;);
    }
       
}
}

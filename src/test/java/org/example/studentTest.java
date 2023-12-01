package org.example;

import junit.framework.TestCase;
import org.junit.Assert;

public class studentTest extends TestCase {

    public void testFGrade(){
        int[] marks={34,23,38};
        student obj=new student(1,"Rhutik",marks);
        Assert.assertEquals("F",obj.getResult());
    }

    public void testEGrade(){
        int[] marks={45,50,48};
        student obj=new student(1,"Rhutik",marks);
        Assert.assertEquals("E",obj.getResult());
    }

    public void testDGrade(){
        int[] marks={52,56,58};
        student obj=new student(1,"Rhutik",marks);
        Assert.assertEquals("D",obj.getResult());
    }

    public void testCGrade(){
        int[] marks={67,65,66};
        student obj=new student(1,"Rhutik",marks);
        Assert.assertEquals("C",obj.getResult());
    }

    public void testBGrade(){
        int[] marks={77,75,76};
        student obj=new student(1,"Rhutik",marks);
        Assert.assertEquals("B",obj.getResult());
    }

    public void testAGrade(){
        int[] marks={89,90,95};
        student obj=new student(1,"Rhutik",marks);
        Assert.assertEquals("A",obj.getResult());
    }

}
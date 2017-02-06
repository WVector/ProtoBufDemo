package com.vector.protocoldemo;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        DBPerson.Person.Builder builder =  DBPerson.Person.newBuilder();

        builder.setAge(12);
        builder.setName("vector");

        DBPerson.Person person = builder.build();



        byte[] bytes = person.toByteArray();

        for (byte aByte : bytes) {
            System.out.println(aByte);
        }


        DBPerson.Person parseFrom = DBPerson.Person.parseFrom(bytes);

        System.out.println(parseFrom.toString());




        assertEquals(4, 2 + 2);
    }
}
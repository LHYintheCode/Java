package com.lhy.java;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author GhostintheCode
 * @create 15/3/20-2:25 下午
 */

public class TemplateTest {
    //prsf,pdf, pdfi,pdfs


    public static void main(String[] args) {

        System.out.println("sdfsda");
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("TemplateTest.main");
        System.out.println("args = " + args);
        //循环fori
//        for (int i = 0; i < arr.length; i++) {
//
//        }
        //iter
        for (String arg : args) {
            System.out.println();
        }
        //itar
        for (int i = 0; i < args.length; i++) {
            String arg = args[i];
            
        }
        //list.for
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(123);
        list.add(342);
        for (Object o : list) {
            
        }
        //list.fori
        for (int i = 0; i < list.size(); i++) {

        }
        //list.forr
        for (int i = list.size() - 1; i >= 0; i--) {

        }
        //ifn
        if (list == null) {

        }
        //inn
        if (list != null) {

        }




    }
}

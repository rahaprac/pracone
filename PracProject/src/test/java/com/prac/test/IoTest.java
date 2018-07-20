package com.prac.test;

import com.prac.utils.FileIoUtils;

public class IoTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        FileIoUtils fis = new FileIoUtils();
        String s = fis.readingData("/home/tsepak/Desktop/Untitled Document");
        System.out.println(s);
    }

}

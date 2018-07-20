package com.prac.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileIoUtils {

    public String readingData(String file1) {
        try {
            File file = new File(file1);
            FileReader fr = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fr);

            StringBuilder rString = new StringBuilder();

            String line;

            while ((line = bufferedReader.readLine()) != null) {
                rString.append(line);
                rString.append("\n");
            }
            fr.close();
            if (rString.length() == 0)
                return "file is empty";
            else
                return rString.toString();

        } catch (IOException e) {
            return "please give the right file path";
        }

    }

}

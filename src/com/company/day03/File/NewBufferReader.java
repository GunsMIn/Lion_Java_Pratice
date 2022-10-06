package com.company.day03.File;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class NewBufferReader {

    public void read() {
        try(BufferedReader br = Files.newBufferedReader(Paths.get("afile.txt"), StandardCharsets.UTF_8))
        {
            String line;
            while ((line = br.readLine()) != null) { // null이 아니면 읽어올 수 있다
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) {
        NewBufferReader newBufferedReader = new NewBufferReader();
        newBufferedReader.read();
    }
}

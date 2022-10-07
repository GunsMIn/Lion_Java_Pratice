package com.company.day04;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class PopulationStatistics {

    //한글짜식
    public void readBtChar(String filename) throws IOException {
        //파일위치
        FileReader fileReader = new FileReader(filename);
        //파일을 읽지 않는다.

        String fileCmotentes = "";
        while (fileCmotentes.length() < 1_000) {
            //read를 사용했을때 비로소 읽는다.
            char c = (char)fileReader.read(); // 한 글자만 읽어 오는 것
            fileCmotentes += c; // 1바이트씩 쌓기위해서
        }

        System.out.println("fileCmotentes :  " + fileCmotentes);
        //여기까지는 1바이트씩 읽기
        //1줄씩 읽기 기능

    }





    //파일의 주소를 파라미터로 받는 메소드
    public void readFileByLine(String fileName) throws IOException {
        //한줄씩 가져오는 코드
        BufferedReader reader = new BufferedReader(
                new FileReader(fileName) // 파일name에 해당하는 file의 경로
        );

        String str;
        while ((str = reader.readLine()) != null) {
            System.out.println(str);
        }
        reader.close();


    }

    //자바 8 스타일 파일 읽어오기
    public void readFileByLineV2(String filename) throws IOException {
        try (BufferedReader br = Files.newBufferedReader(
                Paths.get(filename), StandardCharsets.UTF_8
        )) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);

        }
    }



    //뽑아온 데이터를 Population으로 파싱하는 메소드
    public PopulationMove parse(String data) {
        String[] eachData = data.split(",");
        int fromSido = Integer.parseInt(eachData[0]);
        int toSido = Integer.parseInt(eachData[6]);
        return new PopulationMove(fromSido,toSido);
    }




    public static void main(String[] args) throws IOException {

        String address = "C:\\Users\\User\\Downloads\\2021_인구관련연간자료_20220927_66125.csv";
        PopulationStatistics2 statistics2 = new PopulationStatistics2();
        statistics2.readFileByLineV2(address);

    }
}

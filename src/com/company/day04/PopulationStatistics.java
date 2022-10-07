package com.company.day04;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class PopulationStatistics {

    //한글자씩
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


    //파일의 주소를 파라미터로 받는 메소드
    public List<PopulationMove> readFileByLine(String fileName) throws IOException {
        //한줄씩 가져오는 코드
        List<PopulationMove> pml = new ArrayList<>();
        BufferedReader reader = new BufferedReader(
                new FileReader(fileName) // 파일name에 해당하는 file의 경로
        );

        String str;
        while ((str = reader.readLine()) != null) {
            System.out.println(str);
            PopulationMove pm = parse(str); // 한 줄씩들어오는 str parsing
            pml.add(pm);
        }
        reader.close();
        return pml;
    }



    //뽑아온 데이터를 Population으로 파싱하는 메소드
    public PopulationMove parse(String data) {
        String[] eachData = data.split(",");
        return new PopulationMove(eachData[0],eachData[6]); // 생성자 오버로딩
    }


    //파일생성메소드
    public void createAFile(String filename) {
        File file = new File(filename);

        try {
            file.createNewFile(); // 이거까지 해줘야 파일이 생긴다
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }



    public static void main(String[] args) throws IOException {

        String address = "C:\\Users\\User\\Downloads\\2021_인구관련연간자료_20220927_66125.csv";
        PopulationStatistics statistics = new PopulationStatistics();

    /*    List<PopulationMove> pml = statistics.readFileByLine(address);

        for (PopulationMove pm : pml) {
            System.out.printf("전입:%s, 전출:%s\n", pm.getFromSido(), pm.getToSido());
        }
        System.out.println(pml.size());*/


        statistics.createAFile("./from_to.txt");


    }
}

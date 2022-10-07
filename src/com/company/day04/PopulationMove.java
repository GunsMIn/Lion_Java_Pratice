package com.company.day04;

public class PopulationMove {

    private int fromSido; // 전출
    private int toSido;   // 전입


    public PopulationMove(int fromSido, int toSido) {
        this.fromSido = fromSido;
        this.toSido = toSido;
    }

    //data(String)으로 넘어온 데이터를 parsing 생성자
    public PopulationMove(String fromSido, String toSido) {
        this.fromSido = Integer.parseInt(fromSido);
        this.toSido = Integer.parseInt(toSido);
    }


    public int getFromSido() {
        return fromSido;
    }

    public int getToSido() {
        return toSido;
    }


}

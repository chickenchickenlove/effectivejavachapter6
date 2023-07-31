package com.example.effetivejavachapter6.item35;

// SOLO = 1, DUET = 2.. 이런 식으로 이미 설정됨.
// 그런데 OCTET = 8임. 8명의 연주자를 의미하는 또 다른 상수 double quartet는 ordinal()를 이용해서 8을 반환받을 수 없음.
// 또한 enum에서 선언된 위치만 바뀌어도 값이 바뀌는 ㅜㅁㄴ제가 생김.
public enum EnsembleWrong {
    SOLO, DUET, TRIO, QUARTET, QUINTET, SEXTET, SEPTET, OCTET, NONET, DECTET;

    public int numberOfMusicians() {
        return ordinal() + 1;
    }
}

package com.hh.programmers.level0;

public class LoginSuccess {
    //로그인 성공?
//    정확성: 87.5
//    합계: 87.5 / 100.0
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        String id = id_pw[0];
        String pw = id_pw[1];

        for(int i = 0; i<db.length; i++){
            String db_id = db[i][0];
            String db_pw = db[i][1];
            if(db_id.equals(id)){
                if(db_pw.equals(pw)){
                    answer = "login";
                }else{
                    answer = "wrong pw";
                }
            }else{
                answer = "fail";
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] id_pw = {"meosseugi", "1234"};
        String[][] db = {{"rardss", "123"}, {"yyoom", "1234"}, {"meosseugi", "1234"}};
        LoginSuccess sol = new LoginSuccess();
        System.out.println(sol.solution(id_pw, db));

    }
}

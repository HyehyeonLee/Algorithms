package com.hh.programmers;

public class FindPrimeNum {
    //소수 찾기
    //1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환하는 함수, solution을 만들어 보세요.
    //소수는 1과 자기 자신으로만 나누어지는 수를 의미합니다.
    //(1은 소수가 아닙니다.)
    public FindPrimeNum(){
        super();
    }

    public int solution(int n) {
        //에라토스테네스의 체 사용
        int answer = 0;
        int prime[] = new int[1000000];

        for(int i = 2; i<=n; i++){
            prime[i] = i;
        }

        for(int i = 2; i<=n; i++){
            if(prime[i] == 0) continue;

            for(int j = i*2; j<=n; j+=i){
                prime[j] = 0;
            }
        }

        for(int i = 2; i<=n; i++){
            if(prime[i] != 0){
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        FindPrimeNum sol = new FindPrimeNum();
        System.out.println(sol.solution(10));
    }
}

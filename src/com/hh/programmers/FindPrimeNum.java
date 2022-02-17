package com.hh.programmers;

public class FindPrimeNum {
    //소수 찾기
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

#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int n) {
    int answer = 0;
    
    // n이 0이 될 때까지 반복
    while (n > 0) {
        answer += n % 10;  // 현재 자리 숫자를 더함
        n /= 10;          // 다음 자리로 이동
    }
    
    return answer;
}

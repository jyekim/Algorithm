function solution(numbers) {
    var answer = [];

    let cnt = 0; 
    while(cnt< numbers.length) {
        answer.push(numbers[cnt]*2)
        cnt++; 
    }
    return answer;
}


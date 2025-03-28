function solution(rsp) {
    
    const win = {
        "2":"0",
        "0":"5",
        "5":"2"
    }
    var answer = '';
    //하나씩 꺼내기?
    for(let i =0; i<rsp.length; i++){
        const item= rsp[i];
        answer += win[item]
       
    }   
    
    return answer;
}
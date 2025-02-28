function solution(money) {
    var coffee = 5500;
    var coffeeCnt = Math.floor(money/coffee);
    var moneyLeft = money % coffee;
        
    return [coffeeCnt, moneyLeft];
}
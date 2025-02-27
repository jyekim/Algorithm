function solution(slice, n) {
    var answer = 0;
    let pizzaAccount = 1;
    
    while(pizzaAccount*slice < n) {
            pizzaAccount++; 
        }
         return pizzaAccount;
    }
   


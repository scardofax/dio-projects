let canvas = document.getElementById("snake");
let context  = canvas.getContext("2d");
let box = 32;
let snake = [];
let nivel = 1;

snake[0] = {
    x: 8 * box,
    y: 8 * box
}

let direction = "direita";

let food = {
    x: Math.floor(Math.random() * 15 + 1) * box,
    y: Math.floor(Math.random() * 15 + 1) * box
}

function criarCampo() {
    context.fillStyle = "lightblue";
    context.fillRect(0, 0, 16 * box, 16 * box);    
}

function criarCobrinha(){    
    for(i=0;i < snake.length; i++){
        context.fillStyle = "black";
        context.fillRect(snake[i].x, snake[i].y, box, box);         
    }
}

function comida(){
    context.fillStyle = "red";
    context.fillRect(food.x, food.y, box, box);
}

document.addEventListener('keydown', (event) => {    

    if(event.keyCode == 37 && direction != "direita") direction = "esquerda";
    if(event.keyCode == 38 && direction != "abaixo") direction = "acima";
    if(event.keyCode == 39 && direction != "esquerda") direction = "direita";
    if(event.keyCode == 40 && direction != "acima") direction = "abaixo";

  });

function iniciarJogo() {    

    if(snake[0].x > 15 * box && direction == "direita") snake[0].x = 0;
    if(snake[0].x < 0 && direction == "esquerda") snake[0].x = 16 * box;
    if(snake[0].y > 15 * box && direction == "abaixo") snake[0].y = 0;
    if(snake[0].y < 0 && direction == "acima") snake[0].y = 16 * box;

    for(i = 1; i < snake.length; i++){
        if(snake[0].x == snake[i].x && snake[0].y == snake[i].y){
            clearInterval(jogo);
            alert("Game Over !! Nivel Alcançado: " + nivel);
        }
    }

    criarCampo();
    criarCobrinha();
    comida();
   
    let snakex = snake[0].x;
    let snakey = snake[0].y;

    if(direction == "direita") snakex += box;
    if(direction == "esquerda") snakex -= box;
    if(direction == "acima") snakey -= box;
    if(direction == "abaixo") snakey += box;

    if(snakex != food.x || snakey != food.y){
        snake.pop();
    }else{
        food.x = Math.floor(Math.random() * 15 + 1) * box;
        food.y =Math.floor(Math.random() * 15 + 1) * box
        nivel++;
    }
  
    let novaCabeca = {
        x: snakex,
        y: snakey
    }

    snake.unshift(novaCabeca);
}

let jogo = setInterval(iniciarJogo,100);
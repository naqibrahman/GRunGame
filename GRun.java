import processing.core.PApplet;


import java.util.*;

public class GRun extends PApplet {
	   int score = 0;
	   int gameover = 0;
	   ArrayList<Integer> Scores = new ArrayList<Integer>();

		//Game piecce
	   int x = 150;
	   int y = 250;
	  
	   
	   
	   //coin
	   int x2 =  (int) random(0,290);
	   int y2 = 0;
	   //obstacle
	   int x3 =  (int) random(0,290);
	   int y3 = -150;
	   //coin
	   int x4 =  (int) random(0,290);
	   int y4 = -300;
	   //obstacle
	   int x5 =  (int) random(0,290);
	   int y5 = -450;
	
	   
	   
	public int distance(int x1, int y1, int x2, int y2){
		return (int)Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
	}
 

	public void setup () {
		size (300 ,500); 
    	background(125);
	   
		}
	 public void draw() {
		 
		 if(gameover == 0){
			 int speed = (int)(score/10);
			 //white
		    fill(250);
		    
        	background(125);
        	//score
			text( score , 0, 100); 
			//game piece
		    ellipse(x, y, 30 ,30);
		    //coin1 
		    fill(30,105,130);
		    ellipse(x2,y2, 30,30);
		    y2= y2+(2+speed);
		    if(y2 > 500){
		    	x2 = (int) random(0,290);
		    	y2 = 0;
		    }
		    /// obstacle1
		    fill(125,10,13);
		    ellipse(x3,y3, 30,30);
		    y3= y3+(2+speed);
		    if(y3 > 500){
		    	x3 = (int) random(0,290);
		    	y3 = -125;
		    }
		    /// coin2 
		    fill(30,105,130);
		    ellipse(x4,y4, 30,30);
		    y4= y4+(2+speed);
		    if(y4 > 500){
		    	x4 = (int) random(0,290);
		    	y4 = -250;
		    }
		    /// obstacle2
		    fill(125,10,13);
		    ellipse(x5,y5, 30,30);
		    y5= y5+(2+speed);
		    if(y5 > 500){
		    	x5 = (int) random(0,290);
		    	y5 = -375;
		    }
		    
		    
//		    
//		    if (keyPressed) {
//
//		        if (keyCode == LEFT) {
//		        	if(x>0)
//				    x-=3;
//
//
//		        }  else if (keyCode == RIGHT) {
//		        	if(x<300)
//		        	x+=3;
//
//
//		        } else  if (keyCode == DOWN) {
//		        	if(y<500)
//		        	y+=3;
//
//
//		        } 
//		        else if (keyCode == UP) {
//		        	if(y>0)
//		        	y-=3;
//
//
//		        } 
//		        
//		        
//		        
		    
//		    }
		    
//		    if(mouseX>=0 &&mouseX<=300)
//		    	x= mouseX;
//		    else if (mouseX<0)
//		    	x+=3;
//		    else
//		    	x+=3;
//		    	
//		    if(mouseY>=0&& mouseY<=500 )
//		    	y= mouseY;
//		    else if (mouseY<0)
//		    	y--;
//		    else
//		    	y++;
		    
		    x=mouseX;
		    y=mouseY;
		    
		    if(distance(x,y,x2,y2)<30){
		    	x2 = (int) random(0,290);
		    	y2 = 0;
		    	score++;
		    	}
		    if(distance(x,y,x3,y3)<30){
		    	Scores.add(score);
				Collections.sort(Scores);;
		    	gameover = 1;
		    	}
		    if(distance(x,y,x4,y4)<30){
		    	x4 = (int) random(0,290);
		    	y4 = 0;
		    	score++;
		    	}
		    if(distance(x,y,x5,y5)<30){
		    	Scores.add(score);
				Collections.sort(Scores);;
		    	gameover = 1;
		    	}
	
		    
		    
		    
		 }
		 else if (gameover == 1)
		 {
			 
			 background(30);
			 fill(250);
			 text("Game Over!",0,55);
			 text("Score:", 0,100);
			 text( score , 70, 100); 
			 text("Press up to continiue",0,300);
			 text("Press down to save scores and exit",0,350);
			 text("High Score:"+Scores.get(Scores.size()-1),0,400);
			

	
			 
		 
			 if(keyPressed)
				 if(keyCode==UP)
				{
				x = 150;
			    y = 460;
			    x2 =  (int) random(0,290);
			    y2 = 0;
			    x3 =  (int) random(0,290);
			    y3 = -125;
			    x4 =  (int) random(0,290);
			    y4 = -250;
			    x5 =  (int) random(0,290);
			    y5 = -375;
			    score = 0;
			    gameover = 0;			 
			 
				}
				 else if (keyCode == DOWN){
					 gameover = 2;
				 }
					 

		 }
		 else{
			 
			 System.exit(0);

	 }

}

}
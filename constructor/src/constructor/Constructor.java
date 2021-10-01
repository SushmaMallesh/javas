package constructor;

public class Constructor {
	
	    int id;  
	    String name;  
	  
	    Constructor(int i,String n){  
	    id = i;  
	    name = n;  
	    }  
	   
	    Constructor(Constructor c){  
	    id = c.id;  
	    name =c.name;  
	    }  
	    
	    void display(){System.out.println(id+" "+name);}  
	   
	    public static void main(String args[]){  
	    	Constructor c1 = new Constructor(12,"aishuuuuu");  
	    	Constructor c2 = new Constructor(c1);  
	    c1.display();  
	   
	   }  
	}  


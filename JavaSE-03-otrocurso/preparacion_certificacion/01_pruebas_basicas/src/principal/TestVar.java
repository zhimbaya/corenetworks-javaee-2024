package principal;

import java.util.Arrays;
import java.util.List;

public class TestVar {
  static int i;	
  static boolean a1;
  static boolean b1;
  static boolean c1;
  static List<Integer> r;
  static String h;
  public static void main (String []args) {
	/* int ab = 2, ab = i+1;
	 
	 System.out.println("-----b " +ab);
	 if ((ab++>=++ab)) {
		ab +=ab;
		System.out.println("-----a " + ab);
		
		var j = 5;
		var i = 10;
		i +=(j*5 +j) /i-2;*/
		
		/*int x1=1;
		System.out.println("-----x " + x1);
		int y =2;
		System.out.println("-----y " + y);
		int z= x1++;
		System.out.println("-----z " + z);
		int a = --y;
		System.out.println("-----a " + a);
		int b = z--;
		System.out.println("-----bb " + b);
		b += ++z;
		System.out.println("-----b " + b);*/
		
		
		
			/*Integer data=10;
			int n=2;
			switch(data/n){
				case 1,3->System.out.print("low ");
				case 4,5-> System.out.print("medium ");
				case 6,7,9-> System.out.print("high");
			}
		
		
			class A{
				public void testA(){System.out.print("Is A ");}
			}
			class B extends A{
			public void testB(){System.out.print("Is B ");}
			}
			class C extends B{
			public void testC(){System.out.print("Is C ");}
			}
			//And the following:
			A ob=new C(); 
			if(ob instanceof B b){   
				b.testB();     //line 1
			}
			if(ob instanceof C a){//line 2
				a.testC();   			
			} else{
				ob.testA();  
			}*/
			//////////////////////////////////////
			class M1 {
				public M1 () {}		
			}
			class M2 extends M1{
				
				public M2 (int m) {}		
			}
		
			
				 int init = 11;
				 int split = 3;
				 int partA = init / split;
				 //System.out.println(init);
				 //System.out.println(split);
				 int partB = init % split;
				 System.out.println(split);
				 System.out.println(partB);
				 System.out.println(partA);
				 int result = split * (partB + partA);
				 System.out.print(result);
				 
				 
				 var sb = new StringBuilder();
				 sb.append("red");
				 sb.deleteCharAt(0);
				 sb.delete(1, 2);
				 System.out.println(sb);
				 
				 var babies = Arrays.asList("chick", "cygnet", "duckling");
				 babies.replaceAll(x -> { var newValue = "baby";
				  return newValue; });
				 System.out.println(babies);
				 
				 var builder = new StringBuilder("54321");
				 builder.substring(2);
				 System.out.println(builder.substring(2));
				 System.out.println(builder.charAt(0));
				 
				 int height = 2, length = 3;
				 boolean w = height > 1 | --length < 4;
				 var x = height!=2 ? length++ : height;
				 boolean z = height % length == 0;
				 System.out.println(w + "-" + x + "-" + z);
				
			
			
			
	 }
   }
 

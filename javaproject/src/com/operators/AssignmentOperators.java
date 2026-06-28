package com.operators;

public class AssignmentOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("main started started");
        
        //=
        int res=5; //=
        System.out.println(res); //5
        
        //Widening -> Implicit type casting
        //+=
        //res=res+2.5;  ->res=int(res+2.5) ->narrowing(explicit type casting)
        res+=2.5;  //here +=(assignment operator) is automatically done narrowing(explicit type casting).
        System.out.println(res); //5+2.5->7.5 -> 7
        
        //-=
        //res=res-2.5;  ->res=int(res-2.5) ->narrowing(explicit type casting)
        res-=2.5;  //here -=(assignment operator) is automatically done narrowing(explicit type casting).
        System.out.println(res); //7-2.5->4.5 -> 4
        
        //*=
        //res=res*2.5;  ->res=int(res*2.5) ->narrowing(explicit type casting)
        res*=2.5;  //here *=(assignment operator) is automatically done narrowing(explicit type casting).
        System.out.println(res); //4*2.5->10
        
        // /=
        //res=res/2.5;  ->res=int(res/2.5) ->narrowing(explicit type casting)
        res/=2.5;  //here /=(assignment operator) is automatically done narrowing(explicit type casting).
        System.out.println(res); //10/2.5 ->4
        
        //%=
        //res=res%2.5;  ->res=int(res%2.5) ->narrowing(explicit type casting)
        res%=2.5;  //here %=(assignment operator) is automatically done narrowing(explicit type casting).
        System.out.println(res); //4%2.5 -> 1

   }

}

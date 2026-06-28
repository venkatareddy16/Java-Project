package com.langfunda.constructors;
//this program invloves both copy constructor and constructor chaining.
public class MovieCopyAndChainingConstructors {
    int movieid;
    String moviename;
    String hero;
    double budget;
    public MovieCopyAndChainingConstructors() {
    	System.out.println("no arg construtor called");
    }
    public MovieCopyAndChainingConstructors(MovieCopyAndChainingConstructors m) {
    	System.out.println("obj ref variable construtor(copy) called");
    }
    public MovieCopyAndChainingConstructors(int movieid) {
    	System.out.println("1-arg construtor called");
    	this.movieid=movieid;
    }
    public MovieCopyAndChainingConstructors(MovieCopyAndChainingConstructors m,double budget) {
    	this(m,"peddi","Ram charan");  //in m there is only movieid that we can use by m.movieid
    	System.out.println("2-arg construtor called");
    	//this.movieid=m.movieid;
    	this.budget=budget;
    	
    }
    public MovieCopyAndChainingConstructors(MovieCopyAndChainingConstructors m, String moviename,String hero) {
    	System.out.println("3-arg construtor called");
    	this.movieid=m.movieid;
    	//this.budget=m.budget;
    	this.moviename=moviename;
    	this.hero=hero;
		// TODO Auto-generated constructor stub
	}
	void movieInfo() {
    	System.out.println("Id of the movie is:"+movieid);
    	System.out.println("name of the movie is:"+moviename);
    	System.out.println("hero of the movie is:"+hero);
    	System.out.println("budget of the movie is:"+budget);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method started");
		
		MovieCopyAndChainingConstructors m=new MovieCopyAndChainingConstructors();
		m.movieInfo();
		System.out.println("********************************************");
		MovieCopyAndChainingConstructors m1=new MovieCopyAndChainingConstructors(m); //copyig m obj ref variable to new object as an argument
		m1.movieInfo();
		 
		System.out.println("*******************************************");
		
		MovieCopyAndChainingConstructors m2=new MovieCopyAndChainingConstructors(1); //one arg
		m2.movieInfo();
		
		System.out.println("*******************************************");
		
		MovieCopyAndChainingConstructors m3=new MovieCopyAndChainingConstructors(m2,3000000.0); //2 arg
		m3.movieInfo();
		
		System.out.println("***************************************************");
//		
//		MovieCopyConstructors m4=new MovieCopyConstructors(m3,"peddi","Ram charan); //3 arg
//		m4.movieInfo();

	}

}

package ConstructorChaining;

class Guitar extends Instruments{
    private String name;
  
     //Calling constructor same class 
    
    protected Guitar(){
        this("name");
        System.out.println("Guitar is one of the best Instrument");
    }

     //Calling constructor of super class with one argument
    public Guitar(String name) {
        super("name");
        System.out.println("Best Musical Instrument is Guitar");
    }
}


package ConstructorChaining;
class Instruments{
    private String name;
    //Calling constructor of same class with one String argument

    protected Instruments(){
        this("");
        System.out.println("This is Instrument");
    }
  
    public Instruments(String name){
        this.name=name("");
        System.out.println("Sing a song with Instruments");
    }

	private String name(String string) {
		return null;
	}
}

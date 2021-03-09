package Class0128;

/*
 * Hi Earl, it's me, Jackson, and here's a joke:
 *
 * How much room do fungi need to grow?
 *
 * As mushroom as possible!
 *
 * I hope you enjoyed my lame joke, also, in case you get stuck in vi again, here are a few helpful shortcuts:
 * i gets you into insert (edit) mode
 * esc gets you out into normal mode, where you can type commands like
 * :w which writes (saves)
 * :q which quits (exits to terminal)
 * :q! which quits without saving
 * :wq which saves and exits
 *
 * I hope that these come in handy!
 * -Jackson
 */

public class Pokemon implements Comparable<Pokemon>
{
	 // Can only be accessed by the inherited class
	  private String name;
	  private String color;
	  private boolean hasTrainer;

	  // Constructor
	  public Pokemon(String nParam, String cParam) 
	  {
	    this.name = nParam;
	    this.color = cParam;
	    this.hasTrainer = false;
	  }

	  public Pokemon(String nParam, String cParam, boolean hParam) 
	  {
		  this.name = nParam;
		  this.color = cParam;
		  this.hasTrainer = hParam;
	  }
	  
	  // Default constructor
	  public Pokemon() 
	  {
		  this.name = "";
		  this.color = "";
		  this.hasTrainer = false;
	  }
	  
	  // Accessor
	  public String getName() 
	  {
	    return this.name;
	  }
	  
	  public String getColor() 
	  {
		  return this.color;
	  }
	  
	  public boolean hasTrainer() 
	  {
		  return this.hasTrainer;
	  }
	  
	  // Mutator
	  public void setName(String nParam) 
	  {
	    this.name = nParam;
	  }
	  
	  public void setColor(String cParam) 
	  {
		  this.color = cParam;
	  }
	  
	  public void setHasTrainer(boolean hParam) 
	  {
		  this.hasTrainer = hParam;
	  }
	  

	  // Method
	  public String toString() 
	  {
	    return "I am a Pokemon: " + this.name + ", Color : " + this.color + ", With Trainer : " + this.hasTrainer();
	  }
	  
	  public boolean equals(Object obj)
	  {
		  if(obj != null && obj.getClass() == getClass())
		  {
			  Pokemon other = (Pokemon) obj;
			  if(this.name == other.getName() && this.color == other.getColor() && this.hasTrainer == other.hasTrainer())
			  {
				  System.out.println("Checked equal under Pokemon class");
				  return true;
			  }
		  }
		  if(obj != null && obj.getClass().getSuperclass() == getClass())
		  {
			  Pokemon other = (Pokemon) obj;
			  if(this.name == other.getName() && this.color == other.getColor() && this.hasTrainer == other.hasTrainer())
			  {
				  System.out.println("Checked equal under Pokemon class");
				  return true;
			  }
		  }
		  return false;
	  }

	@Override
	public int compareTo(Pokemon po) 
	{
		return this.name.compareTo(po.getName()) + this.color.compareTo(po.getColor());
	}
	  

}

class godchild extends nameOfClass{//hierarchical
  void dothis(){
    System.out.println("\nmultilevel");
    System.out.println("godchild name:"+"Schleiffren ");}}
class grandchild extends nameoOfChild{//multilevel
  void printthis(){
    System.out.println("i am skhart");}}
class nameoOfChild extends nameOfClass{private String SecondName="Aye"; //multilevel
        //getter    
        nameoOfChild(){ this.SecondName = SecondName;
        }public void printInfo() {System.out.print("Second Name: "+SecondName);
        }public void displayInfo(){ System.out.print("\n\ncourse:"+"Computer Engineering\n");
        }    void printInfo(int year){
            System.out.println("course years:"+year);};
      //class1  _ num1
}class nameOfClass {
        private  String name="skhart";  private int age=20;   private String LastName="Mercado";
      // Setter
      public void setNameAgeTrue(String name, int age, boolean True) {
        this.name = name; this.age = age; this.LastName= LastName;
        // Getter
      }public static String getName(String Name) {return Name;
      }public static int getAge(int Age) {return Age;
      }public static String getTrue( String LastName) {return LastName;
        }public void displayInfo() {
          System.out.println("Hierarchical");
          System.out.println("Name: " + name+"\nAge: "+age+"\nLastName: "+LastName+"\n");}}
public class Parent {
    public static void main(String[] args){
        //hierarchical                 //     //multilevel                 //   //override     //
     grandchild mychild= new grandchild();    godchild niece= new godchild();    nameoOfChild childer= new nameoOfChild();
     mychild.displayInfo(); mychild.printInfo();  mychild.printthis(); mychild.printInfo(4); //overload and multilevel
    
     niece.dothis(); niece.displayInfo(); //hierarchical
     
     childer.displayInfo(); //override
    }}
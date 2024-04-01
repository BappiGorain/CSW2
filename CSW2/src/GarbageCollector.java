
class GarbageCollector
{
	String myObject;
	public GarbageCollector(String myObject) 
	{
		this.myObject = myObject;
	}
	
	void print()
	{
		System.out.println("Hello "+ myObject);
	}
	public static void main(String[] args)
	{
		new GarbageCollector("testObject1").print();
	}
	@Override
	protected void finalize() throws Throwable
	{
		System.out.println("Garbage Collection is successful for " + this.myObject);
	}
}  



//public class GarbageCollector 
//{
//     public static void main(String[] args) 
//    { 
//        GarbageCollector obj1 = new GarbageCollector(); 
//        GarbageCollector obj2 = new GarbageCollector(); 
//      
//        obj1 = obj2; 
//       
//        System.gc(); 
//        System.out.println("end of garbage collection"); 
//
//    } 
//    @Override
//    protected void finalize() 
//    { 
//        System.out.println("finalize method called"); 
//    } 
//}
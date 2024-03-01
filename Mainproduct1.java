class product
{
	int p_code;
	String p_name;
	int p_price;
	product(int code,String name,int price)
          {
	  p_code=code;
	  p_name=name;
	  p_price=price;
          }
          void display()
          {
	  System.out.println("Product Code:"+p_code);
            System.out.println("Product Name:"+p_name);
            System.out.println("Product Price:"+p_price);
          }
}
class Mainproduct1
{
	public static void main(String args[])	
	{
		product ob1=new product(123,"pen",10);
		product ob2=new product(423,"pencil",5);
		product ob3=new product(523,"book",30);
		System.out.println("\n product with lowest price");
		if(ob1.p_price<ob2.p_price)
		{
		     if(ob1.p_price<ob3.p_price)
			{
			   ob1.display();
			}	
		      else
		      {
			ob3.display();
	                }
		}	
		      else if(ob3.p_price<ob2.p_price)
		      {
			ob3.display();
		       }
			
		      else
		          {
			ob2.display();
			}
	          }
}



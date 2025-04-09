public class productt{
String pcode;
String pname;
int price;
public productt (String pcodeh,String pnameh,int priceh){
pcode=pcodeh;
pname=pnameh;
price=priceh;
}
public static void main(String args[]){
productt p1= new productt("m45","hello",10);
productt p2= new productt("m54","helloo",20);
productt p3= new productt("m10","hellooooo",25);




if(p1.price<=p3.price&&p1.price<=p2.price)
System.out.println("lowest product id is"+p1.pcode);

if(p3.price<=p1.price&&p3.price<=p2.price)
System.out.println("lowest product id is"+p3.pcode);


if(p2.price<=p3.price&&p2.price<=p1.price)
System.out.println("lowest product id is"+p2.pcode);


}




}

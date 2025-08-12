class Main
{
	public static void main(String arg[])
	{
		String rest="Babulu_Gari_Bojanam";
		String address="Bander/5-227-9/krishna dst/Andhrapradesh";
		String phone="+919177814284";
		String p1="Chicken65";
		double pr1=300;
		int q1=2;
		double t1=pr1*q1;
		String p2="Biryani";
		double pr2=399;
		int q2=4;
		double t2=pr2*q2;
		String p3="fish Biryani";
		double pr3=499;
		int q3=3;
		double t3=pr3*q3;
		String p4="water Bottle";
		double pr4=50;
		int q4=2;
		double t4=pr4*q4;
		String p5="Cool drinks";
		double pr5=99;
		int q5=10;
		double t5=pr5*q5;
		String p6="Ice creams";
		double pr6=100;
		int q6=20;
		double t6=pr6*q6;
		double to=t1+t2+t3+t4+t5+t6;
		double gst=0.9;
		double sgst=0.9;
		double tax=(gst+sgst);
		double fin=to*(gst+sgst)/100;
		double cast=to+fin;
		System.out.println("----------------------------------------------");
		System.out.println("          Restorent_name: "+rest);
		System.out.println("Address:"+address);
		System.out.println("Phone:"+phone);
		System.out.println("----------------------------------------------");
		System.out.println(   "Item\t  \tPrice\tQuantity\tTotal"   );
		System.out.println("----------------------------------------------");
		System.out.println(p1+ "\t" +pr1+ "\t" +q1+ "\t\t" +t1);
		System.out.println(p2+ "\t" +pr2+ "\t" +q2+ "\t\t" +t2);
		System.out.println(p3+ "\t" +pr3+ "\t" +q3+ "\t\t" +t3);
		System.out.println(p4+ "\t" +pr4+ "\t" +q4+ "\t\t" +t4);
		System.out.println(p5+ "\t" +pr5+ "\t" +q5+ "\t\t" +t5);
		System.out.println(p6+ "\t" +pr6+ "\t" +q6+ "\t\t" +t6);
		System.out.println("----------------------------------------------");
		System.out.println("Total_bill 	:			"+to);
		System.out.println("-----------------------------------------------");
		System.out.println("GST        	:          		"+gst);
		System.out.println("SGST	:			"+sgst);
		System.out.println("Tax		:			"+tax);
		System.out.println("Taxt_amount	:			"+fin);
		System.out.println("Final_bill	:			"+cast);
		System.out.println("------------------------------------------------");
		String payment="gpay";
		double discount1=10.0,discount2=20.0,discount3=15.0,discount4=5.0,discount5=4.0;
		double amount=fin;
		if(payment=="upi")
		{
			double totalbill1=discount1/100*cast;
			double finalbill1=cast-totalbill1;
			System.out.println(finalbill1);
		if(payment=="gpay")
		{
			double totalbill2=discount2/100*cast;
			double finalbill2=cast-totalbill2;
			System.out.println(finalbill2);
		}
		else if(payment=="phonepay")
		{
			double totalbill3=discount3/100*cast;
			 double finalbill3=cast-totalbill3;
			System.out.println(finalbill3);
		}
		else if(payment=="paytm")
		{
			double totalbill4=discount4/100*cast;
			 double finalbill4=cast-totalbill4;
			System.out.println(finalbill4);
		}

		}
		else
		{
			 double totalbill5=discount5/100*cast;
			double finalbill5=cast-totalbill5;
			System.out.println("Payment discount:                   "+totalbill5);
			System.out.println("Amaount:				"+finalbill5);

		}
		System.out.println("*************Thank you Visit Again*********");
		System.out.println("-------------------------------------------------");
		
	}
}

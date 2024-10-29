//QuickBiteOrderSystem Application


import java.util.Scanner;
class QuickBiteOrderSystem
{
	//Create a Scanner object for user input
	static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) throws Exception
	{
		System.out.println("\t\t\tWelcome To \"Quick Bite Order System\" Application");

		//Display the hotel selection menu
		System.out.println("\nSelect the Hotel");
		System.out.println("1.Buhari\n2.A2B\n3.Amma Canteen\n4.S.S.Hyderabad");

		//Get user input for hotel selection
		int hotel=sc.nextInt();
		System.out.println("Processing For Getting inside the hotel");
		Thread.sleep(3000);//Simulate loading time

		//Handle Hotel Selection
		switch (hotel)
		{

		case 1:{//Buhari Hotel
			System.out.println("\t\tGreetings From Buhari");
			System.out.println("Select Your Food");
			System.out.println("1.Mutton Briyani\n2.Chicken 65\n3.Prawn Briyani\n4.Mandi Briyani");
			
			//Get User input for food selection
			int fav_food = sc.nextInt();
			switch (fav_food)
			{
			case 1 :{ //Mutton Briyani
				double price = 380,tot_bill=1;
				System.out.println("The price of Mutton Briyani is "+price);
				System.out.println("Enter the Quantity");
				
				//Get quantity and calculate total Bill
				int qty=sc.nextInt();
				tot_bill = price*qty;
				System.out.println("The Total Bill Amount : "+tot_bill);
				
				System.out.println("Redirecting to Payment..");
				Thread.sleep(3000);//Simulate loading time
				
				//Display payment method options
				System.out.println("Select the method of payment");
				System.out.println("1.Gpay\n2.Phonepay");
				int pay_method = sc.nextInt();
				
				//Handle Gpay payment method
				if (pay_method==1)
				{
					System.out.println("\t\t\t G-pay");
					System.out.println("Enter the Bill Amount");
					double entered_bill = sc.nextDouble();
					
					//Verify payment amount
					if (tot_bill == entered_bill)
					{
						int sys_otp=(int)(Math.random()*9999+9999);
						System.out.println ("Enter the OTP : "+sys_otp);
						int enter_otp = sc.nextInt();
						
						//Verify OTP
						if (enter_otp==sys_otp)
						{
							System.out.println("\t\t Processing");
							Thread.sleep(3000);
							System.out.println("\t\tThank You \n Your order will be delivered");
						}
						else 
						{
							System.out.println("\t\tOrder Failed ");
						}
					}
					else
					{
						System.out.println("Order Failed");
					}

				}

				//Handle Phonepay payment method
				else if (pay_method == 2)
				{
					System.out.println("\t\t\t Phone-pay");
					System.out.println("Enter the Bill Amount : ");
					double entered_bill = sc.nextDouble();
					
					//Verify payment method
					if (tot_bill == entered_bill)
					{
						int sys_otp=(int)(Math.random()*9999+9999);
						System.out.println("\t\t Generating OTP");
						Thread.sleep(2000);
						System.out.println ("Enter the OTP : "+sys_otp);
						int enter_otp = sc.nextInt();
						
						//Verify OTP
						if (enter_otp==sys_otp)
						{
							System.out.println("\t\t Processing");
							Thread.sleep(3000);
							System.out.println("\t\tThank You \n Your order will be delivered");
						}
						else 
						{
							System.out.println("\t\tOrder Failed ");
						}
					}
					else
					{
						System.out.println("\t\tOrder Failed");
					}

				}
				else
				{
					System.out.println("\t\tIncorrect payment method");
				}
				break;}//End case for Mutton Briyani

			//Handle other food options similarly
			case 2 :{//Chicken 65
				double price = 120,tot_bill=1;
				System.out.println("The price of Chicken 65 is "+price);
				System.out.println("Enter the Quantity");
				
				//Get quantity and calculate total bill
				int qty=sc.nextInt();
				tot_bill = price*qty;
				System.out.println("The Total Bill Amount : "+tot_bill);
				
				System.out.println("\t\tRedirecting to Payment..");
				Thread.sleep(3000);//Simulate loading time
				
				//Display payment method options
				System.out.println("Select the method of payment");
				System.out.println("1.Gpay\n2.Phonepay");
				int pay_method = sc.nextInt();
				
				//Handle Gpay payment method
				if (pay_method==1)
				{
					System.out.println("\t\t\t G-pay");
					System.out.println("Enter the Bill Amount : ");
					double entered_bill = sc.nextDouble();
					
					//Verify payment amount
					if (tot_bill == entered_bill)
					{
						int sys_otp=(int)(Math.random()*9999+9999);
						System.out.println ("Enter the OTP : "+sys_otp);
						int enter_otp = sc.nextInt();
						
						//Verify OTP
						if (enter_otp==sys_otp)
						{
							System.out.println("\t\t Processing");
							Thread.sleep(3000);
							System.out.println("\t\tThank You \n Your order will be delivered");
						}
						else 
						{
							System.out.println("\t\tOrder Failed ");
						}
					}
					else
					{
						System.out.println("\t\tOrder Failed");
					}

				}

				//Handle Phonepay payment method
				else if (pay_method == 2)
				{
					System.out.println("\t\t\t Phone-pay");
					System.out.println("Enter the Bill Amount : ");
					double entered_bill = sc.nextDouble();
					
					//Verify payment amount
					if (tot_bill == entered_bill)
					{
						int sys_otp=(int)(Math.random()*9999+9999);
						System.out.println("\t\t Generating OTP");
						Thread.sleep(2000);
						System.out.println ("Enter the OTP : "+sys_otp);
						int enter_otp = sc.nextInt();
						
						//Verify OTP
						if (enter_otp==sys_otp)
						{
							System.out.println("\t\t Processing");
							Thread.sleep(3000);
							System.out.println("\t\tThank You \n Your order will be delivered");
						}
						else 
						{
							System.out.println("\t\tOrder Failed ");
						}
					}
					else
					{
						System.out.println("\t\tOrder Failed");
					}

				}
				else
				{
					System.out.println("\t\tIncorrect payment method");
				}
				break;}// End case for Chicken 65
			case 3 :{//prawn briyani
				double price = 250,tot_bill=1;
				System.out.println("The price of Prawn Briyani is "+price);
				
				//Get quantity and calculate bill
				System.out.println("Enter the Quantity");
				int qty=sc.nextInt();
				tot_bill = price*qty;
				System.out.println("The Total Bill Amount : "+tot_bill);
				
				System.out.println("\t\tRedirecting to Payment..");
				Thread.sleep(3000);
				
				//Dsiplay payment method options
				System.out.println("Select the method of payment");
				System.out.println("1.Gpay\n2.Phonepay");
				int pay_method = sc.nextInt();
				
				//Handle Gpay payment method
				if (pay_method==1)
				{
					System.out.println("\t\t\t G-pay");
					System.out.println("Enter the Bill Amount : ");
					double entered_bill = sc.nextDouble();
					
					//Verify payment amount
					if (tot_bill == entered_bill)
					{
						int sys_otp=(int)(Math.random()*9999+9999);
						System.out.println ("Enter the OTP : "+sys_otp);
						int enter_otp = sc.nextInt();
						
						//Verify OTP
						if (enter_otp==sys_otp)
						{
							System.out.println("\t\t Processing");
							Thread.sleep(3000);
							System.out.println("\t\tThank You \n Your order will be delivered");
						}
						else 
						{
							System.out.println("\t\tOrder Failed ");
						}
					}
					else
					{
						System.out.println("\t\tOrder Failed");
					}

				}

				//Handle Phonepay payment method
				else if (pay_method == 2)
				{
					System.out.println("\t\t\t Phone-pay");
					System.out.println("Enter the Bill Amount : ");
					double entered_bill = sc.nextDouble();
					
					//Verify payement amount
					if (tot_bill == entered_bill)
					{
						int sys_otp=(int)(Math.random()*9999+9999);
						System.out.println("\t\t Generating OTP");
						Thread.sleep(2000);
						System.out.println ("Enter the OTP : "+sys_otp);
						int enter_otp = sc.nextInt();
						
						//Verify OTP
						if (enter_otp==sys_otp)
						{
							System.out.println("\t\t Processing");
							Thread.sleep(3000);
							System.out.println("Thank You \n Your order will be delivered");
						}
						else 
						{
							System.out.println("Order Failed ");
						}
					}
					else
					{
						System.out.println("Order Failed");
					}

				}
				else
				{
					System.out.println("Incorrect payment method");
				}
				break;}//end case for Prawn Briyani

			case 4 :{//Mandi Briyani
				double price = 400,tot_bill=1;
				System.out.println("The price of Mandhi Briyani is "+price);
				
				//Get quantity and calculate total bill
				System.out.println("Enter the Quantity");
				int qty=sc.nextInt();
				tot_bill = price*qty;
				System.out.println("The Total Bill Amount : "+tot_bill);
				
				System.out.println("\t\tRedirecting to Payment..");
				Thread.sleep(3000);
				
				//Select payment method
				System.out.println("Select the method of payment");
				System.out.println("1.Gpay\n2.Phonepay");
				int pay_method = sc.nextInt();
				
				//Handle Gpay payment method
				if (pay_method==1)
				{
					System.out.println("\t\t\t G-pay");
					System.out.println("Enter the Bill Amount : ");
					double entered_bill = sc.nextDouble();
					
					//Verify payment amount
					if (tot_bill == entered_bill)
					{
						int sys_otp=(int)(Math.random()*9999+9999);
						System.out.println ("Enter the OTP : "+sys_otp);
						int enter_otp = sc.nextInt();
						
						//Verify OTP
						if (enter_otp==sys_otp)
						{
							System.out.println("\t\t Processing");
							Thread.sleep(3000);
							System.out.println("\t\tThank You \n Your order will be delivered");
						}
						else 
						{
							System.out.println("\t\tOrder Failed ");
						}
					}
					else
					{
						System.out.println("\t\tOrder Failed");
					}

				}

				//Handle Phonepay payment method
				else if (pay_method == 2)
				{
					System.out.println("\t\t\t Phone-pay");
					System.out.println("Enter the Bill Amount : ");
					double entered_bill = sc.nextDouble();
					
					//Verify payment amount
					if (tot_bill == entered_bill)
					{
						int sys_otp=(int)(Math.random()*9999+9999);
						System.out.println("\t\t Generating OTP");
						Thread.sleep(2000);
						System.out.println ("Enter the OTP : "+sys_otp);
						int enter_otp = sc.nextInt();
						
						//Verify OTP
						if (enter_otp==sys_otp)
						{
							System.out.println("\t\t Processing");
							Thread.sleep(3000);
							System.out.println("Thank You \n Your order will be delivered");
						}
						else 
						{
							System.out.println("\t\tOrder Failed ");
						}
					}
					else
					{
						System.out.println("\t\tOrder Failed");
					}

				}
				else
				{
					System.out.println("\t\tIncorrect payment method");
				}
				break;}//end case for Mandi Briyani
			default : {
				System.out.println("\t\tInvalid Food Selection");
				break;}//hotel invalid food selection
			}
			break;}//Buhari

		case 2:{//A2B
			System.out.println("\t\tGreetings From A2B");
			
			//Get user input for food selection
			System.out.println("Select Your Food");
			System.out.println("1.Ghee Dosa\n2.Nice Dosa\n3.Podi Dosa\n4.Onion Dosa");
			int fav_food = sc.nextInt();
			
			switch (fav_food)
			{
			case 1 :{//Ghee Dosa
				double price = 80,tot_bill=1;
				System.out.println("The price of Ghee Dosa is "+price);
				System.out.println("Enter the Quantity");
				
				//Get quantity and calculate total Bill
				int qty=sc.nextInt();
				tot_bill = price*qty;
				System.out.println("The Total Bill Amount : "+tot_bill);
				
				System.out.println("Redirecting to Payment..");
				Thread.sleep(3000);
				
				//Display payment method options
				System.out.println("Select the method of payment");
				System.out.println("1.Gpay\n2.Phonepay");
				int pay_method = sc.nextInt();

				//Handle Gpay payment method
				if (pay_method==1)
				{
					System.out.println("\t\t\t G-pay");
					System.out.println("Enter the Bill Amount");
					double entered_bill = sc.nextDouble();
					
					//Verify payment amount
					if (tot_bill == entered_bill)
					{
						int sys_otp=(int)(Math.random()*9999+9999);
						System.out.println ("Enter the OTP : "+sys_otp);
						int enter_otp = sc.nextInt();
						
						//Verify OTP
						if (enter_otp==sys_otp)
						{
							System.out.println("\t\t Processing");
							Thread.sleep(3000);
							System.out.println("\t\tThank You \n Your order will be delivered");
						}
						else 
						{
							System.out.println("\t\tOrder Failed ");
						}
					}
					else
					{
						System.out.println("Order Failed");
					}

				}

				//Handle Phonepay payment method
				else if (pay_method == 2)
				{
					System.out.println("\t\t\t Phone-pay");
					System.out.println("Enter the Bill Amount : ");
					double entered_bill = sc.nextDouble();
					
					//Verify payment amount
					if (tot_bill == entered_bill)
					{
						int sys_otp=(int)(Math.random()*9999+9999);
						System.out.println("\t\t Generating OTP");
						Thread.sleep(2000);
						System.out.println ("Enter the OTP : "+sys_otp);
						int enter_otp = sc.nextInt();
						
						//Verify OTP
						if (enter_otp==sys_otp)
						{
							System.out.println("\t\t Processing");
							Thread.sleep(3000);
							System.out.println("\t\tThank You \n Your order will be delivered");
						}
						else 
						{
							System.out.println("\t\tOrder Failed ");
						}
					}
					else
					{
						System.out.println("\t\tOrder Failed");
					}

				}
				else
				{
					System.out.println("\t\tIncorrect payment method");
				}
				break;}//end case for Ghee Dosa

			case 2 :{//Nice Dosa
				double price = 50,tot_bill=1;
				System.out.println("The price of Nice Dosa is "+price);
				
				//Get quantity and calculate tot
				System.out.println("Enter the Quantity");
				int qty=sc.nextInt();
				tot_bill = price*qty;
				System.out.println("The Total Bill Amount : "+tot_bill);
				
				System.out.println("\t\tRedirecting to Payment..");
				Thread.sleep(3000);
				
				//Display payment method options
				System.out.println("Select the method of payment");
				System.out.println("1.Gpay\n2.Phonepay");
				int pay_method = sc.nextInt();
				
				//Handle Gpay payment method
				if (pay_method==1)
				{
					System.out.println("\t\t\t G-pay");
					System.out.println("Enter the Bill Amount : ");
					double entered_bill = sc.nextDouble();
					
					//Verify payment amount
					if (tot_bill == entered_bill)
					{
						int sys_otp=(int)(Math.random()*9999+9999);
						System.out.println ("Enter the OTP : "+sys_otp);
						int enter_otp = sc.nextInt();
						
						//Verify OTP
						if (enter_otp==sys_otp)
						{
							System.out.println("\t\t Processing");
							Thread.sleep(3000);
							System.out.println("\t\tThank You \n Your order will be delivered");
						}
						else 
						{
							System.out.println("\t\tOrder Failed ");
						}
					}
					else
					{
						System.out.println("\t\tOrder Failed");
					}

				}

				//Handle Phonepay payment method
				else if (pay_method == 2)
				{
					System.out.println("\t\t\t Phone-pay");
					System.out.println("Enter the Bill Amount : ");
					double entered_bill = sc.nextDouble();
					
					//Verify payment amount
					if (tot_bill == entered_bill)
					{
						int sys_otp=(int)(Math.random()*9999+9999);
						System.out.println("\t\t Generating OTP");
						Thread.sleep(2000);
						System.out.println ("Enter the OTP : "+sys_otp);
						int enter_otp = sc.nextInt();
						
						//Verify OTP
						if (enter_otp==sys_otp)
						{
							System.out.println("\t\t Processing");
							Thread.sleep(3000);
							System.out.println("\t\tThank You \n Your order will be delivered");
						}
						else 
						{
							System.out.println("\t\tOrder Failed ");
						}
					}
					else
					{
						System.out.println("\t\tOrder Failed");
					}

				}
				else
				{
					System.out.println("\t\tIncorrect payment method");
				}
				break;}//end case for Nice Dosa

		
			case 3 :{//Podi Dosa
				double price = 70,tot_bill=1;
				System.out.println("The price of Podi Dosa is "+price);
				
				//Get quantity and calculate total bill
				System.out.println("Enter the Quantity");
				int qty=sc.nextInt();
				tot_bill = price*qty;
				System.out.println("The Total Bill Amount : "+tot_bill);
				
				System.out.println("\t\tRedirecting to Payment..");
				Thread.sleep(3000);
				
				//Display payment method options
				System.out.println("Select the method of payment");
				System.out.println("1.Gpay\n2.Phonepay");
				int pay_method = sc.nextInt();

				//Handle Gpay payment method
				if (pay_method==1)
				{
					System.out.println("\t\t\t G-pay");
					System.out.println("Enter the Bill Amount : ");
					double entered_bill = sc.nextDouble();
					
					//Verify payment amount
					if (tot_bill == entered_bill)
					{
						int sys_otp=(int)(Math.random()*9999+9999);
						System.out.println ("Enter the OTP : "+sys_otp);
						int enter_otp = sc.nextInt();
						
						//Verify OTP
						if (enter_otp==sys_otp)
						{
							System.out.println("\t\t Processing");
							Thread.sleep(3000);
							System.out.println("\t\tThank You \n Your order will be delivered");
						}
						else 
						{
							System.out.println("\t\tOrder Failed ");
						}
					}
					else
					{
						System.out.println("\t\tOrder Failed");
					}

				}


				else if (pay_method == 2)//phone pay
				{
					System.out.println("\t\t\t Phone-pay");
					System.out.println("Enter the Bill Amount : ");
					double entered_bill = sc.nextDouble();
					if (tot_bill == entered_bill)
					{
						int sys_otp=(int)(Math.random()*9999+9999);
						System.out.println("\t\t Generating OTP");
						Thread.sleep(2000);
						System.out.println ("Enter the OTP : "+sys_otp);
						int enter_otp = sc.nextInt();
						if (enter_otp==sys_otp)
						{
							System.out.println("\t\t Processing");
							Thread.sleep(3000);
							System.out.println("Thank You \n Your order will be delivered");
						}
						else 
						{
							System.out.println("Order Failed ");
						}
					}
					else
					{
						System.out.println("Order Failed");
					}

				}
				else
				{
					System.out.println("Incorrect payment method");
				}
				break;}//end case for Podi Dosa


			case 4 :{//Onion Dosa
				double price = 90,tot_bill=1;
				System.out.println("The price of Onion Dosa is "+price);
				
				System.out.println("Enter the Quantity");
				int qty=sc.nextInt();
				tot_bill = price*qty;
				System.out.println("The Total Bill Amount : "+tot_bill);
				
				System.out.println("\t\tRedirecting to Payment..");
				Thread.sleep(3000);
				
				System.out.println("Select the method of payment");
				System.out.println("1.Gpay\n2.Phonepay");
				int pay_method = sc.nextInt();
				
				if (pay_method==1)//Gpay
				{
					System.out.println("\t\t\t G-pay");
					System.out.println("Enter the Bill Amount : ");
					double entered_bill = sc.nextDouble();
					
					//Verify payment amount
					if (tot_bill == entered_bill)
					{
						int sys_otp=(int)(Math.random()*9999+9999);
						System.out.println ("Enter the OTP : "+sys_otp);
						int enter_otp = sc.nextInt();
						
						//VErify Otp
						if (enter_otp==sys_otp)
						{
							System.out.println("\t\t Processing");
							Thread.sleep(3000);
							System.out.println("\t\tThank You \n Your order will be delivered");
						}
						else 
						{
							System.out.println("\t\tOrder Failed ");
						}
					}
					else
					{
						System.out.println("\t\tOrder Failed");
					}

				}


				else if (pay_method == 2)//phone pay
				{
					System.out.println("\t\t\t Phone-pay");
					System.out.println("Enter the Bill Amount : ");
					double entered_bill = sc.nextDouble();
					
					if (tot_bill == entered_bill)
					{
						int sys_otp=(int)(Math.random()*9999+9999);
						System.out.println("\t\t Generating OTP");
						Thread.sleep(2000);
						System.out.println ("Enter the OTP : "+sys_otp);
						int enter_otp = sc.nextInt();
						
						
						if (enter_otp==sys_otp)
						{
							System.out.println("\t\t Processing");
							Thread.sleep(3000);
							System.out.println("Thank You \n Your order will be delivered");
						}
						else 
						{
							System.out.println("\t\tOrder Failed ");
						}
					}
					else
					{
						System.out.println("\t\tOrder Failed");
					}

				}
				else
				{
					System.out.println("\t\tIncorrect payment method");
				}
				break;}// end case for Oninon Dosa
			default : {
				System.out.println("\t\tInvalid Food Selection");
				break;}//invalid food selection
			}
			
			break;}//end case for A2B


		case 3:{//Amma Canteen
			System.out.println("\t\tGreetings From Amma Canteen");
			System.out.println("Select Your Food");
			System.out.println("1.Sambar\n2.Rasam\n3.Curd\n4.Veg Briyani");
			int fav_food = sc.nextInt();
			switch (fav_food)
			{
			case 1 :{//Sambar
				double price = 100,tot_bill=1;
				System.out.println("The price of Sambar is "+price);
				System.out.println("Enter the Quantity");
				int qty=sc.nextInt();
				tot_bill = price*qty;
				System.out.println("The Total Bill Amount : "+tot_bill);
				System.out.println("Redirecting to Payment..");
				Thread.sleep(3000);
				System.out.println("Select the method of payment");
				System.out.println("1.Gpay\n2.Phonepay");
				int pay_method = sc.nextInt();
				if (pay_method==1)//Gpay
				{
					System.out.println("\t\t\t G-pay");
					System.out.println("Enter the Bill Amount");
					double entered_bill = sc.nextDouble();
					if (tot_bill == entered_bill)
					{
						int sys_otp=(int)(Math.random()*9999+9999);
						System.out.println ("Enter the OTP : "+sys_otp);
						int enter_otp = sc.nextInt();
						if (enter_otp==sys_otp)
						{
							System.out.println("\t\t Processing");
							Thread.sleep(3000);
							System.out.println("\t\tThank You \n Your order will be delivered");
						}
						else 
						{
							System.out.println("\t\tOrder Failed ");
						}
					}
					else
					{
						System.out.println("Order Failed");
					}

				}
				else if (pay_method == 2)//phone pay
				{
					System.out.println("\t\t\t Phone-pay");
					System.out.println("Enter the Bill Amount : ");
					double entered_bill = sc.nextDouble();
					if (tot_bill == entered_bill)
					{
						int sys_otp=(int)(Math.random()*9999+9999);
						System.out.println("\t\t Generating OTP");
						Thread.sleep(2000);
						System.out.println ("Enter the OTP : "+sys_otp);
						int enter_otp = sc.nextInt();
						if (enter_otp==sys_otp)
						{
							System.out.println("\t\t Processing");
							Thread.sleep(3000);
							System.out.println("\t\tThank You \n Your order will be delivered");
						}
						else 
						{
							System.out.println("\t\tOrder Failed ");
						}
					}
					else
					{
						System.out.println("\t\tOrder Failed");
					}

				}
				else
				{
					System.out.println("\t\tIncorrect payment method");
				}
				break;}//Sambar 
			case 2 :{//Rasam 
				double price = 90,tot_bill=1;
				System.out.println("The price of Rasam is "+price);
				System.out.println("Enter the Quantity");
				int qty=sc.nextInt();
				tot_bill = price*qty;
				System.out.println("The Total Bill Amount : "+tot_bill);
				System.out.println("\t\tRedirecting to Payment..");
				Thread.sleep(3000);
				System.out.println("Select the method of payment");
				System.out.println("1.Gpay\n2.Phonepay");
				int pay_method = sc.nextInt();
				if (pay_method==1)//Gpay
				{
					System.out.println("\t\t\t G-pay");
					System.out.println("Enter the Bill Amount : ");
					double entered_bill = sc.nextDouble();
					if (tot_bill == entered_bill)
					{
						int sys_otp=(int)(Math.random()*9999+9999);
						System.out.println ("Enter the OTP : "+sys_otp);
						int enter_otp = sc.nextInt();
						if (enter_otp==sys_otp)
						{
							System.out.println("\t\t Processing");
							Thread.sleep(3000);
							System.out.println("\t\tThank You \n Your order will be delivered");
						}
						else 
						{
							System.out.println("\t\tOrder Failed ");
						}
					}
					else
					{
						System.out.println("\t\tOrder Failed");
					}

				}
				else if (pay_method == 2)//phone pay
				{
					System.out.println("\t\t\t Phone-pay");
					System.out.println("Enter the Bill Amount : ");
					double entered_bill = sc.nextDouble();
					if (tot_bill == entered_bill)
					{
						int sys_otp=(int)(Math.random()*9999+9999);
						System.out.println("\t\t Generating OTP");
						Thread.sleep(2000);
						System.out.println ("Enter the OTP : "+sys_otp);
						int enter_otp = sc.nextInt();
						if (enter_otp==sys_otp)
						{
							System.out.println("\t\t Processing");
							Thread.sleep(3000);
							System.out.println("\t\tThank You \n Your order will be delivered");
						}
						else 
						{
							System.out.println("\t\tOrder Failed ");
						}
					}
					else
					{
						System.out.println("\t\tOrder Failed");
					}

				}
				else
				{
					System.out.println("\t\tIncorrect payment method");
				}
				break;}//Rasam
			case 3 :{//Curd
				double price = 80,tot_bill=1;
				System.out.println("The price of Curd is "+price);
				System.out.println("Enter the Quantity");
				int qty=sc.nextInt();
				tot_bill = price*qty;
				System.out.println("The Total Bill Amount : "+tot_bill);
				System.out.println("\t\tRedirecting to Payment..");
				Thread.sleep(3000);
				System.out.println("Select the method of payment");
				System.out.println("1.Gpay\n2.Phonepay");
				int pay_method = sc.nextInt();
				if (pay_method==1)//Gpay
				{
					System.out.println("\t\t\t G-pay");
					System.out.println("Enter the Bill Amount : ");
					double entered_bill = sc.nextDouble();
					if (tot_bill == entered_bill)
					{
						int sys_otp=(int)(Math.random()*9999+9999);
						System.out.println ("Enter the OTP : "+sys_otp);
						int enter_otp = sc.nextInt();
						if (enter_otp==sys_otp)
						{
							System.out.println("\t\t Processing");
							Thread.sleep(3000);
							System.out.println("\t\tThank You \n Your order will be delivered");
						}
						else 
						{
							System.out.println("\t\tOrder Failed ");
						}
					}
					else
					{
						System.out.println("\t\tOrder Failed");
					}

				}
				else if (pay_method == 2)//phone pay
				{
					System.out.println("\t\t\t Phone-pay");
					System.out.println("Enter the Bill Amount : ");
					double entered_bill = sc.nextDouble();
					if (tot_bill == entered_bill)
					{
						int sys_otp=(int)(Math.random()*9999+9999);
						System.out.println("\t\t Generating OTP");
						Thread.sleep(2000);
						System.out.println ("Enter the OTP : "+sys_otp);
						int enter_otp = sc.nextInt();
						if (enter_otp==sys_otp)
						{
							System.out.println("\t\t Processing");
							Thread.sleep(3000);
							System.out.println("Thank You \n Your order will be delivered");
						}
						else 
						{
							System.out.println("Order Failed ");
						}
					}
					else
					{
						System.out.println("Order Failed");
					}

				}
				else
				{
					System.out.println("Incorrect payment method");
				}
				break;}//Curd
			case 4 :{//Veg Briyani
				double price = 120,tot_bill=1;
				System.out.println("The price of Veg Briyani is "+price);
				System.out.println("Enter the Quantity");
				int qty=sc.nextInt();
				tot_bill = price*qty;
				System.out.println("The Total Bill Amount : "+tot_bill);
				System.out.println("\t\tRedirecting to Payment..");
				Thread.sleep(3000);
				System.out.println("Select the method of payment");
				System.out.println("1.Gpay\n2.Phonepay");
				int pay_method = sc.nextInt();
				if (pay_method==1)//Gpay
				{
					System.out.println("\t\t\t G-pay");
					System.out.println("Enter the Bill Amount : ");
					double entered_bill = sc.nextDouble();
					if (tot_bill == entered_bill)
					{
						int sys_otp=(int)(Math.random()*9999+9999);
						System.out.println ("Enter the OTP : "+sys_otp);
						int enter_otp = sc.nextInt();
						if (enter_otp==sys_otp)
						{
							System.out.println("\t\t Processing");
							Thread.sleep(3000);
							System.out.println("\t\tThank You \n Your order will be delivered");
						}
						else 
						{
							System.out.println("\t\tOrder Failed ");
						}
					}
					else
					{
						System.out.println("\t\tOrder Failed");
					}

				}
				else if (pay_method == 2)//phone pay
				{
					System.out.println("\t\t\t Phone-pay");
					System.out.println("Enter the Bill Amount : ");
					double entered_bill = sc.nextDouble();
					if (tot_bill == entered_bill)
					{
						int sys_otp=(int)(Math.random()*9999+9999);
						System.out.println("\t\t Generating OTP");
						Thread.sleep(2000);
						System.out.println ("Enter the OTP : "+sys_otp);
						int enter_otp = sc.nextInt();
						if (enter_otp==sys_otp)
						{
							System.out.println("\t\t Processing");
							Thread.sleep(3000);
							System.out.println("Thank You \n Your order will be delivered");
						}
						else 
						{
							System.out.println("\t\tOrder Failed ");
						}
					}
					else
					{
						System.out.println("\t\tOrder Failed");
					}

				}
				else
				{
					System.out.println("\t\tIncorrect payment method");
				}
				break;}//Veg Briyani
			default : {
				System.out.println("\t\tInvalid Food Selection");
				break;}//invalid food selection
			}
			break;}//end case for Amma Canteen


		case 4:{//SS Hyderabad
			System.out.println("\t\tGreetings From Hyderabad");
			System.out.println("Select Your Food");
			System.out.println("1.Mutton Briyani\n2.Chicken Briyani\n3.Prawn Briyani\n4.Beef Briyani");
			int fav_food = sc.nextInt();
			switch (fav_food)
			{
			case 1 :{//Mutton Briyani
				double price = 300,tot_bill=1;
				System.out.println("The price of Mutton Briyani is "+price);
				System.out.println("Enter the Quantity");
				int qty=sc.nextInt();
				tot_bill = price*qty;
				System.out.println("The Total Bill Amount : "+tot_bill);
				System.out.println("Redirecting to Payment..");
				Thread.sleep(3000);
				System.out.println("Select the method of payment");
				System.out.println("1.Gpay\n2.Phonepay");
				int pay_method = sc.nextInt();
				if (pay_method==1)//Gpay
				{
					System.out.println("\t\t\t G-pay");
					System.out.println("Enter the Bill Amount");
					double entered_bill = sc.nextDouble();
					if (tot_bill == entered_bill)
					{
						int sys_otp=(int)(Math.random()*9999+9999);
						System.out.println ("Enter the OTP : "+sys_otp);
						int enter_otp = sc.nextInt();
						if (enter_otp==sys_otp)
						{
							System.out.println("\t\t Processing");
							Thread.sleep(3000);
							System.out.println("\t\tThank You \n Your order will be delivered");
						}
						else 
						{
							System.out.println("\t\tOrder Failed ");
						}
					}
					else
					{
						System.out.println("Order Failed");
					}

				}
				else if (pay_method == 2)//phone pay
				{
					System.out.println("\t\t\t Phone-pay");
					System.out.println("Enter the Bill Amount : ");
					double entered_bill = sc.nextDouble();
					if (tot_bill == entered_bill)
					{
						int sys_otp=(int)(Math.random()*9999+9999);
						System.out.println("\t\t Generating OTP");
						Thread.sleep(2000);
						System.out.println ("Enter the OTP : "+sys_otp);
						int enter_otp = sc.nextInt();
						if (enter_otp==sys_otp)
						{
							System.out.println("\t\t Processing");
							Thread.sleep(3000);
							System.out.println("\t\tThank You \n Your order will be delivered");
						}
						else 
						{
							System.out.println("\t\tOrder Failed ");
						}
					}
					else
					{
						System.out.println("\t\tOrder Failed");
					}

				}
				else
				{
					System.out.println("\t\tIncorrect payment method");
				}
				break;}//Mutton Briyani
			case 2 :{//Chicken Briyani
				double price = 150,tot_bill=1;
				System.out.println("The price of Chicken briyani is "+price);
				System.out.println("Enter the Quantity");
				int qty=sc.nextInt();
				tot_bill = price*qty;
				System.out.println("The Total Bill Amount : "+tot_bill);
				System.out.println("\t\tRedirecting to Payment..");
				Thread.sleep(3000);
				System.out.println("Select the method of payment");
				System.out.println("1.Gpay\n2.Phonepay");
				int pay_method = sc.nextInt();
				if (pay_method==1)//Gpay
				{
					System.out.println("\t\t\t G-pay");
					System.out.println("Enter the Bill Amount : ");
					double entered_bill = sc.nextDouble();
					if (tot_bill == entered_bill)
					{
						int sys_otp=(int)(Math.random()*9999+9999);
						System.out.println ("Enter the OTP : "+sys_otp);
						int enter_otp = sc.nextInt();
						if (enter_otp==sys_otp)
						{
							System.out.println("\t\t Processing");
							Thread.sleep(3000);
							System.out.println("\t\tThank You \n Your order will be delivered");
						}
						else 
						{
							System.out.println("\t\tOrder Failed ");
						}
					}
					else
					{
						System.out.println("\t\tOrder Failed");
					}

				}
				else if (pay_method == 2)//phone pay
				{
					System.out.println("\t\t\t Phone-pay");
					System.out.println("Enter the Bill Amount : ");
					double entered_bill = sc.nextDouble();
					if (tot_bill == entered_bill)
					{
						int sys_otp=(int)(Math.random()*9999+9999);
						System.out.println("\t\t Generating OTP");
						Thread.sleep(2000);
						System.out.println ("Enter the OTP : "+sys_otp);
						int enter_otp = sc.nextInt();
						if (enter_otp==sys_otp)
						{
							System.out.println("\t\t Processing");
							Thread.sleep(3000);
							System.out.println("\t\tThank You \n Your order will be delivered");
						}
						else 
						{
							System.out.println("\t\tOrder Failed ");
						}
					}
					else
					{
						System.out.println("\t\tOrder Failed");
					}

				}
				else
				{
					System.out.println("\t\tIncorrect payment method");
				}
				break;}//Chicken Briyani
			case 3 :{//prawn briyani
				double price = 290,tot_bill=1;
				System.out.println("The price of Prawn Briyani is "+price);
				System.out.println("Enter the Quantity");
				int qty=sc.nextInt();
				tot_bill = price*qty;
				System.out.println("The Total Bill Amount : "+tot_bill);
				System.out.println("\t\tRedirecting to Payment..");
				Thread.sleep(3000);
				System.out.println("Select the method of payment");
				System.out.println("1.Gpay\n2.Phonepay");
				int pay_method = sc.nextInt();
				if (pay_method==1)//Gpay
				{
					System.out.println("\t\t\t G-pay");
					System.out.println("Enter the Bill Amount : ");
					double entered_bill = sc.nextDouble();
					if (tot_bill == entered_bill)
					{
						int sys_otp=(int)(Math.random()*9999+9999);
						System.out.println ("Enter the OTP : "+sys_otp);
						int enter_otp = sc.nextInt();
						if (enter_otp==sys_otp)
						{
							System.out.println("\t\t Processing");
							Thread.sleep(3000);
							System.out.println("\t\tThank You \n Your order will be delivered");
						}
						else 
						{
							System.out.println("\t\tOrder Failed ");
						}
					}
					else
					{
						System.out.println("\t\tOrder Failed");
					}

				}
				else if (pay_method == 2)//phone pay
				{
					System.out.println("\t\t\t Phone-pay");
					System.out.println("Enter the Bill Amount : ");
					double entered_bill = sc.nextDouble();
					if (tot_bill == entered_bill)
					{
						int sys_otp=(int)(Math.random()*9999+9999);
						System.out.println("\t\t Generating OTP");
						Thread.sleep(2000);
						System.out.println ("Enter the OTP : "+sys_otp);
						int enter_otp = sc.nextInt();
						if (enter_otp==sys_otp)
						{
							System.out.println("\t\t Processing");
							Thread.sleep(3000);
							System.out.println("Thank You \n Your order will be delivered");
						}
						else 
						{
							System.out.println("Order Failed ");
						}
					}
					else
					{
						System.out.println("Order Failed");
					}

				}
				else
				{
					System.out.println("Incorrect payment method");
				}
				break;}//Prawn Briyani
			case 4 :{//Beef Briyani
				double price = 200,tot_bill=1;
				System.out.println("The price of Beef Briyani is "+price);
				System.out.println("Enter the Quantity");
				int qty=sc.nextInt();
				tot_bill = price*qty;
				System.out.println("The Total Bill Amount : "+tot_bill);
				System.out.println("\t\tRedirecting to Payment..");
				Thread.sleep(3000);
				System.out.println("Select the method of payment");
				System.out.println("1.Gpay\n2.Phonepay");
				int pay_method = sc.nextInt();
				if (pay_method==1)//Gpay
				{
					System.out.println("\t\t\t G-pay");
					System.out.println("Enter the Bill Amount : ");
					double entered_bill = sc.nextDouble();
					if (tot_bill == entered_bill)
					{
						int sys_otp=(int)(Math.random()*9999+9999);
						System.out.println ("Enter the OTP : "+sys_otp);
						int enter_otp = sc.nextInt();
						if (enter_otp==sys_otp)
						{
							System.out.println("\t\t Processing");
							Thread.sleep(3000);
							System.out.println("\t\tThank You \n Your order will be delivered");
						}
						else 
						{
							System.out.println("\t\tOrder Failed ");
						}
					}
					else
					{
						System.out.println("\t\tOrder Failed");
					}

				}
				else if (pay_method == 2)//phone pay
				{
					System.out.println("\t\t\t Phone-pay");
					System.out.println("Enter the Bill Amount : ");
					double entered_bill = sc.nextDouble();
					if (tot_bill == entered_bill)
					{
						int sys_otp=(int)(Math.random()*9999+9999);
						System.out.println("\t\t Generating OTP");
						Thread.sleep(2000);
						System.out.println ("Enter the OTP : "+sys_otp);
						int enter_otp = sc.nextInt();
						if (enter_otp==sys_otp)
						{
							System.out.println("\t\t Processing");
							Thread.sleep(3000);
							System.out.println("Thank You \n Your order will be delivered");
						}
						else 
						{
							System.out.println("\t\tOrder Failed ");
						}
					}
					else
					{
						System.out.println("\t\tOrder Failed");
					}

				}
				else
				{
					System.out.println("\t\tIncorrect payment method");
				}
				break;}//Beef Briyani
			default : {
				System.out.println("\t\tInvalid Food Selection");
				break;}//invalid food selection
			}
			break;}// end case for SS Hyderabad
		default : {
			System.out.println("Invalid Hotel Selection");
			break;}//invalid hotel selection

		
		}
	}
}

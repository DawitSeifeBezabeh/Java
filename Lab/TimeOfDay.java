import java.util.Scanner;
public class TimeOfDay{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);

		int h1, h2, m1, m2, s1, s2;
		String meridianIndex1, meridianIndex2;
		
		System.out.println("Enter the hour");
		h1 = keyboard.nextInt();
		System.out.println("Enter the minute");
		m1 = keyboard.nextInt();
		System.out.println("Enter the second");
		s1 = keyboard.nextInt();
		System.out.println("Enter the meridian time");
		meridianIndex1 = keyboard.next();
		

		System.out.println("Enter the hour");
		h2 = keyboard.nextInt();
		System.out.println("Enter the minute");
		m2 = keyboard.nextInt();
		System.out.println("Enter the second");
		s2 = keyboard.nextInt();
		System.out.println("Enter the meridian time");
		meridianIndex2 = keyboard.next();
		

		if(meridianIndex1.equals("AM") && h1 == 12) h1 = 0;
		if(meridianIndex1.equals("PM") && h1 != 12) h1 += 12;

		if(meridianIndex2.equals("AM") && h2 == 12) h2 = 0;
		if(meridianIndex2.equals("PM") && h2 != 12) h2 += 12;

		int timeDiff = (s2 - s1) + (60 * (m2 - m1)) + (3600 * (h2 - h1));
		
		int hourFinal = timeDiff/3600;
		timeDiff = timeDiff % 3600;
		int minFinal = timeDiff / 60;
		timeDiff = timeDiff % 60;
		
		System.out.print("The time difference is " + minFinal + "minutes and " + timeDiff + "seconds.");
		
	}
}	
/*
input_s
1:H_i
2:M_i
3:S_i
4:Merdian_i
	if Meridian_i==AM:
		state_of_day=1
	else:
		state_of_day=0	

Write an exception for 12AM/PM
E.g: 11PM:i
     1AM:O
1AM+(state_of_day*12)

output_s
1:H_o
2:M_o
3:S_o
4:Merdian_o
	if Meridian_o==AM:
		state_of_day=1
	else:
		state_of_day=0	
#Consensus, find which second of the day we are at:
Time_of_day_i = S_i + M_i + H_i  

#Scrap this: time_diff_s=(S_o-s_i)+(60*(M_0-M_i))+(3600*(H_i-H_o))
print(f"The time elpased is 

*/		
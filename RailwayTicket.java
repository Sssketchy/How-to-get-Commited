import java.util.*;

class RailwayTicket{
	String name;
	String coach;
	long mob_no;
	int amt;
	int totalamnt;
	public void accept(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter passenger details");
		System.out.print("Enter name: "); name = sc.nextLine();
		System.out.print("Enter coach: "); coach = sc.nextLine();
		System.out.print("Enter mob_no: "); mob_no = sc.nextLong();
		System.out.print("Enter amt: "); amt = sc.nextInt();
	}
	
	public void update(){
		System.out.println("\n" + "Updating Amount");
		if(coach.equalsIgnoreCase("First_AC")){
			totalamnt = amt + 700;
		}
		else if(coach.equalsIgnoreCase("Second_AC")){
			totalamnt = amt + 500;
		}
		else if(coach.equalsIgnoreCase("Third_AC")){
			totalamnt = amt + 250;
		}
		else{
			totalamnt = amt;
		}
	}
	
	public void display(){
		System.out.println("\n" + "Displaying details");
		System.out.println("\n" + name + " " + coach + " " + mob_no + " " + totalamnt );
	}

	public static void main(String[] args){
		int cnt = 0;
		Scanner sc = new Scanner(System.in);
		String stop = "No";
		ArrayList<RailwayTicket> Passengers = new ArrayList<RailwayTicket>();
		
		while(stop.equalsIgnoreCase("No")){
			Passengers.add(new RailwayTicket());
			Passengers.get(cnt).accept();
			Passengers.get(cnt).update();
			Passengers.get(cnt).display();
			cnt++;
			System.out.print("\n" + "Quit ? "); stop = sc.nextLine(); System.out.println();
		}
	}
}

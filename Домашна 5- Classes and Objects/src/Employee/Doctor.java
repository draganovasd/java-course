package Employee;

public class Doctor extends Employee {
	private int nightShifts;
    private int dayShifts;

public Doctor(){
	super();
	this.nightShifts=0;
	this.dayShifts=0;
}

public Doctor(int nightShift, int dayShift, int salary, int workHours){
	super(salary,workHours);
	
	setNightShift(nightShift);
	setDayShift(dayShift);
}
public void setNightShift(int nightShift){
	this.nightShifts=nightShift;
}
public int getNightShift(int nightShift){
	return this.nightShifts;
}
public void setDayShift(int dayShift){
	this.dayShifts=dayShift;
}
public int getDayShift(int dayShift){
	return this.dayShifts;
}

public void printShifts(){
	System.out.println("Total day shifts: "+this.dayShifts);
	System.out.println("Total night shifts: "+this.nightShifts);
}
public static void main(String[] args) {
	Doctor MyDoctor= new Doctor(15,10, 160, 2300);
	MyDoctor.printShifts();
	MyDoctor.print();
	

}



}

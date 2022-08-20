package Revision.Constructor;

public class Patient {

	int patient_id;
	String p_name;
	String p_deseace;
	public
		Patient()
		{
			patient_id=0;
			p_name="";
			p_deseace="";
		}
		Patient(int patient_id,String p_name,String p_deseace)
		{
			this.patient_id=patient_id;
			this.p_name=p_name;
			this.p_deseace=p_deseace;
		}
		Patient(Patient obj)
		{
			patient_id=obj.patient_id;
			p_name=obj.p_name;
			p_deseace=obj.p_deseace;
		}
		public String toString()
		{
			return("Patient id : "+patient_id+" Patient name : "+p_name+" Patient Deseace : "+p_deseace);
		}
	public static void main(String[] args) {
		
		Patient p=new Patient();
		p.patient_id=1;
		p.p_name="one";
		p.p_deseace="corona";
		System.out.println("Default constructor : \n "+p.toString());

	}

}

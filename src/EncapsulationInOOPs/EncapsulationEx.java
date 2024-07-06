package EncapsulationInOOPs;

public class EncapsulationEx {
	
	
		
		private int  empId;
		
		public int getEpmpId() {
			return empId;
		}
		
		public void setEmpId(int emp) {
			this.empId=emp;
		}

		
	
	

	public static void main(String[] args) {

		EncapsulationEx obj = new EncapsulationEx();
		obj.setEmpId(121);
		System.out.println(obj.getEpmpId());
		
		
		
	}

}

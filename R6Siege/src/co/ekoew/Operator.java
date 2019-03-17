package co.ekoew;

//Bean or Model or POJO
public class Operator {
	
	//Attributes
	int opid;
	String opcodename;
	String opname;
	String opctu;
	Stats stats;
	
	//Methods
	public Operator() {
		System.out.println("---Object Constructed---");
	}
	
	//Constructor Injection
	public Operator(Stats stats) {
		this.stats = stats;
	}

	public int getOpid() {
		return opid;
	}

	public void setOpid(int opid) {
		this.opid = opid;
	}

	public String getOpcodename() {
		return opcodename;
	}

	public void setOpcodename(String opcodename) {
		this.opcodename = opcodename;
	}

	public String getOpname() {
		return opname;
	}

	public void setOpname(String opname) {
		this.opname = opname;
	}

	public String getOpctu() {
		return opctu;
	}

	public void setOpctu(String opctu) {
		this.opctu = opctu;
	}

	public Stats getStats() {
		return stats;
	}

	//Setter Injection
	public void setStats(Stats stats) {
		this.stats = stats;
	}
	
	public void myInit() {
		System.out.println("---Object Initialized---");
	}
	
	public void myDest() {
		System.out.println("---Object Destroyed---");
	}

	@Override
	public String toString() {
		return "Operator [opid=" + opid + ", opcodename=" + opcodename + ", opname=" + opname + ", opctu=" + opctu
				+ ", stats=" + stats + "]";
	}
			
}

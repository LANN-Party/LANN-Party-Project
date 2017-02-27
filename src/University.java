/**
 * 
 */

/**
 * @author ajmcintyre
 *
 */
public class University {

	/**
	 * 
	 */
	private String state, name, location, control;
	private int percentFemale, SATVerbal, SATMath, expenses, percentFinancialAid,
	numOfApplicants, percentAdmitted, percentEnrolled, academicScale, socialScale, qualityOfLife;
	private String[] emphases;
	
	/**
	 * @param state
	 * @param name
	 * @param location
	 * @param control
	 * @param percentFemale
	 * @param sATVerbal
	 * @param sATMath
	 * @param expenses
	 * @param percentFinancialAid
	 * @param numOfApplicants
	 * @param percentAdmitted
	 * @param percentEnrolled
	 * @param academicScale
	 * @param socialScale
	 * @param qualityOfLife
	 * @param emphases
	 */
	public University(String state, String name, String location, String control, int percentFemale, int sATVerbal,
			int sATMath, int expenses, int percentFinancialAid, int numOfApplicants, int percentAdmitted,
			int percentEnrolled, int academicScale, int socialScale, int qualityOfLife, String[] emphases) {
		super();
		this.state = state;
		this.name = name;
		this.location = location;
		this.control = control;
		this.percentFemale = percentFemale;
		SATVerbal = sATVerbal;
		SATMath = sATMath;
		this.expenses = expenses;
		this.percentFinancialAid = percentFinancialAid;
		this.numOfApplicants = numOfApplicants;
		this.percentAdmitted = percentAdmitted;
		this.percentEnrolled = percentEnrolled;
		this.academicScale = academicScale;
		this.socialScale = socialScale;
		this.qualityOfLife = qualityOfLife;
		this.emphases = emphases;
	}
	
	public University() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/**
	 * @return the control
	 */
	public String getControl() {
		return control;
	}

	/**
	 * @param control the control to set
	 */
	public void setControl(String control) {
		this.control = control;
	}

	/**
	 * @return the percentFemale
	 */
	public int getPercentFemale() {
		return percentFemale;
	}

	/**
	 * @param percentFemale the percentFemale to set
	 */
	public void setPercentFemale(int percentFemale) {
		this.percentFemale = percentFemale;
	}

	/**
	 * @return the sATVerbal
	 */
	public int getSATVerbal() {
		return SATVerbal;
	}

	/**
	 * @param sATVerbal the sATVerbal to set
	 */
	public void setSATVerbal(int sATVerbal) {
		SATVerbal = sATVerbal;
	}

	/**
	 * @return the sATMath
	 */
	public int getSATMath() {
		return SATMath;
	}

	/**
	 * @param sATMath the sATMath to set
	 */
	public void setSATMath(int sATMath) {
		SATMath = sATMath;
	}

	/**
	 * @return the expenses
	 */
	public int getExpenses() {
		return expenses;
	}

	/**
	 * @param expenses the expenses to set
	 */
	public void setExpenses(int expenses) {
		this.expenses = expenses;
	}

	/**
	 * @return the percentFinancialAid
	 */
	public int getPercentFinancialAid() {
		return percentFinancialAid;
	}

	/**
	 * @param percentFinancialAid the percentFinancialAid to set
	 */
	public void setPercentFinancialAid(int percentFinancialAid) {
		this.percentFinancialAid = percentFinancialAid;
	}

	/**
	 * @return the numOfApplicants
	 */
	public int getNumOfApplicants() {
		return numOfApplicants;
	}

	/**
	 * @param numOfApplicants the numOfApplicants to set
	 */
	public void setNumOfApplicants(int numOfApplicants) {
		this.numOfApplicants = numOfApplicants;
	}

	/**
	 * @return the percentAdmitted
	 */
	public int getPercentAdmitted() {
		return percentAdmitted;
	}

	/**
	 * @param percentAdmitted the percentAdmitted to set
	 */
	public void setPercentAdmitted(int percentAdmitted) {
		this.percentAdmitted = percentAdmitted;
	}

	/**
	 * @return the percentEnrolled
	 */
	public int getPercentEnrolled() {
		return percentEnrolled;
	}

	/**
	 * @param percentEnrolled the percentEnrolled to set
	 */
	public void setPercentEnrolled(int percentEnrolled) {
		this.percentEnrolled = percentEnrolled;
	}

	/**
	 * @return the academicScale
	 */
	public int getAcademicScale() {
		return academicScale;
	}

	/**
	 * @param academicScale the academicScale to set
	 */
	public void setAcademicScale(int academicScale) {
		this.academicScale = academicScale;
	}

	/**
	 * @return the socialScale
	 */
	public int getSocialScale() {
		return socialScale;
	}

	/**
	 * @param socialScale the socialScale to set
	 */
	public void setSocialScale(int socialScale) {
		this.socialScale = socialScale;
	}

	/**
	 * @return the qualityOfLife
	 */
	public int getQualityOfLife() {
		return qualityOfLife;
	}

	/**
	 * @param qualityOfLife the qualityOfLife to set
	 */
	public void setQualityOfLife(int qualityOfLife) {
		this.qualityOfLife = qualityOfLife;
	}

	/**
	 * @return the emphases
	 */
	public String[] getEmphases() {
		return emphases;
	}

	/**
	 * @param emphases the emphases to set
	 */
	public void setEmphases(String[] emphases) {
		this.emphases = emphases;
	}

}

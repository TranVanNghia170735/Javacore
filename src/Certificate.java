
public class Certificate {
	private int certificatedID;
	private String certificateName;
	private String certificateRank;
	private String certificatedDate;
	
	
	public Certificate() {
		super();
	}
	
	public Certificate(int certificatedID, String certificateName, String certificateRank, String certificatedDate) {
		super();
		this.certificatedID = certificatedID;
		this.certificateName = certificateName;
		this.certificateRank = certificateRank;
		this.certificatedDate = certificatedDate;
	}

	public int getCertificatedID() {
		return certificatedID;
	}

	public String getCertificateName() {
		return certificateName;
	}

	public String getCertificateRank() {
		return certificateRank;
	}

	public String getCertificatedDate() {
		return certificatedDate;
	}

	public void setCertificatedID(int certificatedID) {
		this.certificatedID = certificatedID;
	}

	public void setCertificateName(String certificateName) {
		this.certificateName = certificateName;
	}

	public void setCertificateRank(String certificateRank) {
		this.certificateRank = certificateRank;
	}

	public void setCertificatedDate(String certificatedDate) {
		this.certificatedDate = certificatedDate;
	}
	
	


	
	
	
	
	
	

}

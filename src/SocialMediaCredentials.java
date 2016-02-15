
public class SocialMediaCredentials {

	private String socialMediaId;
	private String socialMediaType;
	public String getSocialMediaId() {
		return socialMediaId;
	}
	public void setSocialMediaId(String socialMediaId) {
		this.socialMediaId = socialMediaId;
	}
	public String getSocialMediaType() {
		return socialMediaType;
	}
	public void setSocialMediaType(String socialMediaType) {
		this.socialMediaType = socialMediaType;
	}
	
	 @Override
	    public boolean equals(Object obj) {
	        if(obj != null && obj instanceof SocialMediaCredentials) {
	        	SocialMediaCredentials s = (SocialMediaCredentials)obj;
	            return socialMediaId.equals(s.socialMediaId) && socialMediaType.equals(s.socialMediaType);
	        }
	        return false;
	    }

	    @Override
	    public int hashCode() {
	        return (socialMediaId + socialMediaType).hashCode();
	    }
	
	
	
}

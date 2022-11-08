
/**
 * Class: TVShow Starter class for ITEC 2150 Homework 4
 * 
 * @author cjohns25
 *
 */
 public class TVShow implements Comparable<TVShow>
{
	private String showName;
	private String streamingService;

	/**
	 * no arg constructor
	 **/
	public TVShow()
	{
		showName = "unknown";
		streamingService = "unknown";
	}

	/**
	 * Two argument constructor
	 * 
	 * @param showName
	 * @param streamingService
	 */
	public TVShow(String showName, String streamingService)
	{
		super();
		this.showName = showName;
		this.streamingService = streamingService;
	}

	/**
	 * Getter method for showName
	 * 
	 * @return the showName
	 */
	public String getShowName()
	{
		
		return showName;
	}

	/**
	 * Setter method for show name
	 * 
	 * @param showName the showName to set
	 */
	public void setShowName(String showName)
	{
		this.showName = showName;
	}

	/**
	 * Getter method for streamingService
	 * 
	 * @return the streamingService
	 */
	public String getStreamingService()
	{
		return streamingService;
	}

	/**
	 * Setter method for streamingService
	 * 
	 * @param streamingService the streamingService to set
	 */
	public void setStreamingService(String streamingService)
	{
		this.streamingService = streamingService;
	}

	/**
	 * toString method
	 * 
	 * @return String
	 */
	@Override
	public String toString()
	{
		return "TVShow [showName=" + showName + ", streamingService=" + streamingService + "]";
	}
    @Override
    public int compareTo(TVShow other) {
        if (streamingService.equals(other.streamingService)) {
            return showName.compareTo(other.showName);
        }
        else {
            return streamingService.compareTo(other.streamingService);
        }
    }

}

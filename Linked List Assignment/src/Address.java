
public class Address implements Comparable<Address>
{
    private String name;
    private String streetAddress;
    private String city;

    /**
     * Method: Address
     * Create and initialize  the instance of Address
     */
    public Address()
    {
        name = "Fred Flintstone";
        streetAddress = "222 Rocky Way";
        city = "Bedrock";
    }

    /**
     * Method: Address
     * Create and initialize  the instance of Address
     * @param name
     * @param streetAddress
     * @param city
     */
    public Address(String name, String streetAddress, String city)
    {
        this.name = name;
        this.streetAddress = streetAddress;
        this.city = city;
    }

    /**Method: getName
     * @return the name
     */
    public String getName()
    {
        return name;
    }

    /** Method: setName
     * @param name the name to set
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**Method: getStreetAddress
     * @return the streetAddress
     */
    public String getStreetAddress()
    {
        return streetAddress;
    }

    /** Method: setStreetAddress
     * @param streetAddress the streetAddress to set
     */
    public void setStreetAddress(String streetAddress)
    {
        this.streetAddress = streetAddress;
    }

    /**Method: getCity
     * @return the city
     */
    public String getCity()
    {
        return city;
    }

    /** Method: setCity
     * @param city the city to set
     */
    public void setCity(String city)
    {
        this.city = city;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "Address - name = " + name + ", streetAddress = " + streetAddress
                + ", city = " + city;
    }

    @Override
    public int compareTo(Address o)
    {
        return name.compareTo(o.getName());
    }
}

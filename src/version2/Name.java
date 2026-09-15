package version2;

public class Name {

    private String firstName;
    private String lastName;
    private String middleName;
    private String suffix;

    Name(){
        this.firstName = "N/A";
        this.middleName = "N/A";
        this.lastName = "N/A";
        this.suffix = "";
    }

    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = "N/A";
        this.suffix = "";
    }

    public Name(String firstName, String lastName, String middleName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.suffix = "";
    }

    public Name(String firstName, String lastName, String middleName, String suffix) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.suffix = suffix;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public void displayName(){
        StringBuilder sb = new StringBuilder();

        sb.append(lastName, );
        sb.append(firstName );
        sb.append(middleName.charAt(0));

        sb.toString();
    }

    @Override
    public String toString() {
        return String.format("%s, %s %c. %s.", lastName, firstName, middleName.charAt(0), suffix);
    }

}

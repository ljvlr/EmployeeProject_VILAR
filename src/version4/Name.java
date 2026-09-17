package version4;

import java.util.Objects;

public class Name implements Cloneable {

    private String firstName;
    private String lastName;
    private String middleName;
    private String suffix;

    public Name() {
        this.firstName = "N/A";
        this.middleName = "N/A";
        this.lastName = "N/A";
        this.suffix = "";
    }

    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = "";
        this.suffix = "";
    }

    public Name(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.suffix = "";
    }

    public Name(String firstName, String middleName, String lastName, String suffix) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
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

    public void displayName() {
        if (middleName.isEmpty() && suffix.isEmpty()) {
            System.out.println(String.format("%s, %s", lastName, firstName));
        } else if (middleName.isEmpty()) {
            System.out.println(String.format("%s, %s %s", lastName, firstName, suffix));
        } else if (suffix.isEmpty()) {
            System.out.println(String.format("%s, %s %c.", lastName, firstName, middleName.charAt(0)));
        } else {
            System.out.println(String.format("%s, %s %c. %s",
                    lastName, firstName, middleName.charAt(0), suffix));
        }
    }

    @Override
    public String toString() {
        if (middleName.isEmpty() && suffix.isEmpty()) {
            return String.format("%s, %s", lastName, firstName);
        } else if (middleName.isEmpty()) {
            return String.format("%s, %s %s", lastName, firstName, suffix);
        } else if (suffix.isEmpty()) {
            return String.format("%s, %s %c.", lastName, firstName, middleName.charAt(0));
        } else {
            return String.format("%s, %s %c. %s",
                    lastName, firstName, middleName.charAt(0), suffix);
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Name)) {
            return false;
        }

        Name other = (Name) obj;

        return Objects.equals(firstName, other.firstName)
                && Objects.equals(middleName, other.middleName)
                && Objects.equals(lastName, other.lastName)
                && Objects.equals(suffix, other.suffix);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, middleName, lastName, suffix);
    }

    @Override
    public Name clone() {
        try {
            return (Name) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
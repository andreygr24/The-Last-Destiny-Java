package model;

public class Apply {

    private final String name;
    private final String email;
    private final String country;
    private final String mainCharacter;
    private final String role;
    private final String spec;
    private final String tellMeAboutYourSelf;
    private final int age;

    public Apply(String name, String email, String country, int age, String mainCharacter, String role, String spec, String tellMeAboutYourSelf){


        if (name == null || name.trim().isEmpty()) {
        throw new IllegalArgumentException("Please enter a valid Name.");
    }

    if (email == null || email.trim().isEmpty() || !email.contains("@")){
        throw new IllegalArgumentException("Please enter a valid Email");
    }

    if (age < 15){
        throw new IllegalArgumentException("You must be 15+");
    }

    if ( mainCharacter == null || mainCharacter.trim().isEmpty())
        throw new IllegalArgumentException("Please enter a valid Main Character");

    if ( spec == null || spec.trim().isEmpty())
            throw new IllegalArgumentException("Please enter a valid Spec");


    if ( role == null || role.trim().isEmpty())
            throw new IllegalArgumentException("Please enter a correct Role");


        if ( tellMeAboutYourSelf == null || tellMeAboutYourSelf.trim().isEmpty())
            throw new IllegalArgumentException("Please tell us about Yourself");

        this.spec = spec;
        this.tellMeAboutYourSelf = tellMeAboutYourSelf;
        this.role = role;
        this.mainCharacter = mainCharacter;
        this.name = name;
        this.email = email;
        this.country = country;
        this.age = age;
    }

    public String getName() {return name;}

    public int getAge() {return age;}

    public String getCountry() {return country;}

    public String getEmail() {return email;}

    public String getMainCharacter() {return mainCharacter;}

    public String getRole() {return role;}

    public String getSpec() {return spec;}

    public String getTellMeAboutYourSelf() {return tellMeAboutYourSelf;}
}

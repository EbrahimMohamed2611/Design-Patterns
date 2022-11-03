package designPatterns.behaviuoral.specification;

import java.util.Set;

public class CV {
    private String firstName;
    private String secondName;
    private int age;
    private Set<String> programmingLanguages;
    private Set<String> skills;
    private Set<String> concepts;

    public CV() {
    }

    public CV(String firstName, String secondName, int age, Set<String> programmingLanguages, Set<String> skills, Set<String> concepts) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.programmingLanguages = programmingLanguages;
        this.skills = skills;
        this.concepts = concepts;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Set<String> getProgrammingLanguages() {
        return programmingLanguages;
    }

    public void setProgrammingLanguages(Set<String> programmingLanguages) {
        this.programmingLanguages = programmingLanguages;
    }

    public Set<String> getSkills() {
        return skills;
    }

    public void setSkills(Set<String> skills) {
        this.skills = skills;
    }

    public Set<String> getConcepts() {
        return concepts;
    }

    public void setConcepts(Set<String> concepts) {
        this.concepts = concepts;
    }
}

public class student extends person {
    private int grade;
    private int sectionCount;
    private section[] sections = new section[10];

    public student(String name, int id, int grade){ super(name,id); this.grade = grade;}
    public int getGrade(){ return this.grade;}
    public void setGrade(int g){ this.grade = g;}
    public void addSection(section s){
        this.sections[sectionCount] = s;
        this.sectionCount++;
    }
    public section[] getSection(){
        return this.sections;
    }
}

public class school {
    private String name;
    private section[] sections = new section[200];
    private int sectionCount = 0;

    public school(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String n){
        this.name = n;
    }
    public void addSection(section s){
        this.sections[sectionCount] = s;
        this.sectionCount++;
    }
    public section[] getSections(){
        return this.sections;
    }

}

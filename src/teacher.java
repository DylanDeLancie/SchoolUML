public class teacher extends person{
    private String subject;
    private int sectionCount = 0;
    private section[] sections = new section[10];

    public teacher(String subject, String name, int id){
        super(name,id);
        this.subject = subject;
    }

    public String getSubject(){return this.subject;}
    public void setSubject(String s){this.subject = s;}
    public void addSection(section s){sections[sectionCount] = s; sectionCount++;}
    public section[] getSections(){return this.sections;}
}

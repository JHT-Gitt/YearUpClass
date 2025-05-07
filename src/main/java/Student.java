public class Student extends Person {
    private int id;
    private String github;
    private String linkedin;
    private String codingNickname;
    private String codewarsxpoints;
    private String imageUrl;
    private String deviceType;
    private int pageNumberWb;
    private String currentlyWorkingOn;

//    public Student(String firstname, String lastname, String email, String gender, String github, String linkedin, String nickname,
//                   String imageurl, String device, String currentlyWorkingOn) {
//        super(firstname, lastname, email, gender);
//        this.github = github;
//        this.linkedin = linkedin;
//        this.imageUrl = imageurl;
//        this.deviceType = device;
//        this.currentlyWorkingOn = currentlyWorkingOn;
//    }
    public Student(){

    }

    public Student(int id,String firstName, String lastName,
                   String email, String gender,
                   String github, String linkedin,
                   String codingNickname, String codewarsxpoints,
                   String imageUrl, String deviceType,
                   int pageNumberWb, String currentlyWorkingOn) {
        super(firstName, lastName, email, gender);
        this.github = github;
        this.linkedin = linkedin;
        this.codingNickname = codingNickname;
        this.codewarsxpoints = codewarsxpoints;
        this.imageUrl = imageUrl;
        this.deviceType = deviceType;
        this.pageNumberWb = pageNumberWb;
        this.currentlyWorkingOn = currentlyWorkingOn;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    public String getCodingNickname() {
        return codingNickname;
    }

    public void setCodingNickname(String codingNickname) {
        this.codingNickname = codingNickname;
    }

    public String getCodewarsxpoints() {
        return codewarsxpoints;
    }

    public void setCodewarsxpoints(String codewarsxpoints) {
        this.codewarsxpoints = codewarsxpoints;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public int getPageNumberWb() {
        return pageNumberWb;
    }

    public void setPageNumberWb(int pageNumberWb) {
        this.pageNumberWb = pageNumberWb;
    }

    public String getCurrentlyWorkingOn() {
        return currentlyWorkingOn;
    }

    public void setCurrentlyWorkingOn(String currentlyWorkingOn) {
        this.currentlyWorkingOn = currentlyWorkingOn;
    }
}
